package com.api.flipkart.dao;

import com.api.flipkart.model.FlipkartProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlipkartDAO extends JpaRepository<FlipkartProduct, Integer> {

}