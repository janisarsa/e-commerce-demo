package com.decrochet.restapi.service;


import com.decrochet.restapi.model.Product;
import com.decrochet.restapi.model.User;

import org.springframework.stereotype.Service;
import com.decrochet.restapi.repo.ProductRepo;

import com.decrochet.restapi.repo.UserRepo;

import java.util.List;


@Service
public class ProductService {


    private final ProductRepo productRepo;

    // Guardar producto

    public Product save(Product product){
        return productRepo.save(product).orElse(null);
    }

    // Obtener producto

    public Product getProductByID(Long roleId) {
        return productRepo.findById(roleId).orElse(null);
    }

    public List<Product> getAll(Product product){
        return productRepo.getAll(product).orElse(null);
    }

    // Eliminar
    
    public void deleteById(Long roleId){
        productRepo.deleteById(roleId).orElse(null);
    }

}
