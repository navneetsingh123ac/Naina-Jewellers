package com.ecommerce.Naina_Jwellers.Service;

import com.ecommerce.Naina_Jwellers.Model.Category;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CategoryService {
    public List<Category> getAllCategories();
    public void addCategory(Category category);
}
