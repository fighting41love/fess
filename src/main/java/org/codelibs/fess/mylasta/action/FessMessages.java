package org.codelibs.fess.mylasta.action;

import org.lastaflute.web.ruts.message.ActionMessage;

/**
 * The keys for message.
 * @author FreeGen
 */
public class FessMessages extends FessLabels {

    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    /** The key of the message: must be false */
    public static final String CONSTRAINTS_AssertFalse_MESSAGE = "{constraints.AssertFalse.message}";

    /** The key of the message: must be true */
    public static final String CONSTRAINTS_AssertTrue_MESSAGE = "{constraints.AssertTrue.message}";

    /** The key of the message: must be less than ${inclusive == true ? 'or equal to ' : ''}{value} */
    public static final String CONSTRAINTS_DecimalMax_MESSAGE = "{constraints.DecimalMax.message}";

    /** The key of the message: must be greater than ${inclusive == true ? 'or equal to ' : ''}{value} */
    public static final String CONSTRAINTS_DecimalMin_MESSAGE = "{constraints.DecimalMin.message}";

    /** The key of the message: numeric value out of bounds (<{integer} digits>.<{fraction} digits> expected) */
    public static final String CONSTRAINTS_Digits_MESSAGE = "{constraints.Digits.message}";

    /** The key of the message: must be in the future */
    public static final String CONSTRAINTS_Future_MESSAGE = "{constraints.Future.message}";

    /** The key of the message: must be less than or equal to {value} */
    public static final String CONSTRAINTS_Max_MESSAGE = "{constraints.Max.message}";

    /** The key of the message: must be greater than or equal to {value} */
    public static final String CONSTRAINTS_Min_MESSAGE = "{constraints.Min.message}";

    /** The key of the message: may not be null */
    public static final String CONSTRAINTS_NotNull_MESSAGE = "{constraints.NotNull.message}";

    /** The key of the message: must be null */
    public static final String CONSTRAINTS_Null_MESSAGE = "{constraints.Null.message}";

    /** The key of the message: must be in the past */
    public static final String CONSTRAINTS_Past_MESSAGE = "{constraints.Past.message}";

    /** The key of the message: must match "{regexp}" */
    public static final String CONSTRAINTS_Pattern_MESSAGE = "{constraints.Pattern.message}";

    /** The key of the message: size must be between {min} and {max} */
    public static final String CONSTRAINTS_Size_MESSAGE = "{constraints.Size.message}";

    /** The key of the message: invalid credit card number */
    public static final String CONSTRAINTS_CreditCardNumber_MESSAGE = "{constraints.CreditCardNumber.message}";

    /** The key of the message: invalid {type} barcode */
    public static final String CONSTRAINTS_EAN_MESSAGE = "{constraints.EAN.message}";

    /** The key of the message: not a well-formed email address */
    public static final String CONSTRAINTS_Email_MESSAGE = "{constraints.Email.message}";

    /** The key of the message: length must be between {min} and {max} */
    public static final String CONSTRAINTS_Length_MESSAGE = "{constraints.Length.message}";

    /** The key of the message: The check digit for ${value} is invalid, Luhn Modulo 10 checksum failed */
    public static final String CONSTRAINTS_LuhnCheck_MESSAGE = "{constraints.LuhnCheck.message}";

    /** The key of the message: The check digit for ${value} is invalid, Modulo 10 checksum failed */
    public static final String CONSTRAINTS_Mod10Check_MESSAGE = "{constraints.Mod10Check.message}";

    /** The key of the message: The check digit for ${value} is invalid, Modulo 11 checksum failed */
    public static final String CONSTRAINTS_Mod11Check_MESSAGE = "{constraints.Mod11Check.message}";

    /** The key of the message: The check digit for ${value} is invalid, ${modType} checksum failed */
    public static final String CONSTRAINTS_ModCheck_MESSAGE = "{constraints.ModCheck.message}";

    /** The key of the message: may not be empty */
    public static final String CONSTRAINTS_NotBlank_MESSAGE = "{constraints.NotBlank.message}";

    /** The key of the message: may not be empty */
    public static final String CONSTRAINTS_NotEmpty_MESSAGE = "{constraints.NotEmpty.message}";

    /** The key of the message: script expression "{script}" didn't evaluate to true */
    public static final String CONSTRAINTS_ParametersScriptAssert_MESSAGE = "{constraints.ParametersScriptAssert.message}";

    /** The key of the message: must be between {min} and {max} */
    public static final String CONSTRAINTS_Range_MESSAGE = "{constraints.Range.message}";

    /** The key of the message: may have unsafe html content */
    public static final String CONSTRAINTS_SafeHtml_MESSAGE = "{constraints.SafeHtml.message}";

    /** The key of the message: script expression "{script}" didn't evaluate to true */
    public static final String CONSTRAINTS_ScriptAssert_MESSAGE = "{constraints.ScriptAssert.message}";

    /** The key of the message: must be a valid URL */
    public static final String CONSTRAINTS_URL_MESSAGE = "{constraints.URL.message}";

    /** The key of the message: is required */
    public static final String CONSTRAINTS_Required_MESSAGE = "{constraints.Required.message}";

    /** The key of the message: could not login */
    public static final String ERRORS_LOGIN_FAILURE = "{errors.login.failure}";

    /** The key of the message: retry because of illegal transition */
    public static final String ERRORS_APP_ILLEGAL_TRANSITION = "{errors.app.illegal.transition}";

    /** The key of the message: others might be updated, so retry */
    public static final String ERRORS_APP_DB_ALREADY_DELETED = "{errors.app.db.already.deleted}";

    /** The key of the message: others might be updated, so retry */
    public static final String ERRORS_APP_DB_ALREADY_UPDATED = "{errors.app.db.already.updated}";

    /** The key of the message: already existing data, so retry */
    public static final String ERRORS_APP_DB_ALREADY_EXISTS = "{errors.app.db.already.exists}";

    /** The key of the message: <div class="alert"><button type="button" class="close" data-dismiss="alert">×</button> */
    public static final String ERRORS_front_header = "{errors.front_header}";

    /** The key of the message: </div> */
    public static final String ERRORS_front_footer = "{errors.front_footer}";

    /** The key of the message: <div> */
    public static final String ERRORS_front_prefix = "{errors.front_prefix}";

    /** The key of the message: </div> */
    public static final String ERRORS_front_suffix = "{errors.front_suffix}";

    /** The key of the message: <div class="alert-message error"> */
    public static final String ERRORS_HEADER = "{errors.header}";

    /** The key of the message: </div> */
    public static final String ERRORS_FOOTER = "{errors.footer}";

    /** The key of the message: <p> */
    public static final String ERRORS_PREFIX = "{errors.prefix}";

    /** The key of the message: </p> */
    public static final String ERRORS_SUFFIX = "{errors.suffix}";

    /** The key of the message: {0} is invalid. */
    public static final String ERRORS_INVALID = "{errors.invalid}";

    /** The key of the message: {0} can not be greater than {1} characters. */
    public static final String ERRORS_MAXLENGTH = "{errors.maxlength}";

    /** The key of the message: {0} can not be less than {1} characters. */
    public static final String ERRORS_MINLENGTH = "{errors.minlength}";

    /** The key of the message: {0} can not be greater than {1} bytes. */
    public static final String ERRORS_MAXBYTELENGTH = "{errors.maxbytelength}";

    /** The key of the message: {0} can not be less than {1} bytes. */
    public static final String ERRORS_MINBYTELENGTH = "{errors.minbytelength}";

    /** The key of the message: {0} is not in the range {1} through {2}. */
    public static final String ERRORS_RANGE = "{errors.range}";

    /** The key of the message: {0} is required. */
    public static final String ERRORS_REQUIRED = "{errors.required}";

    /** The key of the message: {0} must be an byte. */
    public static final String ERRORS_BYTE = "{errors.byte}";

    /** The key of the message: {0} is not a date. */
    public static final String ERRORS_DATE = "{errors.date}";

    /** The key of the message: {0} must be an double. */
    public static final String ERRORS_DOUBLE = "{errors.double}";

    /** The key of the message: {0} must be an float. */
    public static final String ERRORS_FLOAT = "{errors.float}";

