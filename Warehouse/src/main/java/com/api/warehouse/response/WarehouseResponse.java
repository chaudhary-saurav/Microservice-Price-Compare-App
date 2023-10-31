package com.api.warehouse.response;

import com.api.warehouse.dto.WarehouseProductTO;

import java.util.List;

public class WarehouseResponse {

    private int statuscode;
    private String message;
    private int port;
    private String appname;

    private List<WarehouseProductTO> productDetails;

    public int getStatuscode() {
        return statuscode;
    }

    public void setStatuscode(int statuscode) {
        this.statuscode = statuscode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<WarehouseProductTO> getProductDetails() {
        return productDetails;
    }

    public void setProductDetails(List<WarehouseProductTO> productDetails) {
        this.productDetails = productDetails;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getAppname() {
        return appname;
    }

    public void setAppname(String appname) {
        this.appname = appname;
    }

    @Override
    public String toString() {
        return "WarehouseResponse [statuscode=" + statuscode + ", message=" + message + ", port=" + port + ", appname="
                + appname + ", productDetails=" + productDetails + "]";
    }
}
