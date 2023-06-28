package com.daviqueiroz.springbootecommerce.dao;

import com.daviqueiroz.springbootecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
