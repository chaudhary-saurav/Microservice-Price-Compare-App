package com.api.compare.rate.feign;

import com.api.compare.rate.response.ComparePortalResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(contextId = "CAmazonProxy", name = "apigateway-service")
@FeignClient(name = "amazon", url = "http://localhost:5678")
public interface CAmazonProxy {
    @GetMapping("/getProductByIDInAmazon/{id}")
    public ComparePortalResponse getProductByIDInAmazon(@PathVariable int id);

    @GetMapping("/getAmazonProduct")
    public ComparePortalResponse getAmazonProduct();
}
