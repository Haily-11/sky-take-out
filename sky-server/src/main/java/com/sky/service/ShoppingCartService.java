package com.sky.service;

import com.sky.dto.ShoppingCartDTO;
import org.apache.ibatis.annotations.Mapper;


public interface ShoppingCartService {

    /**
     * 添加购物车
     * @param shoppingCartDTO
     */
    void addShoppingCart(ShoppingCartDTO shoppingCartDTO);
}
