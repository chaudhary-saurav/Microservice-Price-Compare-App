package com.api.compare.rate.dao;

import com.api.compare.rate.model.ComparePortalProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComparePortalDAO extends JpaRepository<ComparePortalProduct, Integer> {


}
