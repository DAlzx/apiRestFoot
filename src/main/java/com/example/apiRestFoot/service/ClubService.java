package com.example.apiRestFoot.service;

import java.util.List;
import java.util.Optional;

import com.example.apiRestFoot.model.Club;

public interface ClubService {
    void create(Club club);
    Optional<Club> getById(Long id);
    List<Club> get();
    void delete(Long id);
    Optional<Club> update(Club club);
}