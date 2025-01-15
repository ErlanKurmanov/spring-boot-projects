package com.example.dream_shop_connectingsql.repository;

import com.example.dream_shop_connectingsql.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository <Cart, Long > {
    Cart findByUserId(Long userId);
}