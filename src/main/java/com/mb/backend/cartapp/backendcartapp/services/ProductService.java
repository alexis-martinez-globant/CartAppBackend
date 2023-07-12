package com.mb.backend.cartapp.backendcartapp.services;

import java.util.List;
import com.mb.backend.cartapp.backendcartapp.models.entities.Product;

public interface ProductService {
    List<Product> findAll();
}