    /** The key of the message: {0} must be an integer. */
    public static final String ERRORS_INTEGER = "{errors.integer}";

    /** The key of the message: {0} must be an long. */
    public static final String ERRORS_LONG = "{errors.long}";

    /** The key of the message: {0} must be an short. */
    public static final String ERRORS_SHORT = "{errors.short}";

    /** The key of the message: {0} is not a valid credit card number. */
    public static final String ERRORS_CREDITCARD = "{errors.creditcard}";

    /** The key of the message: {0} is an invalid e-mail address. */
    public static final String ERRORS_EMAIL = "{errors.email}";

    /** The key of the message: {0} is an invalid url (web address). */
    public static final String ERRORS_URL = "{errors.url}";

    /** The key of the message: {0} is a invalid format. */
    public static final String ERRORS_CRONEXPRESSION = "{errors.cronexpression}";

    /** The key of the message: {0} is a invalid uri. */
    public static final String ERRORS_URITYPE = "{errors.uritype}";

    /** The key of the message: {0} must be alphabet or digit only. */
    public static final String ERRORS_ALPHA_DIGIT_ONLY = "{errors.alphaDigitOnly}";

    /** The key of the message: {0} must be alphabet, digit, or space only. */
    public static final String ERRORS_ALPHA_DIGIT_SPACE_ONLY = "{errors.alphaDigitSpaceOnly}";

    /** The key of the message: Invalid request. */
    public static final String ERRORS_TOKEN = "{errors.token}";

    /** The key of the message: Failed to update parameters. Please contact to a site administrator. */
    public static final String ERRORS_failed_to_update_crawler_params = "{errors.failed_to_update_crawler_params}";

    /** The key of the message: Failed to update parameters. Please contact to a site administrator. */
    public static final String ERRORS_failed_to_update_web_crawler_params = "{errors.failed_to_update_web_crawler_params}";

    /** The key of the message: Failed to update parameters. Please contact to a site administrator. */
    public static final String ERRORS_failed_to_update_solr_params = "{errors.failed_to_update_solr_params}";

    /** The key of the message: Username or Password is not correct. */
    public static final String ERROR_login_error = "{error.login_error}";

    /** The key of the message: Failed to commit index. */
    public static final String ERRORS_failed_to_commit_solr_index = "{errors.failed_to_commit_solr_index}";

    /** The key of the message: Failed to optimize index. */
    public static final String ERRORS_failed_to_optimize_solr_index = "{errors.failed_to_optimize_solr_index}";

    /** The key of the message: Failed to delete index. */
    public static final String ERRORS_failed_to_delete_solr_index = "{errors.failed_to_delete_solr_index}";

    /** The key of the message: Failed to start a process because of running solr process. */
    public static final String ERRORS_failed_to_start_solr_process_because_of_running =
            "{errors.failed_to_start_solr_process_because_of_running}";

    /** The key of the message: Failed to restore data. */
    public static final String ERRORS_failed_to_import_data = "{errors.failed_to_import_data}";

    /** The key of the message: Unknown file type. */
    public static final String ERRORS_unknown_import_file = "{errors.unknown_import_file}";

    /** The key of the message: Failed to backup data. */
    public static final String ERRORS_failed_to_export_data = "{errors.failed_to_export_data}";

    /** The key of the message: Could not find {0}. */
    public static final String ERRORS_could_not_find_log_file = "{errors.could_not_find_log_file}";

    /** The key of the message: No running crawl process. */
    public static final String ERRORS_no_running_crawl_process = "{errors.no_running_crawl_process}";

    /** The key of the message: Failed to start a crawl process. */
    public static final String ERRORS_failed_to_start_crawl_process = "{errors.failed_to_start_crawl_process}";

    /** The key of the message: Invalid JSP file. */
    public static final String ERRORS_invalid_design_jsp_file_name = "{errors.invalid_design_jsp_file_name}";

    /** The key of the message: JSP file does not exist. */
    public static final String ERRORS_design_jsp_file_does_not_exist = "{errors.design_jsp_file_does_not_exist}";

    /** The key of the message: The file name is not specified. */
    public static final String ERRORS_design_file_name_is_not_found = "{errors.design_file_name_is_not_found}";

    /** The key of the message: Failed to upload an image file. */
    public static final String ERRORS_failed_to_write_design_image_file = "{errors.failed_to_write_design_image_file}";

    /** The key of the message: Failed to update a jsp file. */
    public static final String ERRORS_failed_to_update_jsp_file = "{errors.failed_to_update_jsp_file}";

    /** The key of the message: The file name is invalid. */
    public static final String ERRORS_design_file_name_is_invalid = "{errors.design_file_name_is_invalid}";

    /** The key of the message: The kind of file is unsupported. */
    public static final String ERRORS_design_file_is_unsupported_type = "{errors.design_file_is_unsupported_type}";

    /** The key of the message: Failed to start a solr instance. */
    public static final String ERRORS_failed_to_start_solr_instance = "{errors.failed_to_start_solr_instance}";

    /** The key of the message: Failed to stop a solr instance. */
    public static final String ERRORS_failed_to_stop_solr_instance = "{errors.failed_to_stop_solr_instance}";

    /** The key of the message: Failed to reload a solr instance. */
    public static final String ERRORS_failed_to_reload_solr_instance = "{errors.failed_to_reload_solr_instance}";

    /** The key of the message: Failed to update a crawling schedule. */
    public static final String ERRORS_failed_to_update_crawler_schedule = "{errors.failed_to_update_crawler_schedule}";

    /** The key of the message: Failed to create a crawling config. */
    public static final String ERRORS_failed_to_create_crawling_config_at_wizard = "{errors.failed_to_create_crawling_config_at_wizard}";

    /** The key of the message: This feature is disabled. */
    public static final String ERRORS_design_editor_disabled = "{errors.design_editor_disabled}";

    /** The key of the message: Could not create a search log csv file. */
    public static final String ERRORS_could_not_create_search_log_csv = "{errors.could_not_create_search_log_csv}";

    /** The key of the message: Not Found: {0} */
    public static final String ERRORS_not_found_on_file_system = "{errors.not_found_on_file_system}";

    /** The key of the message: Could not open {0}. <br/>Please check if the file is associated with an application. */
    public static final String ERRORS_could_not_open_on_system = "{errors.could_not_open_on_system}";

    /** The key of the message: The limit of a search time was exceeded. The partial result was displayed. */
    public static final String ERRORS_process_time_is_exceeded = "{errors.process_time_is_exceeded}";

    /** The key of the message: No more results could be displayed. */
    public static final String ERRORS_result_size_exceeded = "{errors.result_size_exceeded}";

    /** The key of the message: {0} file does not exist. */
    public static final String ERRORS_target_file_does_not_exist = "{errors.target_file_does_not_exist}";

    /** The key of the message: Failed to download {0} file. */
    public static final String ERRORS_failed_to_download_file = "{errors.failed_to_download_file}";

    /** The key of the message: Failed to delete {0} file. */
    public static final String ERRORS_failed_to_delete_file = "{errors.failed_to_delete_file}";

    /** The key of the message: Failed to redirect {0}. */
    public static final String ERRORS_failed_to_redirect = "{errors.failed_to_redirect}";

    /** The key of the message: {0} is not supported as encoding. */
    public static final String ERRORS_unsupported_encoding = "{errors.unsupported_encoding}";

    /** The key of the message: Not found Doc ID:{0} */
    public static final String ERRORS_docid_not_found = "{errors.docid_not_found}";

    /** The key of the message: Not found URL of Doc ID:{0} */
    public static final String ERRORS_document_not_found = "{errors.document_not_found}";

    /** The key of the message: Could not load from this server: {0} */
    public static final String ERRORS_not_load_from_server = "{errors.not_load_from_server}";

    /** The key of the message: Failed to start job {0}. */
    public static final String ERRORS_failed_to_start_job = "{errors.failed_to_start_job}";

    /** The key of the message: Failed to stop job {0}. */
    public static final String ERRORS_failed_to_stop_job = "{errors.failed_to_stop_job}";

    /** The key of the message: Expired dictionary information. Please reload it. */
    public static final String ERRORS_expired_dict_id = "{errors.expired_dict_id}";

