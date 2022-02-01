package com.example.hw2_11.controllers;

import com.example.hw2_11.services.BasketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Map;

@RestController
@RequestMapping("/order")
public class BasketController {

    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }


    @GetMapping("/add")
    public void addGoods(@RequestParam("id")ArrayList<Integer> idGoods) {

        basketService.addGoods(idGoods);
    }

    @GetMapping("/get")
    public Map<Integer, Integer> getGoodsFromBasket() {

        return basketService.getGoodsFromBasket();
    }
}
