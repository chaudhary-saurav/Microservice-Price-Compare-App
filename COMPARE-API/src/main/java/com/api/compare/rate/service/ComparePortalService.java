package com.api.compare.rate.service;

import com.api.compare.rate.dto.ComparePortalTO;

import java.util.List;

public interface ComparePortalService {

    public String addProductFromManufacturer(List<ComparePortalTO> manufacturerProductDetails);
    public List<ComparePortalTO> getProductID();
}
