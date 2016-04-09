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
        products.add(new Product(35.75d,1000,"Soap","Soap"));
        products.add(new Product(45.50d,500,"Tooth Brushes","Tooth Brushes"));
        products.add(new Product(1500.0d,100,"Cloths","Cloths"));
        products.add(new Product(1000.0d,400,"Bags","Bags"));
        products.add(new Product(450.0d,800,"Bottles","Bottles"));
    }

    public void saveInitialBatch(){
        productRepository.save(products);
    }

   /* public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public Collection<Product> getAllProducts() {
        Iterable<Product> itr = productRepository.findAll();
        return (Collection<Product>)itr;
    }

    public boolean deleteProduct(Long proId) {
        Product temp = productRepository.findOne(proId);
        if(temp!=null){
            productRepository.delete(temp);
            return true;
        }
        return false;
    }

    public Product findProduct(Long proId) {
        return productRepository.findOne(proId);
    }

    public Product editProduct(Product product) {
        return productRepository.save(product);
    }*/

    public List<Product> findAll(){
        return productRepository.findAll();
    }

}
