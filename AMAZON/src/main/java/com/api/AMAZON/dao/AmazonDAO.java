package com.api.AMAZON.dao;

import com.api.AMAZON.model.AmazonProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AmazonDAO extends JpaRepository<AmazonProduct, Integer> {

}