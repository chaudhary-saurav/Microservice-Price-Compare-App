package com.api.compare.rate.feign;

import com.api.compare.rate.response.ComparePortalResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "flipkart", url = "http://localhost:1234")
public interface CFlipkartProxy {
    @GetMapping("getFlipkartProducts")
    public ComparePortalResponse getProductInFlipkart();
}
