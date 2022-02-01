package com.example.hw2_11.services.impl;

import com.example.hw2_11.models.Basket;
import com.example.hw2_11.services.BasketService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Map;

@Service
public class BasketServiceImpl implements BasketService {

    private final Basket basket;

    public BasketServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public void addGoods(ArrayList<Integer> idGoods) {
        for (Integer id : idGoods) {
            if (basket.getGoods().containsKey(id)) {
                basket.getGoods().put(id, basket.getGoods().get(id) + 1);
            } else {
                basket.getGoods().put(id, 1);
            }
        }
    }

    @Override
    public Map<Integer, Integer> getGoodsFromBasket() {
        return basket.getGoods();
    }
}