    /** The key of the message: Failed to create a cache reponse for ID:{0}. */
    public static final String ERRORS_failed_to_create_cache = "{errors.failed_to_create_cache}";

    /** The key of the message: Synonym file is not found */
    public static final String ERRORS_synonym_file_is_not_found = "{errors.synonym_file_is_not_found}";

    /** The key of the message: Failed to download the Synonym file. */
    public static final String ERRORS_failed_to_download_synonym_file = "{errors.failed_to_download_synonym_file}";

    /** The key of the message: Failed to upload the Synonym file. */
    public static final String ERRORS_failed_to_upload_synonym_file = "{errors.failed_to_upload_synonym_file}";

    /** The key of the message: Synonym file is not found */
    public static final String ERRORS_userdict_file_is_not_found = "{errors.userdict_file_is_not_found}";

    /** The key of the message: Failed to download the UserDict file. */
    public static final String ERRORS_failed_to_download_userdict_file = "{errors.failed_to_download_userdict_file}";

    /** The key of the message: Failed to upload the UserDict file. */
    public static final String ERRORS_failed_to_upload_userdict_file = "{errors.failed_to_upload_userdict_file}";

    /** The key of the message: Password is required. */
    public static final String ERRORS_blank_password = "{errors.blank_password}";

    /** The key of the message: Confirm Password does not match. */
    public static final String ERRORS_invalid_confirm_password = "{errors.invalid_confirm_password}";

    /** The key of the message: Invalid password. */
    public static final String ERRORS_password_does_not_exist_in_session = "{errors.password_does_not_exist_in_session}";

    /** The key of the message: The given query is invalid. */
    public static final String ERRORS_invalid_query_unknown = "{errors.invalid_query_unknown}";

    /** The key of the message: An invalid quote character is used. */
    public static final String ERRORS_invalid_query_quoted = "{errors.invalid_query_quoted}";

    /** The key of the message: An invalid curly bracket character is used. */
    public static final String ERRORS_invalid_query_curly_bracket = "{errors.invalid_query_curly_bracket}";

    /** The key of the message: An invalid square bracket character is used. */
    public static final String ERRORS_invalid_query_square_bracket = "{errors.invalid_query_square_bracket}";

    /** The key of the message: An invalid parenthesis character is used. */
    public static final String ERRORS_invalid_query_parenthesis = "{errors.invalid_query_parenthesis}";

    /** The key of the message: An invalid range is used. The example of the range format is "field:[20020101 TO 20030101]". */
    public static final String ERRORS_invalid_query_num_range = "{errors.invalid_query_num_range}";

    /** The key of the message: An invalid range is used. The example of the range format is "field:'{'Aida TO Carmen'}'". */
    public static final String ERRORS_invalid_query_str_range = "{errors.invalid_query_str_range}";

    /** The key of the message: Updated parameters. */
    public static final String SUCCESS_update_crawler_params = "{success.update_crawler_params}";

    /** The key of the message: Updated parameters. */
    public static final String SUCCESS_update_web_crawler_params = "{success.update_web_crawler_params}";

    /** The key of the message: Updated parameters. */
    public static final String SUCCESS_update_solr_params = "{success.update_solr_params}";

    /** The key of the message: Started a process to commit index. */
    public static final String SUCCESS_commit_solr_index = "{success.commit_solr_index}";

    /** The key of the message: Started a process to optimize index. */
    public static final String SUCCESS_optimize_solr_index = "{success.optimize_solr_index}";

    /** The key of the message: Started a process to optimize index. */
    public static final String SUCCESS_delete_solr_index = "{success.delete_solr_index}";

    /** The key of the message: Started to restore data from the uploaded file. */
    public static final String SUCCESS_importing_data = "{success.importing_data}";

    /** The key of the message: Deleted session data. */
    public static final String SUCCESS_crawling_session_delete_all = "{success.crawling_session_delete_all}";

    /** The key of the message: Started a crawl process. */
    public static final String SUCCESS_start_crawl_process = "{success.start_crawl_process}";

    /** The key of the message: Stopping a crawl process. */
    public static final String SUCCESS_stopping_crawl_process = "{success.stopping_crawl_process}";

    /** The key of the message: Uploaded {0}. */
    public static final String SUCCESS_upload_design_file = "{success.upload_design_file}";

    /** The key of the message: Updated {0}. */
    public static final String SUCCESS_update_design_jsp_file = "{success.update_design_jsp_file}";

    /** The key of the message: Starting a solr instance. */
    public static final String SUCCESS_starting_solr_instance = "{success.starting_solr_instance}";

    /** The key of the message: Stopping a solr instance. */
    public static final String SUCCESS_stopping_solr_instance = "{success.stopping_solr_instance}";

    /** The key of the message: Reloading a solr instance. */
    public static final String SUCCESS_reloading_solr_instance = "{success.reloading_solr_instance}";

    /** The key of the message: Updated a crawling schedule. */
    public static final String SUCCESS_update_crawler_schedule = "{success.update_crawler_schedule}";

    /** The key of the message: Created a crawling config ({0}). */
    public static final String SUCCESS_create_crawling_config_at_wizard = "{success.create_crawling_config_at_wizard}";

    /** The key of the message: Deleted search logs. */
    public static final String SUCCESS_search_log_delete_all = "{success.search_log_delete_all}";

    /** The key of the message: Deleted failure urls. */
    public static final String SUCCESS_failure_url_delete_all = "{success.failure_url_delete_all}";

    /** The key of the message: Deleted {0} file. */
    public static final String SUCCESS_delete_file = "{success.delete_file}";

    /** The key of the message: Deleted user information. */
    public static final String SUCCESS_user_info_delete_all = "{success.user_info_delete_all}";

    /** The key of the message: Deleted popular urls */
    public static final String SUCCESS_favorite_log_delete_all = "{success.favorite_log_delete_all}";

    /** The key of the message: Started job {0}. */
    public static final String SUCCESS_job_started = "{success.job_started}";

    /** The key of the message: Stopped job {0}. */
    public static final String SUCCESS_job_stopped = "{success.job_stopped}";

    /** The key of the message: Deleted job logs. */
    public static final String SUCCESS_joblog_delete_all = "{success.joblog_delete_all}";

    /** The key of the message: Uploaded Synonym file. */
    public static final String SUCCESS_upload_synonym_file = "{success.upload_synonym_file}";

    /** The key of the message: Uploaded UserDict file. */
    public static final String SUCCESS_upload_userdict_file = "{success.upload_userdict_file}";

    /** The key of the message: Uploaded Additional Word file. */
    public static final String SUCCESS_upload_suggest_elevate_word = "{success.upload_suggest_elevate_word}";

    /** The key of the message: Uploaded Bad Word file. */
    public static final String SUCCESS_upload_suggest_bad_word = "{success.upload_suggest_bad_word}";

    /** The key of the message: Label */
    public static final String LABEL_facet_label_title = "{label.facet_label_title}";

    /** The key of the message: Term */
    public static final String LABEL_facet_lastModified_title = "{label.facet_lastModified_title}";

    /** The key of the message: Past 24 Hours */
    public static final String LABEL_facet_lastModified_1day = "{label.facet_lastModified_1day}";

    /** The key of the message: Past Week */
    public static final String LABEL_facet_lastModified_1week = "{label.facet_lastModified_1week}";

    /** The key of the message: Past Month */
    public static final String LABEL_facet_lastModified_1month = "{label.facet_lastModified_1month}";

    /** The key of the message: Past Year */
    public static final String LABEL_facet_lastModified_1year = "{label.facet_lastModified_1year}";

    /** The key of the message: Size */
    public static final String LABEL_facet_contentLength_title = "{label.facet_contentLength_title}";

    /** The key of the message: &nbsp; - 10kb */
    public static final String LABEL_facet_contentLength_10k = "{label.facet_contentLength_10k}";

    /** The key of the message: 10kb - 100kb */
    public static final String LABEL_facet_contentLength_10kto100k = "{label.facet_contentLength_10kto100k}";

    /** The key of the message: 100kb - 500kb */
    public static final String LABEL_facet_contentLength_100kto500k = "{label.facet_contentLength_100kto500k}";

    /** The key of the message: 500kb - 1mb */
    public static final String LABEL_facet_contentLength_500kto1m = "{label.facet_contentLength_500kto1m}";

