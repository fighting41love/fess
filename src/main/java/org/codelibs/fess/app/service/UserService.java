/*
 * Copyright 2009-2015 the CodeLibs Project and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */

package org.codelibs.fess.app.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.codelibs.core.beans.util.BeanUtil;
import org.codelibs.fess.app.pager.UserPager;
import org.codelibs.fess.crud.CommonConstants;
import org.codelibs.fess.crud.CrudMessageException;
import org.codelibs.fess.es.cbean.UserCB;
import org.codelibs.fess.es.exbhv.UserBhv;
import org.codelibs.fess.es.exentity.User;
import org.dbflute.cbean.result.PagingResultBean;

public class UserService implements Serializable {

    private static final long serialVersionUID = 1L;

    @Resource
    protected UserBhv userBhv;

    public UserService() {
        super();
    }

    public List<User> getUserList(final UserPager userPager) {

        final PagingResultBean<User> userList = userBhv.selectPage(cb -> {
            cb.paging(userPager.getPageSize(), userPager.getCurrentPageNumber());
            setupListCondition(cb, userPager);
        });

        // update pager
        BeanUtil.copyBeanToBean(userList, userPager, option -> option.include(CommonConstants.PAGER_CONVERSION_RULE));
        userPager.setPageNumberList(userList.pageRange(op -> {
            op.rangeSize(5);
        }).createPageNumberList());

        return userList;
    }

    public User getUser(final Map<String, String> keys) {
        final User user = userBhv.selectEntity(cb -> {
            cb.query().docMeta().setId_Equal(keys.get("id"));
            setupEntityCondition(cb, keys);
        }).orElse(null);//TODO
        if (user == null) {
            // TODO exception?
            return null;
        }

        return user;
    }

    public void store(final User user) throws CrudMessageException {
        setupStoreCondition(user);

        userBhv.insertOrUpdate(user, op -> {
            op.setRefresh(true);
        });

    }

    public void delete(final User user) throws CrudMessageException {
        setupDeleteCondition(user);

        userBhv.delete(user, op -> {
            op.setRefresh(true);
        });

    }

    protected void setupListCondition(final UserCB cb, final UserPager userPager) {
        if (userPager.id != null) {
            cb.query().docMeta().setId_Equal(userPager.id);
        }
        // TODO Long, Integer, String supported only.

        // setup condition
        cb.query().addOrderBy_Name_Asc();

        // search

    }

    protected void setupEntityCondition(final UserCB cb, final Map<String, String> keys) {

        // setup condition

    }

    protected void setupStoreCondition(final User user) {

        // setup condition

    }

    protected void setupDeleteCondition(final User user) {

        // setup condition

    }

    public List<User> getAvailableUserList() {
        return userBhv.selectList(cb -> {
            cb.query().matchAll();
        });
    }

}
