package com.rajeev.simpleWebApp.service;

import com.rajeev.simpleWebApp.model.Product;
import com.rajeev.simpleWebApp.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepo repo;

//    List<Product> products = new ArrayList<>(Arrays.asList(new Product(101, "Iphone", 50000), new Product(102, "Canon Camera", 7000), new Product(103, "Lenovo", 8000)));

    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElseGet(Product::new);
    }

    public void addProduct(Product prod) {
       repo.save(prod);
    }

    public void updateProduct(Product prod) {
       repo.save(prod);
    }

    public void deleteProduct(int prodId) {
       repo.deleteById(prodId);
    }
}
