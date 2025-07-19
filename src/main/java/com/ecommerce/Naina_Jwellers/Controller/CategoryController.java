package com.ecommerce.Naina_Jwellers.Controller;

import java.util.*;

import com.ecommerce.Naina_Jwellers.Model.Category;
import com.ecommerce.Naina_Jwellers.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("api/public/categories")
    public List<Category> getAllcategories() {
        return categoryService.getAllCategories();
    }

    @PostMapping("api/public/categories")
    public String addCategory(@RequestBody Category category) {
        categoryService.addCategory(category);
        return "Category added successfully";
    }

}
