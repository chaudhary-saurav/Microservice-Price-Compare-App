package com.api.flipkart.service;

import com.api.flipkart.dto.FlipkartTO;
import com.api.flipkart.request.FlipkartRequest;

import java.util.List;

public interface FlipkartService {

    public String addProductFromManufacturer(List<FlipkartTO> manufacturerProductDetails);

    public List<FlipkartTO> getByIDProductInFlipkart(int id);

    public List<FlipkartTO> getAllProductInFlipkart();

    public String addProductInFlipkart(List<FlipkartRequest> request);

    public String updateProductInFlipkart(FlipkartRequest request);

    public boolean deleteProductInFlipkart(int id);
}