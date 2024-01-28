package com.example.billingservice.repository;

import com.example.billingservice.entites.Bill;
import com.example.billingservice.entites.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductItemRepository extends JpaRepository<ProductItem,Long> {

}
