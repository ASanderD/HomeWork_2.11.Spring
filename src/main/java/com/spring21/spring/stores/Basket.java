package com.spring21.spring.stores;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


    @Component
    @SessionScope
    public class Basket {
        private final List<Integer> ids = new ArrayList<>();

        public void add(List<Integer> ids) {
            this.ids.addAll(ids);
        }

        public Collection<Integer> get() {
            return Collections.unmodifiableCollection(ids);
        }
}
