package com.api.warehouse.constant;

public class WarehouseConstant {

    public static final int SUCESS_CODE = 200;
    public static final int CREATED_CODE = 201;
    public static final int NOCONTENT_CODE = 204;
    public static final int PARTIALCONTENT_CODE = 206;
    public static final int BADREQUEST_CODE = 400;
    public static final int NOTFOUND_CODE = 404;
    public static final int METHODNOTALLOWED_CODE = 405;
    public static final int CONFLICT_CODE = 409;

    public static final String SUCESS_MSG = "The request has succeeded";
    public static final String CREATED_MSG = "The request has been fulfilled and resulted in a new resource being created";
    public static final String NOCONTENT_MSG = "The request has fulfilled the request but does not need to return an entity body";
    public static final String PARTIALCONTENT_MSG = "Content The server has fulfilled the partial GET request for the resource";
    public static final String BADREQUEST_MSG = "The request could not be understood by the server due to malformed syntax";
    public static final String NOTFOUND_MSG = "The server has not found anything matching the request URI";
    public static final String METHODNOTALLOWED_MSG = "The method specified in the request is not allowed for the resource identified by the request URI";
    public static final String CONFLICT_MSG = "The request could not be completed due to a conflict with the current state of resource";
    public static final String INSERTFAIL_MSG = "Data insertion in DB Failed";

}