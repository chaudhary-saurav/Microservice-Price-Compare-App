package com.api.warehouse.service;

import com.api.warehouse.dto.WarehouseProductTO;
import com.api.warehouse.request.WarehouseRequest;

import java.util.List;

public interface WarehouseService {

    public String createmyproduct(List<WarehouseRequest> product);

    public List<WarehouseProductTO> getmyproduct();

    public List<WarehouseProductTO> getbyidmyproduct(int id);

    public String updatemyproduct(WarehouseRequest product);

    public boolean deletemyproduct(int id);

}
