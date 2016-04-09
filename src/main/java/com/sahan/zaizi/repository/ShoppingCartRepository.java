package com.sahan.zaizi.repository;

import com.sahan.zaizi.domain.ShoppingCart;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by sahan on 4/9/2016.
 */
public interface ShoppingCartRepository extends CrudRepository<ShoppingCart, Long> {
}
