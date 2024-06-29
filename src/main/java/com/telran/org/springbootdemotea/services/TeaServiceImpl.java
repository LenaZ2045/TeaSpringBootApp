package com.telran.org.springbootdemotea.services;

import com.telran.org.springbootdemotea.model.Tea;
import com.telran.org.springbootdemotea.repository.TeaINMemoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class TeaServiceImpl implements TeaService {

    // this is what we did in experience before
//    private TeaINMemoryRepository repository = new TeaINMemoryRepository();

    @Autowired
    private TeaINMemoryRepository repository; // this is what we will be doing now for Spring

    @Override
    public Set<Tea> getAll() {
        return repository.getAll();
    }

    @Override
    public Tea getById(String uuid) {
        return repository.getById(uuid);
    }

    @Override
    public Tea add(Tea tea) {
        return repository.addTea(tea);
    }
}