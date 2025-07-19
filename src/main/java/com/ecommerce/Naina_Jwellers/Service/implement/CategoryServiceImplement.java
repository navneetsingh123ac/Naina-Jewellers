package com.ecommerce.Naina_Jwellers.Service.implement;

import com.ecommerce.Naina_Jwellers.Model.Category;
import com.ecommerce.Naina_Jwellers.Service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImplement implements CategoryService {

    private List<Category> categories = new ArrayList<Category>();
    @Override
    public List<Category> getAllCategories() {
        return categories;
    }

    @Override
    public void addCategory(Category category) {
        categories.add(category);
    }
}