    /** The key of the message: 1mb - &nbsp; */
    public static final String LABEL_facet_contentLength_1m = "{label.facet_contentLength_1m}";

    /** The key of the message: File Type */
    public static final String LABEL_facet_filetype_title = "{label.facet_filetype_title}";

    /** The key of the message: HTML */
    public static final String LABEL_facet_filetype_html = "{label.facet_filetype_html}";

    /** The key of the message: Word */
    public static final String LABEL_facet_filetype_word = "{label.facet_filetype_word}";

    /** The key of the message: Excel */
    public static final String LABEL_facet_filetype_excel = "{label.facet_filetype_excel}";

    /** The key of the message: PowerPoint */
    public static final String LABEL_facet_filetype_powerpoint = "{label.facet_filetype_powerpoint}";

    /** The key of the message: PDF */
    public static final String LABEL_facet_filetype_pdf = "{label.facet_filetype_pdf}";

    /** The key of the message: PDF */
    public static final String LABEL_facet_filetype_others = "{label.facet_filetype_others}";

    /** The key of the message: Reset */
    public static final String LABEL_facet_label_reset = "{label.facet_label_reset}";

    /** The key of the message: Invalid mode(expected value is {0}, but it's {1}). */
    public static final String ERRORS_crud_invalid_mode = "{errors.crud_invalid_mode}";

    /** The key of the message: Failed to create a new data. */
    public static final String ERRORS_crud_failed_to_create_crud_table = "{errors.crud_failed_to_create_crud_table}";

    /** The key of the message: Failed to update the data. */
    public static final String ERRORS_crud_failed_to_update_crud_table = "{errors.crud_failed_to_update_crud_table}";

    /** The key of the message: Failed to delete the data. */
    public static final String ERRORS_crud_failed_to_delete_crud_table = "{errors.crud_failed_to_delete_crud_table}";

    /** The key of the message: Could not find the data({0}). */
    public static final String ERRORS_crud_could_not_find_crud_table = "{errors.crud_could_not_find_crud_table}";

    /** The key of the message: Created data. */
    public static final String SUCCESS_crud_create_crud_table = "{success.crud_create_crud_table}";

    /** The key of the message: Updated data. */
    public static final String SUCCESS_crud_update_crud_table = "{success.crud_update_crud_table}";

    /** The key of the message: Deleted data. */
    public static final String SUCCESS_crud_delete_crud_table = "{success.crud_delete_crud_table}";

