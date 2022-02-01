package com.example.hw2_11.services;

import java.util.ArrayList;
import java.util.Map;

public interface BasketService {
    void addGoods(ArrayList<Integer> idGoods);
    Map<Integer, Integer> getGoodsFromBasket();
}
