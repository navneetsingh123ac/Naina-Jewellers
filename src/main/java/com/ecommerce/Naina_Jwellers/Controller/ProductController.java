package com.ecommerce.Naina_Jwellers.Controller;

import com.ecommerce.Naina_Jwellers.Model.Product;
import com.ecommerce.Naina_Jwellers.Service.implement.ProductServiceImpl;
import com.ecommerce.Naina_Jwellers.payload.ProductDTO;
import com.ecommerce.Naina_Jwellers.payload.ProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductServiceImpl productService;

    @PostMapping("/admin/categories/{categoryId}/product")
    public ResponseEntity<ProductDTO> addProduct(@RequestBody Product product, @PathVariable Long categoryId) {
        ProductDTO productDTO = productService.addProduct(categoryId, product);
        return new ResponseEntity<>(productDTO, HttpStatus.OK);
    }
    @GetMapping("/public/products")
    public ResponseEntity<ProductResponse> getAllProducts() {
        ProductResponse productResponse = productService.getAllProducts();
        return new ResponseEntity<>(productResponse, HttpStatus.OK);
    }

    @GetMapping("/public/categories/{categoryId}/products")
    public ResponseEntity<ProductResponse> getProductByCategory(@PathVariable Long categoryId) {
        ProductResponse productResponse = productService.serachByCategory(categoryId);
        return new ResponseEntity<>(productResponse, HttpStatus.OK);
    }
}
