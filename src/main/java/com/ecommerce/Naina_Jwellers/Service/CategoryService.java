package com.ecommerce.Naina_Jwellers.Service;

import com.ecommerce.Naina_Jwellers.Model.Category;
import com.ecommerce.Naina_Jwellers.payload.CategoryDTO;
import com.ecommerce.Naina_Jwellers.payload.CategoryResponse;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CategoryService {
     CategoryResponse getAllCategories(Integer pageNumber, Integer pageSize);
     CategoryDTO addCategory(CategoryDTO categoryDTO);
     CategoryDTO deleteCategory(Long id);
     CategoryDTO updateCategory(CategoryDTO categoryDTO, Long categoryId);
}
