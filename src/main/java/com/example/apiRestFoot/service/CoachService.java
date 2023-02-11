package com.example.apiRestFoot.service;

import java.util.List;
import java.util.Optional;

import com.example.apiRestFoot.model.Coach;

public interface CoachService {
    void create(Coach coach);
    Optional<Coach> getById(Long id);
    List<Coach> get();
    void delete(Long id);
    Optional<Coach> update(Coach coach);
}
