package com.api.flipkart.response;

import com.api.flipkart.dto.FlipkartTO;

import java.util.List;

public class FlipkartResponse {

    private int applicationport;
    private String applicationname;
    private int statuscode;
    private String message;
    private List<FlipkartTO> productDetails;

    public FlipkartResponse() {
    }

    public FlipkartResponse(int applicationport, String applicationname, int statuscode, String message,
                            List<FlipkartTO> productDetails) {
        super();
        this.applicationport = applicationport;
        this.applicationname = applicationname;
        this.statuscode = statuscode;
        this.message = message;
        this.productDetails = productDetails;
    }

    public int getApplicationport() {
        return applicationport;
    }

    public void setApplicationport(int applicationport) {
        this.applicationport = applicationport;
    }

    public String getApplicationname() {
        return applicationname;
    }

    public void setApplicationname(String applicationname) {
        this.applicationname = applicationname;
    }

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

    public List<FlipkartTO> getProductDetails() {
        return productDetails;
    }

    public void setProductDetails(List<FlipkartTO> productDetails) {
        this.productDetails = productDetails;
    }

    @Override
    public String toString() {
        return "FlipkartResponse [applicationport=" + applicationport + ", applicationname=" + applicationname
                + ", statuscode=" + statuscode + ", message=" + message + ", productDetails=" + productDetails + "]";
    }

}