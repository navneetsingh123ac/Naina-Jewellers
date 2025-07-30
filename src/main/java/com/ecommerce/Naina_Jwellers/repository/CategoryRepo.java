package com.ecommerce.Naina_Jwellers.repository;

import com.ecommerce.Naina_Jwellers.Model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepo extends JpaRepository<Category, Long> {
    public Category findByName(String name);
}
