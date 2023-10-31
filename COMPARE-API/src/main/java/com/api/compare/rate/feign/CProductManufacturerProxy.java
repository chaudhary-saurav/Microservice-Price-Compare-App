package com.api.compare.rate.feign;

import com.api.compare.rate.response.ComparePortalResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "productmanufacturer", url = "http://localhost:7301")
public interface CProductManufacturerProxy {
    @GetMapping("/getallproduct")
    public ComparePortalResponse getFromWarehouseService();
}
