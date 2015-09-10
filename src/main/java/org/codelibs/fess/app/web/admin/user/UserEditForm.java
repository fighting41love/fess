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

package org.codelibs.fess.app.web.admin.user;

import java.io.Serializable;

/**
 * @author shinsuke
 */
public class UserEditForm implements Serializable {

    private static final long serialVersionUID = 1L;

    //@IntegerType
    public int crudMode;

    //@Required(target = "confirmfromupdate,update,delete")
    //@Maxbytelength(maxbytelength = 1000)
    public String id;

    //@Required(target = "confirmfromcreate,create,confirmfromupdate,update,delete")
    //@Maxbytelength(maxbytelength = 100)
    public String name;

    //@Maxbytelength(maxbytelength = 100)
    public String password;

    //@Maxbytelength(maxbytelength = 100)
    public String confirmPassword;

    public String[] roles;

    public String[] groups;

    //@Required(target = "confirmfromupdate,update,delete")
    //@IntegerType
    public String versionNo;

    public void initialize() {
        id = null;
        name = null;
        roles = null;
        groups = null;
        versionNo = null;
    }
}
