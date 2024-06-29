package com.telran.org.springbootdemotea.repository;

import com.telran.org.springbootdemotea.model.Tea;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class TeaINMemoryRepository {

    private Map<String, Tea> teaStorage = new HashMap<>();

    public TeaINMemoryRepository() {
        init();
    }

    private void init() {
        Tea bergamotBlackTea = new Tea("Bergamot Black Tea");
        Tea greenTea = new Tea("Green Tea");
        Tea englishBlackTea = new Tea("English Black Tea");
        Tea raspberryLemonTea = new Tea("Raspberry Lemon Tea ");
        teaStorage.put(bergamotBlackTea.getId(), bergamotBlackTea);
        teaStorage.put(greenTea.getId(), greenTea);
        teaStorage.put(englishBlackTea.getId(), englishBlackTea);
        teaStorage.put(raspberryLemonTea.getId(), raspberryLemonTea);
    }

    public Set<Tea> getAll() {
        return new HashSet<>(teaStorage.values());
    }

    public Tea addTea(Tea tea) {
        Tea newTea = new Tea(tea.getName());
        teaStorage.put(newTea.getId(), newTea);
        return newTea;
    }

    public Tea getById(String uuid) {
        return teaStorage.get(uuid);
    }
}