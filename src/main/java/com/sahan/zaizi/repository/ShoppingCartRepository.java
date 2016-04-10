package com.sahan.zaizi.repository;

import com.sahan.zaizi.domain.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by sahan on 4/9/2016.
 */
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {
    List<ShoppingCart> findByStatus(String status);
}
