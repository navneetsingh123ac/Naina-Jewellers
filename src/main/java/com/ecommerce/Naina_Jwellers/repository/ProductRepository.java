package com.ecommerce.Naina_Jwellers.repository;

import com.ecommerce.Naina_Jwellers.Model.Category;
import com.ecommerce.Naina_Jwellers.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCategoryOrderByPriceAsc(Category category);
}
