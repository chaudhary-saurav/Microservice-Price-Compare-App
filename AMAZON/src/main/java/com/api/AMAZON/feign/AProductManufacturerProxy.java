package com.api.AMAZON.feign;

import com.api.AMAZON.response.AmazonResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "productmanufacturer", url = "localhost:7301")
public interface AProductManufacturerProxy {
    @GetMapping("/getallproduct")
    public AmazonResponse getuserDetailsFromUserService();

}
