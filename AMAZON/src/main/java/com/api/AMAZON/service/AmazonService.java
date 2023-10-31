package com.api.AMAZON.service;

import com.api.AMAZON.dto.AmazonTO;
import com.api.AMAZON.request.AmazonRequest;

import java.util.List;

public interface AmazonService {

    public String addProductFromManufacturer(List<AmazonTO> manufacturerProductDetails);
    public List<AmazonTO> getByIDProductInAmazon(int id);
    public List<AmazonTO> getAllProductInAmazon();
    public String addProductInAmazon(List<AmazonRequest> request);
    public String updateProductInAmazon(AmazonRequest request);
    public boolean deleteProductInAmazon(int id);

}