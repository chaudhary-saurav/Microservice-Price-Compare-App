package com.api.flipkart.feign;

import com.api.flipkart.response.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "productmanufacturer", url = "localhost:7301")
public interface FProductManufacturerProxy {
    @GetMapping("/getallproduct")
    public Response getuserDetailsFromUserService();

}