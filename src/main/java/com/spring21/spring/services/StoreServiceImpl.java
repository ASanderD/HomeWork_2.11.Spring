package com.spring21.spring.services;

import com.spring21.spring.stores.Basket;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class StoreServiceImpl implements StoreService {
    private final Basket basket;

    public StoreServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public void add(List<Integer> ids) {
        basket.add(ids);
    }

    @Override
    public Collection<Integer> get() {
        return basket.get();
    }
}
