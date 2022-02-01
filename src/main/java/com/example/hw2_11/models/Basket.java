package com.example.hw2_11.models;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.HashMap;

@Component
@SessionScope
public class Basket {
    private final HashMap<Integer, Integer> goods;

    public Basket() {

        this.goods = new HashMap<>();
    }

    public HashMap<Integer, Integer> getGoods() {
        return goods;
    }
}
