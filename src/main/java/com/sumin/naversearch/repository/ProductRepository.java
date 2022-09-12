package com.sumin.naversearch.repository;

import com.sumin.naversearch.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
