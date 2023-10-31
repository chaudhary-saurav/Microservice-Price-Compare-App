package com.api.warehouse.dao;

import com.api.warehouse.model.WarehouseProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WarehouseDAO extends JpaRepository<WarehouseProduct, Integer> {

}
