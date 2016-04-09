package com.sahan.zaizi.repository;

import com.sahan.zaizi.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by sahan on 4/8/2016.
 */
public interface ProductRepository extends JpaRepository<Product, Long> {

}