    /**
     * Add the created action message for the key 'constraints.AssertFalse.message' with parameters.
     * <pre>
     * message: must be false
     * comment: ---------------
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addConstraintsAssertFalseMessage(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_AssertFalse_MESSAGE));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.AssertTrue.message' with parameters.
     * <pre>
     * message: must be true
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addConstraintsAssertTrueMessage(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_AssertTrue_MESSAGE));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.DecimalMax.message' with parameters.
     * <pre>
     * message: must be less than ${inclusive == true ? 'or equal to ' : ''}{value}
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param value The parameter value for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addConstraintsDecimalMaxMessage(String property, String value) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_DecimalMax_MESSAGE, value));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.DecimalMin.message' with parameters.
     * <pre>
     * message: must be greater than ${inclusive == true ? 'or equal to ' : ''}{value}
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param value The parameter value for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addConstraintsDecimalMinMessage(String property, String value) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_DecimalMin_MESSAGE, value));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.Digits.message' with parameters.
     * <pre>
     * message: numeric value out of bounds (<{integer} digits>.<{fraction} digits> expected)
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param integer The parameter integer for message. (NotNull)
     * @param fraction The parameter fraction for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addConstraintsDigitsMessage(String property, String integer, String fraction) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_Digits_MESSAGE, integer, fraction));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.Future.message' with parameters.
     * <pre>
     * message: must be in the future
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addConstraintsFutureMessage(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_Future_MESSAGE));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.Max.message' with parameters.
     * <pre>
     * message: must be less than or equal to {value}
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param value The parameter value for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addConstraintsMaxMessage(String property, String value) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_Max_MESSAGE, value));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.Min.message' with parameters.
     * <pre>
     * message: must be greater than or equal to {value}
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param value The parameter value for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addConstraintsMinMessage(String property, String value) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_Min_MESSAGE, value));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.NotNull.message' with parameters.
     * <pre>
     * message: may not be null
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addConstraintsNotNullMessage(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_NotNull_MESSAGE));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.Null.message' with parameters.
     * <pre>
     * message: must be null
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addConstraintsNullMessage(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_Null_MESSAGE));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.Past.message' with parameters.
     * <pre>
     * message: must be in the past
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addConstraintsPastMessage(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_Past_MESSAGE));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.Pattern.message' with parameters.
     * <pre>
     * message: must match "{regexp}"
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param regexp The parameter regexp for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addConstraintsPatternMessage(String property, String regexp) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_Pattern_MESSAGE, regexp));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.Size.message' with parameters.
     * <pre>
     * message: size must be between {min} and {max}
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param min The parameter min for message. (NotNull)
     * @param max The parameter max for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addConstraintsSizeMessage(String property, String min, String max) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_Size_MESSAGE, min, max));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.CreditCardNumber.message' with parameters.
     * <pre>
     * message: invalid credit card number
     * comment: -------------------
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addConstraintsCreditCardNumberMessage(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_CreditCardNumber_MESSAGE));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.EAN.message' with parameters.
     * <pre>
     * message: invalid {type} barcode
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param type The parameter type for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addConstraintsEanMessage(String property, String type) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_EAN_MESSAGE, type));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.Email.message' with parameters.
     * <pre>
     * message: not a well-formed email address
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addConstraintsEmailMessage(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_Email_MESSAGE));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.Length.message' with parameters.
     * <pre>
     * message: length must be between {min} and {max}
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param min The parameter min for message. (NotNull)
     * @param max The parameter max for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addConstraintsLengthMessage(String property, String min, String max) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_Length_MESSAGE, min, max));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.LuhnCheck.message' with parameters.
     * <pre>
     * message: The check digit for ${value} is invalid, Luhn Modulo 10 checksum failed
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param value The parameter value for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addConstraintsLuhnCheckMessage(String property, String value) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_LuhnCheck_MESSAGE, value));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.Mod10Check.message' with parameters.
     * <pre>
     * message: The check digit for ${value} is invalid, Modulo 10 checksum failed
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param value The parameter value for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addConstraintsMod10CheckMessage(String property, String value) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_Mod10Check_MESSAGE, value));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.Mod11Check.message' with parameters.
     * <pre>
     * message: The check digit for ${value} is invalid, Modulo 11 checksum failed
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param value The parameter value for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addConstraintsMod11CheckMessage(String property, String value) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_Mod11Check_MESSAGE, value));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.ModCheck.message' with parameters.
     * <pre>
     * message: The check digit for ${value} is invalid, ${modType} checksum failed
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param value The parameter value for message. (NotNull)
     * @param modType The parameter modType for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addConstraintsModCheckMessage(String property, String value, String modType) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_ModCheck_MESSAGE, value, modType));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.NotBlank.message' with parameters.
     * <pre>
     * message: may not be empty
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addConstraintsNotBlankMessage(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_NotBlank_MESSAGE));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.NotEmpty.message' with parameters.
     * <pre>
     * message: may not be empty
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addConstraintsNotEmptyMessage(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_NotEmpty_MESSAGE));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.ParametersScriptAssert.message' with parameters.
     * <pre>
     * message: script expression "{script}" didn't evaluate to true
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param script The parameter script for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addConstraintsParametersScriptAssertMessage(String property, String script) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_ParametersScriptAssert_MESSAGE, script));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.Range.message' with parameters.
     * <pre>
     * message: must be between {min} and {max}
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param min The parameter min for message. (NotNull)
     * @param max The parameter max for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addConstraintsRangeMessage(String property, String min, String max) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_Range_MESSAGE, min, max));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.SafeHtml.message' with parameters.
     * <pre>
     * message: may have unsafe html content
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addConstraintsSafeHtmlMessage(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_SafeHtml_MESSAGE));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.ScriptAssert.message' with parameters.
     * <pre>
     * message: script expression "{script}" didn't evaluate to true
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param script The parameter script for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addConstraintsScriptAssertMessage(String property, String script) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_ScriptAssert_MESSAGE, script));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.URL.message' with parameters.
     * <pre>
     * message: must be a valid URL
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addConstraintsUrlMessage(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_URL_MESSAGE));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.Required.message' with parameters.
     * <pre>
     * message: is required
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addConstraintsRequiredMessage(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_Required_MESSAGE));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.login.failure' with parameters.
     * <pre>
     * message: could not login
     * comment: - - - - - - - - - -/
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsLoginFailure(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_LOGIN_FAILURE));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.app.illegal.transition' with parameters.
     * <pre>
     * message: retry because of illegal transition
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsAppIllegalTransition(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_APP_ILLEGAL_TRANSITION));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.app.db.already.deleted' with parameters.
     * <pre>
     * message: others might be updated, so retry
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsAppDbAlreadyDeleted(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_APP_DB_ALREADY_DELETED));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.app.db.already.updated' with parameters.
     * <pre>
     * message: others might be updated, so retry
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsAppDbAlreadyUpdated(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_APP_DB_ALREADY_UPDATED));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.app.db.already.exists' with parameters.
     * <pre>
     * message: already existing data, so retry
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsAppDbAlreadyExists(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_APP_DB_ALREADY_EXISTS));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.front_header' with parameters.
     * <pre>
     * message: <div class="alert"><button type="button" class="close" data-dismiss="alert">×</button>
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsFrontHeader(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_front_header));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.front_footer' with parameters.
     * <pre>
     * message: </div>
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsFrontFooter(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_front_footer));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.front_prefix' with parameters.
     * <pre>
     * message: <div>
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsFrontPrefix(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_front_prefix));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.front_suffix' with parameters.
     * <pre>
     * message: </div>
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsFrontSuffix(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_front_suffix));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.header' with parameters.
     * <pre>
     * message: <div class="alert-message error">
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsHeader(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_HEADER));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.footer' with parameters.
     * <pre>
     * message: </div>
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsFooter(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_FOOTER));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.prefix' with parameters.
     * <pre>
     * message: <p>
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsPrefix(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_PREFIX));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.suffix' with parameters.
     * <pre>
     * message: </p>
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsSuffix(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_SUFFIX));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.invalid' with parameters.
     * <pre>
     * message: {0} is invalid.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param arg0 The parameter arg0 for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsInvalid(String property, String arg0) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_INVALID, arg0));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.maxlength' with parameters.
     * <pre>
     * message: {0} can not be greater than {1} characters.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param arg0 The parameter arg0 for message. (NotNull)
     * @param arg1 The parameter arg1 for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsMaxlength(String property, String arg0, String arg1) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_MAXLENGTH, arg0, arg1));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.minlength' with parameters.
     * <pre>
     * message: {0} can not be less than {1} characters.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param arg0 The parameter arg0 for message. (NotNull)
     * @param arg1 The parameter arg1 for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsMinlength(String property, String arg0, String arg1) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_MINLENGTH, arg0, arg1));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.maxbytelength' with parameters.
     * <pre>
     * message: {0} can not be greater than {1} bytes.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param arg0 The parameter arg0 for message. (NotNull)
     * @param arg1 The parameter arg1 for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsMaxbytelength(String property, String arg0, String arg1) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_MAXBYTELENGTH, arg0, arg1));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.minbytelength' with parameters.
     * <pre>
     * message: {0} can not be less than {1} bytes.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param arg0 The parameter arg0 for message. (NotNull)
     * @param arg1 The parameter arg1 for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsMinbytelength(String property, String arg0, String arg1) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_MINBYTELENGTH, arg0, arg1));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.range' with parameters.
     * <pre>
     * message: {0} is not in the range {1} through {2}.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param arg0 The parameter arg0 for message. (NotNull)
     * @param arg1 The parameter arg1 for message. (NotNull)
     * @param arg2 The parameter arg2 for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsRange(String property, String arg0, String arg1, String arg2) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_RANGE, arg0, arg1, arg2));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.required' with parameters.
     * <pre>
     * message: {0} is required.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param arg0 The parameter arg0 for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsRequired(String property, String arg0) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_REQUIRED, arg0));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.byte' with parameters.
     * <pre>
     * message: {0} must be an byte.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param arg0 The parameter arg0 for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsByte(String property, String arg0) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_BYTE, arg0));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.date' with parameters.
     * <pre>
     * message: {0} is not a date.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param arg0 The parameter arg0 for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsDate(String property, String arg0) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_DATE, arg0));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.double' with parameters.
     * <pre>
     * message: {0} must be an double.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param arg0 The parameter arg0 for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsDouble(String property, String arg0) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_DOUBLE, arg0));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.float' with parameters.
     * <pre>
     * message: {0} must be an float.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param arg0 The parameter arg0 for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsFloat(String property, String arg0) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_FLOAT, arg0));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.integer' with parameters.
     * <pre>
     * message: {0} must be an integer.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param arg0 The parameter arg0 for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsInteger(String property, String arg0) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_INTEGER, arg0));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.long' with parameters.
     * <pre>
     * message: {0} must be an long.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param arg0 The parameter arg0 for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsLong(String property, String arg0) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_LONG, arg0));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.short' with parameters.
     * <pre>
     * message: {0} must be an short.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param arg0 The parameter arg0 for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsShort(String property, String arg0) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_SHORT, arg0));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.creditcard' with parameters.
     * <pre>
     * message: {0} is not a valid credit card number.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param arg0 The parameter arg0 for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsCreditcard(String property, String arg0) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_CREDITCARD, arg0));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.email' with parameters.
     * <pre>
     * message: {0} is an invalid e-mail address.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param arg0 The parameter arg0 for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsEmail(String property, String arg0) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_EMAIL, arg0));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.url' with parameters.
     * <pre>
     * message: {0} is an invalid url (web address).
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param arg0 The parameter arg0 for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsUrl(String property, String arg0) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_URL, arg0));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.cronexpression' with parameters.
     * <pre>
     * message: {0} is a invalid format.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param arg0 The parameter arg0 for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsCronexpression(String property, String arg0) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_CRONEXPRESSION, arg0));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.uritype' with parameters.
     * <pre>
     * message: {0} is a invalid uri.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param arg0 The parameter arg0 for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsUritype(String property, String arg0) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_URITYPE, arg0));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.alphaDigitOnly' with parameters.
     * <pre>
     * message: {0} must be alphabet or digit only.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param arg0 The parameter arg0 for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsAlphaDigitOnly(String property, String arg0) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_ALPHA_DIGIT_ONLY, arg0));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.alphaDigitSpaceOnly' with parameters.
     * <pre>
     * message: {0} must be alphabet, digit, or space only.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param arg0 The parameter arg0 for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsAlphaDigitSpaceOnly(String property, String arg0) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_ALPHA_DIGIT_SPACE_ONLY, arg0));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.token' with parameters.
     * <pre>
     * message: Invalid request.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsToken(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_TOKEN));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.failed_to_update_crawler_params' with parameters.
     * <pre>
     * message: Failed to update parameters. Please contact to a site administrator.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsFailedToUpdateCrawlerParams(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_failed_to_update_crawler_params));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.failed_to_update_web_crawler_params' with parameters.
     * <pre>
     * message: Failed to update parameters. Please contact to a site administrator.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsFailedToUpdateWebCrawlerParams(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_failed_to_update_web_crawler_params));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.failed_to_update_solr_params' with parameters.
     * <pre>
     * message: Failed to update parameters. Please contact to a site administrator.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsFailedToUpdateSolrParams(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_failed_to_update_solr_params));
        return this;
    }

    /**
     * Add the created action message for the key 'error.login_error' with parameters.
     * <pre>
     * message: Username or Password is not correct.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorLoginError(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERROR_login_error));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.failed_to_commit_solr_index' with parameters.
     * <pre>
     * message: Failed to commit index.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsFailedToCommitSolrIndex(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_failed_to_commit_solr_index));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.failed_to_optimize_solr_index' with parameters.
     * <pre>
     * message: Failed to optimize index.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsFailedToOptimizeSolrIndex(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_failed_to_optimize_solr_index));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.failed_to_delete_solr_index' with parameters.
     * <pre>
     * message: Failed to delete index.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsFailedToDeleteSolrIndex(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_failed_to_delete_solr_index));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.failed_to_start_solr_process_because_of_running' with parameters.
     * <pre>
     * message: Failed to start a process because of running solr process.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsFailedToStartSolrProcessBecauseOfRunning(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_failed_to_start_solr_process_because_of_running));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.failed_to_import_data' with parameters.
     * <pre>
     * message: Failed to restore data.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsFailedToImportData(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_failed_to_import_data));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.unknown_import_file' with parameters.
     * <pre>
     * message: Unknown file type.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsUnknownImportFile(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_unknown_import_file));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.failed_to_export_data' with parameters.
     * <pre>
     * message: Failed to backup data.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsFailedToExportData(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_failed_to_export_data));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.could_not_find_log_file' with parameters.
     * <pre>
     * message: Could not find {0}.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param arg0 The parameter arg0 for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsCouldNotFindLogFile(String property, String arg0) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_could_not_find_log_file, arg0));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.no_running_crawl_process' with parameters.
     * <pre>
     * message: No running crawl process.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsNoRunningCrawlProcess(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_no_running_crawl_process));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.failed_to_start_crawl_process' with parameters.
     * <pre>
     * message: Failed to start a crawl process.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsFailedToStartCrawlProcess(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_failed_to_start_crawl_process));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.invalid_design_jsp_file_name' with parameters.
     * <pre>
     * message: Invalid JSP file.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsInvalidDesignJspFileName(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_invalid_design_jsp_file_name));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.design_jsp_file_does_not_exist' with parameters.
     * <pre>
     * message: JSP file does not exist.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsDesignJspFileDoesNotExist(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_design_jsp_file_does_not_exist));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.design_file_name_is_not_found' with parameters.
     * <pre>
     * message: The file name is not specified.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsDesignFileNameIsNotFound(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_design_file_name_is_not_found));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.failed_to_write_design_image_file' with parameters.
     * <pre>
     * message: Failed to upload an image file.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsFailedToWriteDesignImageFile(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_failed_to_write_design_image_file));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.failed_to_update_jsp_file' with parameters.
     * <pre>
     * message: Failed to update a jsp file.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsFailedToUpdateJspFile(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_failed_to_update_jsp_file));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.design_file_name_is_invalid' with parameters.
     * <pre>
     * message: The file name is invalid.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsDesignFileNameIsInvalid(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_design_file_name_is_invalid));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.design_file_is_unsupported_type' with parameters.
     * <pre>
     * message: The kind of file is unsupported.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsDesignFileIsUnsupportedType(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_design_file_is_unsupported_type));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.failed_to_start_solr_instance' with parameters.
     * <pre>
     * message: Failed to start a solr instance.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsFailedToStartSolrInstance(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_failed_to_start_solr_instance));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.failed_to_stop_solr_instance' with parameters.
     * <pre>
     * message: Failed to stop a solr instance.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsFailedToStopSolrInstance(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_failed_to_stop_solr_instance));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.failed_to_reload_solr_instance' with parameters.
     * <pre>
     * message: Failed to reload a solr instance.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsFailedToReloadSolrInstance(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_failed_to_reload_solr_instance));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.failed_to_update_crawler_schedule' with parameters.
     * <pre>
     * message: Failed to update a crawling schedule.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsFailedToUpdateCrawlerSchedule(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_failed_to_update_crawler_schedule));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.failed_to_create_crawling_config_at_wizard' with parameters.
     * <pre>
     * message: Failed to create a crawling config.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsFailedToCreateCrawlingConfigAtWizard(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_failed_to_create_crawling_config_at_wizard));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.design_editor_disabled' with parameters.
     * <pre>
     * message: This feature is disabled.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsDesignEditorDisabled(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_design_editor_disabled));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.could_not_create_search_log_csv' with parameters.
     * <pre>
     * message: Could not create a search log csv file.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsCouldNotCreateSearchLogCsv(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_could_not_create_search_log_csv));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.not_found_on_file_system' with parameters.
     * <pre>
     * message: Not Found: {0}
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param arg0 The parameter arg0 for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsNotFoundOnFileSystem(String property, String arg0) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_not_found_on_file_system, arg0));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.could_not_open_on_system' with parameters.
     * <pre>
     * message: Could not open {0}. <br/>Please check if the file is associated with an application.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param arg0 The parameter arg0 for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsCouldNotOpenOnSystem(String property, String arg0) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_could_not_open_on_system, arg0));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.process_time_is_exceeded' with parameters.
     * <pre>
     * message: The limit of a search time was exceeded. The partial result was displayed.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsProcessTimeIsExceeded(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_process_time_is_exceeded));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.result_size_exceeded' with parameters.
     * <pre>
     * message: No more results could be displayed.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsResultSizeExceeded(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_result_size_exceeded));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.target_file_does_not_exist' with parameters.
     * <pre>
     * message: {0} file does not exist.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param arg0 The parameter arg0 for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsTargetFileDoesNotExist(String property, String arg0) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_target_file_does_not_exist, arg0));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.failed_to_download_file' with parameters.
     * <pre>
     * message: Failed to download {0} file.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param arg0 The parameter arg0 for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsFailedToDownloadFile(String property, String arg0) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_failed_to_download_file, arg0));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.failed_to_delete_file' with parameters.
     * <pre>
     * message: Failed to delete {0} file.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param arg0 The parameter arg0 for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsFailedToDeleteFile(String property, String arg0) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_failed_to_delete_file, arg0));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.failed_to_redirect' with parameters.
     * <pre>
     * message: Failed to redirect {0}.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param arg0 The parameter arg0 for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsFailedToRedirect(String property, String arg0) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_failed_to_redirect, arg0));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.unsupported_encoding' with parameters.
     * <pre>
     * message: {0} is not supported as encoding.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param arg0 The parameter arg0 for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsUnsupportedEncoding(String property, String arg0) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_unsupported_encoding, arg0));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.docid_not_found' with parameters.
     * <pre>
     * message: Not found Doc ID:{0}
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param arg0 The parameter arg0 for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsDocidNotFound(String property, String arg0) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_docid_not_found, arg0));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.document_not_found' with parameters.
     * <pre>
     * message: Not found URL of Doc ID:{0}
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param arg0 The parameter arg0 for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsDocumentNotFound(String property, String arg0) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_document_not_found, arg0));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.not_load_from_server' with parameters.
     * <pre>
     * message: Could not load from this server: {0}
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param arg0 The parameter arg0 for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsNotLoadFromServer(String property, String arg0) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_not_load_from_server, arg0));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.failed_to_start_job' with parameters.
     * <pre>
     * message: Failed to start job {0}.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param arg0 The parameter arg0 for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsFailedToStartJob(String property, String arg0) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_failed_to_start_job, arg0));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.failed_to_stop_job' with parameters.
     * <pre>
     * message: Failed to stop job {0}.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param arg0 The parameter arg0 for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsFailedToStopJob(String property, String arg0) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_failed_to_stop_job, arg0));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.expired_dict_id' with parameters.
     * <pre>
     * message: Expired dictionary information. Please reload it.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsExpiredDictId(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_expired_dict_id));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.failed_to_create_cache' with parameters.
     * <pre>
     * message: Failed to create a cache reponse for ID:{0}.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param arg0 The parameter arg0 for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsFailedToCreateCache(String property, String arg0) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_failed_to_create_cache, arg0));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.synonym_file_is_not_found' with parameters.
     * <pre>
     * message: Synonym file is not found
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsSynonymFileIsNotFound(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_synonym_file_is_not_found));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.failed_to_download_synonym_file' with parameters.
     * <pre>
     * message: Failed to download the Synonym file.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsFailedToDownloadSynonymFile(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_failed_to_download_synonym_file));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.failed_to_upload_synonym_file' with parameters.
     * <pre>
     * message: Failed to upload the Synonym file.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsFailedToUploadSynonymFile(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_failed_to_upload_synonym_file));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.userdict_file_is_not_found' with parameters.
     * <pre>
     * message: Synonym file is not found
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsUserdictFileIsNotFound(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_userdict_file_is_not_found));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.failed_to_download_userdict_file' with parameters.
     * <pre>
     * message: Failed to download the UserDict file.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsFailedToDownloadUserdictFile(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_failed_to_download_userdict_file));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.failed_to_upload_userdict_file' with parameters.
     * <pre>
     * message: Failed to upload the UserDict file.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsFailedToUploadUserdictFile(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_failed_to_upload_userdict_file));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.blank_password' with parameters.
     * <pre>
     * message: Password is required.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsBlankPassword(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_blank_password));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.invalid_confirm_password' with parameters.
     * <pre>
     * message: Confirm Password does not match.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsInvalidConfirmPassword(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_invalid_confirm_password));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.password_does_not_exist_in_session' with parameters.
     * <pre>
     * message: Invalid password.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsPasswordDoesNotExistInSession(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_password_does_not_exist_in_session));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.invalid_query_unknown' with parameters.
     * <pre>
     * message: The given query is invalid.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsInvalidQueryUnknown(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_invalid_query_unknown));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.invalid_query_quoted' with parameters.
     * <pre>
     * message: An invalid quote character is used.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsInvalidQueryQuoted(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_invalid_query_quoted));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.invalid_query_curly_bracket' with parameters.
     * <pre>
     * message: An invalid curly bracket character is used.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsInvalidQueryCurlyBracket(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_invalid_query_curly_bracket));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.invalid_query_square_bracket' with parameters.
     * <pre>
     * message: An invalid square bracket character is used.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsInvalidQuerySquareBracket(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_invalid_query_square_bracket));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.invalid_query_parenthesis' with parameters.
     * <pre>
     * message: An invalid parenthesis character is used.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsInvalidQueryParenthesis(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_invalid_query_parenthesis));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.invalid_query_num_range' with parameters.
     * <pre>
     * message: An invalid range is used. The example of the range format is "field:[20020101 TO 20030101]".
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsInvalidQueryNumRange(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_invalid_query_num_range));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.invalid_query_str_range' with parameters.
     * <pre>
     * message: An invalid range is used. The example of the range format is "field:'{'Aida TO Carmen'}'".
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsInvalidQueryStrRange(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_invalid_query_str_range));
        return this;
    }

    /**
     * Add the created action message for the key 'success.update_crawler_params' with parameters.
     * <pre>
     * message: Updated parameters.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addSuccessUpdateCrawlerParams(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(SUCCESS_update_crawler_params));
        return this;
    }

    /**
     * Add the created action message for the key 'success.update_web_crawler_params' with parameters.
     * <pre>
     * message: Updated parameters.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addSuccessUpdateWebCrawlerParams(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(SUCCESS_update_web_crawler_params));
        return this;
    }

    /**
     * Add the created action message for the key 'success.update_solr_params' with parameters.
     * <pre>
     * message: Updated parameters.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addSuccessUpdateSolrParams(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(SUCCESS_update_solr_params));
        return this;
    }

    /**
     * Add the created action message for the key 'success.commit_solr_index' with parameters.
     * <pre>
     * message: Started a process to commit index.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addSuccessCommitSolrIndex(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(SUCCESS_commit_solr_index));
        return this;
    }

    /**
     * Add the created action message for the key 'success.optimize_solr_index' with parameters.
     * <pre>
     * message: Started a process to optimize index.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addSuccessOptimizeSolrIndex(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(SUCCESS_optimize_solr_index));
        return this;
    }

    /**
     * Add the created action message for the key 'success.delete_solr_index' with parameters.
     * <pre>
     * message: Started a process to optimize index.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addSuccessDeleteSolrIndex(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(SUCCESS_delete_solr_index));
        return this;
    }

    /**
     * Add the created action message for the key 'success.importing_data' with parameters.
     * <pre>
     * message: Started to restore data from the uploaded file.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addSuccessImportingData(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(SUCCESS_importing_data));
        return this;
    }

    /**
     * Add the created action message for the key 'success.crawling_session_delete_all' with parameters.
     * <pre>
     * message: Deleted session data.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addSuccessCrawlingSessionDeleteAll(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(SUCCESS_crawling_session_delete_all));
        return this;
    }

    /**
     * Add the created action message for the key 'success.start_crawl_process' with parameters.
     * <pre>
     * message: Started a crawl process.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addSuccessStartCrawlProcess(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(SUCCESS_start_crawl_process));
        return this;
    }

    /**
     * Add the created action message for the key 'success.stopping_crawl_process' with parameters.
     * <pre>
     * message: Stopping a crawl process.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addSuccessStoppingCrawlProcess(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(SUCCESS_stopping_crawl_process));
        return this;
    }

    /**
     * Add the created action message for the key 'success.upload_design_file' with parameters.
     * <pre>
     * message: Uploaded {0}.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param arg0 The parameter arg0 for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addSuccessUploadDesignFile(String property, String arg0) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(SUCCESS_upload_design_file, arg0));
        return this;
    }

    /**
     * Add the created action message for the key 'success.update_design_jsp_file' with parameters.
     * <pre>
     * message: Updated {0}.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param arg0 The parameter arg0 for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addSuccessUpdateDesignJspFile(String property, String arg0) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(SUCCESS_update_design_jsp_file, arg0));
        return this;
    }

    /**
     * Add the created action message for the key 'success.starting_solr_instance' with parameters.
     * <pre>
     * message: Starting a solr instance.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addSuccessStartingSolrInstance(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(SUCCESS_starting_solr_instance));
        return this;
    }

    /**
     * Add the created action message for the key 'success.stopping_solr_instance' with parameters.
     * <pre>
     * message: Stopping a solr instance.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addSuccessStoppingSolrInstance(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(SUCCESS_stopping_solr_instance));
        return this;
    }

    /**
     * Add the created action message for the key 'success.reloading_solr_instance' with parameters.
     * <pre>
     * message: Reloading a solr instance.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addSuccessReloadingSolrInstance(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(SUCCESS_reloading_solr_instance));
        return this;
    }

    /**
     * Add the created action message for the key 'success.update_crawler_schedule' with parameters.
     * <pre>
     * message: Updated a crawling schedule.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addSuccessUpdateCrawlerSchedule(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(SUCCESS_update_crawler_schedule));
        return this;
    }

    /**
     * Add the created action message for the key 'success.create_crawling_config_at_wizard' with parameters.
     * <pre>
     * message: Created a crawling config ({0}).
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param arg0 The parameter arg0 for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addSuccessCreateCrawlingConfigAtWizard(String property, String arg0) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(SUCCESS_create_crawling_config_at_wizard, arg0));
        return this;
    }

    /**
     * Add the created action message for the key 'success.search_log_delete_all' with parameters.
     * <pre>
     * message: Deleted search logs.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addSuccessSearchLogDeleteAll(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(SUCCESS_search_log_delete_all));
        return this;
    }

    /**
     * Add the created action message for the key 'success.failure_url_delete_all' with parameters.
     * <pre>
     * message: Deleted failure urls.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addSuccessFailureUrlDeleteAll(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(SUCCESS_failure_url_delete_all));
        return this;
    }

    /**
     * Add the created action message for the key 'success.delete_file' with parameters.
     * <pre>
     * message: Deleted {0} file.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param arg0 The parameter arg0 for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addSuccessDeleteFile(String property, String arg0) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(SUCCESS_delete_file, arg0));
        return this;
    }

    /**
     * Add the created action message for the key 'success.user_info_delete_all' with parameters.
     * <pre>
     * message: Deleted user information.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addSuccessUserInfoDeleteAll(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(SUCCESS_user_info_delete_all));
        return this;
    }

    /**
     * Add the created action message for the key 'success.favorite_log_delete_all' with parameters.
     * <pre>
     * message: Deleted popular urls
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addSuccessFavoriteLogDeleteAll(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(SUCCESS_favorite_log_delete_all));
        return this;
    }

    /**
     * Add the created action message for the key 'success.job_started' with parameters.
     * <pre>
     * message: Started job {0}.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param arg0 The parameter arg0 for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addSuccessJobStarted(String property, String arg0) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(SUCCESS_job_started, arg0));
        return this;
    }

    /**
     * Add the created action message for the key 'success.job_stopped' with parameters.
     * <pre>
     * message: Stopped job {0}.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param arg0 The parameter arg0 for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addSuccessJobStopped(String property, String arg0) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(SUCCESS_job_stopped, arg0));
        return this;
    }

    /**
     * Add the created action message for the key 'success.joblog_delete_all' with parameters.
     * <pre>
     * message: Deleted job logs.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addSuccessJoblogDeleteAll(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(SUCCESS_joblog_delete_all));
        return this;
    }

    /**
     * Add the created action message for the key 'success.upload_synonym_file' with parameters.
     * <pre>
     * message: Uploaded Synonym file.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addSuccessUploadSynonymFile(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(SUCCESS_upload_synonym_file));
        return this;
    }

    /**
     * Add the created action message for the key 'success.upload_userdict_file' with parameters.
     * <pre>
     * message: Uploaded UserDict file.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addSuccessUploadUserdictFile(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(SUCCESS_upload_userdict_file));
        return this;
    }

    /**
     * Add the created action message for the key 'success.upload_suggest_elevate_word' with parameters.
     * <pre>
     * message: Uploaded Additional Word file.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addSuccessUploadSuggestElevateWord(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(SUCCESS_upload_suggest_elevate_word));
        return this;
    }

    /**
     * Add the created action message for the key 'success.upload_suggest_bad_word' with parameters.
     * <pre>
     * message: Uploaded Bad Word file.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addSuccessUploadSuggestBadWord(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(SUCCESS_upload_suggest_bad_word));
        return this;
    }

    /**
     * Add the created action message for the key 'label.facet_label_title' with parameters.
     * <pre>
     * message: Label
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addLabelFacetLabelTitle(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(LABEL_facet_label_title));
        return this;
    }

    /**
     * Add the created action message for the key 'label.facet_lastModified_title' with parameters.
     * <pre>
     * message: Term
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addLabelFacetLastModifiedTitle(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(LABEL_facet_lastModified_title));
        return this;
    }

    /**
     * Add the created action message for the key 'label.facet_lastModified_1day' with parameters.
     * <pre>
     * message: Past 24 Hours
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addLabelFacetLastModified1day(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(LABEL_facet_lastModified_1day));
        return this;
    }

    /**
     * Add the created action message for the key 'label.facet_lastModified_1week' with parameters.
     * <pre>
     * message: Past Week
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addLabelFacetLastModified1week(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(LABEL_facet_lastModified_1week));
        return this;
    }

    /**
     * Add the created action message for the key 'label.facet_lastModified_1month' with parameters.
     * <pre>
     * message: Past Month
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addLabelFacetLastModified1month(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(LABEL_facet_lastModified_1month));
        return this;
    }

    /**
     * Add the created action message for the key 'label.facet_lastModified_1year' with parameters.
     * <pre>
     * message: Past Year
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addLabelFacetLastModified1year(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(LABEL_facet_lastModified_1year));
        return this;
    }

    /**
     * Add the created action message for the key 'label.facet_contentLength_title' with parameters.
     * <pre>
     * message: Size
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addLabelFacetContentLengthTitle(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(LABEL_facet_contentLength_title));
        return this;
    }

    /**
     * Add the created action message for the key 'label.facet_contentLength_10k' with parameters.
     * <pre>
     * message: &nbsp; - 10kb
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addLabelFacetContentLength10k(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(LABEL_facet_contentLength_10k));
        return this;
    }

    /**
     * Add the created action message for the key 'label.facet_contentLength_10kto100k' with parameters.
     * <pre>
     * message: 10kb - 100kb
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addLabelFacetContentLength10kto100k(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(LABEL_facet_contentLength_10kto100k));
        return this;
    }

    /**
     * Add the created action message for the key 'label.facet_contentLength_100kto500k' with parameters.
     * <pre>
     * message: 100kb - 500kb
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addLabelFacetContentLength100kto500k(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(LABEL_facet_contentLength_100kto500k));
        return this;
    }

    /**
     * Add the created action message for the key 'label.facet_contentLength_500kto1m' with parameters.
     * <pre>
     * message: 500kb - 1mb
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addLabelFacetContentLength500kto1m(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(LABEL_facet_contentLength_500kto1m));
        return this;
    }

    /**
     * Add the created action message for the key 'label.facet_contentLength_1m' with parameters.
     * <pre>
     * message: 1mb - &nbsp;
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addLabelFacetContentLength1m(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(LABEL_facet_contentLength_1m));
        return this;
    }

    /**
     * Add the created action message for the key 'label.facet_filetype_title' with parameters.
     * <pre>
     * message: File Type
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addLabelFacetFiletypeTitle(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(LABEL_facet_filetype_title));
        return this;
    }

    /**
     * Add the created action message for the key 'label.facet_filetype_html' with parameters.
     * <pre>
     * message: HTML
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addLabelFacetFiletypeHtml(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(LABEL_facet_filetype_html));
        return this;
    }

    /**
     * Add the created action message for the key 'label.facet_filetype_word' with parameters.
     * <pre>
     * message: Word
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addLabelFacetFiletypeWord(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(LABEL_facet_filetype_word));
        return this;
    }

    /**
     * Add the created action message for the key 'label.facet_filetype_excel' with parameters.
     * <pre>
     * message: Excel
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addLabelFacetFiletypeExcel(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(LABEL_facet_filetype_excel));
        return this;
    }

    /**
     * Add the created action message for the key 'label.facet_filetype_powerpoint' with parameters.
     * <pre>
     * message: PowerPoint
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addLabelFacetFiletypePowerpoint(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(LABEL_facet_filetype_powerpoint));
        return this;
    }

    /**
     * Add the created action message for the key 'label.facet_filetype_pdf' with parameters.
     * <pre>
     * message: PDF
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addLabelFacetFiletypePdf(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(LABEL_facet_filetype_pdf));
        return this;
    }

    /**
     * Add the created action message for the key 'label.facet_filetype_others' with parameters.
     * <pre>
     * message: PDF
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addLabelFacetFiletypeOthers(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(LABEL_facet_filetype_others));
        return this;
    }

    /**
     * Add the created action message for the key 'label.facet_label_reset' with parameters.
     * <pre>
     * message: Reset
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addLabelFacetLabelReset(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(LABEL_facet_label_reset));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.crud_invalid_mode' with parameters.
     * <pre>
     * message: Invalid mode(expected value is {0}, but it's {1}).
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param arg0 The parameter arg0 for message. (NotNull)
     * @param arg1 The parameter arg1 for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsCrudInvalidMode(String property, String arg0, String arg1) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_crud_invalid_mode, arg0, arg1));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.crud_failed_to_create_crud_table' with parameters.
     * <pre>
     * message: Failed to create a new data.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsCrudFailedToCreateCrudTable(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_crud_failed_to_create_crud_table));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.crud_failed_to_update_crud_table' with parameters.
     * <pre>
     * message: Failed to update the data.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsCrudFailedToUpdateCrudTable(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_crud_failed_to_update_crud_table));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.crud_failed_to_delete_crud_table' with parameters.
     * <pre>
     * message: Failed to delete the data.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsCrudFailedToDeleteCrudTable(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_crud_failed_to_delete_crud_table));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.crud_could_not_find_crud_table' with parameters.
     * <pre>
     * message: Could not find the data({0}).
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param arg0 The parameter arg0 for message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addErrorsCrudCouldNotFindCrudTable(String property, String arg0) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_crud_could_not_find_crud_table, arg0));
        return this;
    }

    /**
     * Add the created action message for the key 'success.crud_create_crud_table' with parameters.
     * <pre>
     * message: Created data.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addSuccessCrudCreateCrudTable(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(SUCCESS_crud_create_crud_table));
        return this;
    }

    /**
     * Add the created action message for the key 'success.crud_update_crud_table' with parameters.
     * <pre>
     * message: Updated data.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addSuccessCrudUpdateCrudTable(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(SUCCESS_crud_update_crud_table));
        return this;
    }

    /**
     * Add the created action message for the key 'success.crud_delete_crud_table' with parameters.
     * <pre>
     * message: Deleted data.
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FessMessages addSuccessCrudDeleteCrudTable(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(SUCCESS_crud_delete_crud_table));
        return this;
    }

    /**
     * The definition of keys for labels.
     * @author FreeGen
     */
    public static interface LabelKey extends FessLabels.LabelKey {
    }
}
