package com.example.PMS.services;

import com.example.PMS.models.product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<product, Integer> {
}
