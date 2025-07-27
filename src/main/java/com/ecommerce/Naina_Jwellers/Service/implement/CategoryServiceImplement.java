package com.ecommerce.Naina_Jwellers.Service.implement;

import com.ecommerce.Naina_Jwellers.Model.Category;
import com.ecommerce.Naina_Jwellers.Service.CategoryService;
import com.ecommerce.Naina_Jwellers.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImplement implements CategoryService {

    //private List<Category> categories = new ArrayList<Category>();

    @Autowired
    private CategoryRepo categoryRepo;

    @Override
    public List<Category> getAllCategories() {
        return categoryRepo.findAll();
    }

    @Override
    public void addCategory(Category category) {
        categoryRepo.save(category);
    }

    @Override
    public String deleteCategory(Long id) {
        Category category = categoryRepo.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource not found"));
        categoryRepo.delete(category);
        return "Category with ID: " + id + " was deleted";
    }

    @Override
    public Category updateCategory(Category category, Long categoryId) {
        Category existingCategory = categoryRepo.findById(categoryId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Category not found"));
        existingCategory.setName(category.getName());
        return categoryRepo.save(existingCategory);
    }


}
