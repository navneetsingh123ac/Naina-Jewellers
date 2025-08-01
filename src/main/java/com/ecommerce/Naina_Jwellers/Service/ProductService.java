package com.ecommerce.Naina_Jwellers.Service;

import com.ecommerce.Naina_Jwellers.Model.Product;
import com.ecommerce.Naina_Jwellers.payload.ProductDTO;
import com.ecommerce.Naina_Jwellers.payload.ProductResponse;

public interface ProductService {

    public ProductDTO addProduct(Long categoryId, Product product);

    public ProductResponse getAllProducts();

    ProductResponse serachByCategory(Long categoryId);
}
