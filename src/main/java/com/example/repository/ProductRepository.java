package com.example.repository;

import com.example.model.Product;
import com.example.model.enums.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findAllBySellerUsername(String username);

    List<Product> findAllByNameContaining(String name);

    List<Product> findAllByCategory(ProductCategory category);
}
