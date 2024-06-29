package com.telran.org.springbootdemotea.services;

import com.telran.org.springbootdemotea.model.Tea;

import java.util.Set;

public interface TeaService {

    Set<Tea> getAll();
    Tea getById(String uuid);
    Tea add(Tea tea);
}
