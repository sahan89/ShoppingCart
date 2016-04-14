package com.sahan.zaizi.service;

import com.sahan.zaizi.domain.Product;
import com.sahan.zaizi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sahan on 4/8/2016.
 */
@Service
@Transactional
public class ProductService{

    @Autowired
    private ProductRepository productRepository;

    private static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(35.75d,1000,"Pears baby soap for Kids","Soap"));
        products.add(new Product(45.50d,500,"Signal Tooth Brushes Size in (L, M, S)","Tooth Brushes"));
        products.add(new Product(1500.0d,100,"Casual Shirt imported from France","Cloths"));
        products.add(new Product(1000.0d,400,"Leather bag imported from USA ","Bags"));
        products.add(new Product(450.0d,800,"Hot Water Bottles","Bottles"));
    }

    public void saveInitialBatch(){
        productRepository.save(products);
    }

    public List<Product> findAll(){
        return productRepository.findAll();
    }


}
