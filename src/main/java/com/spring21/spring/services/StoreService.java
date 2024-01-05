package com.spring21.spring.services;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public interface StoreService {
    void add(List<Integer> ids);

    Collection<Integer> get();
}
