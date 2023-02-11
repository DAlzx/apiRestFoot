package com.example.apiRestFoot.service;

import java.util.List;
import java.util.Optional;

import com.example.apiRestFoot.model.Team;

public interface TeamService {
    void create(Team team);
    Optional<Team> getById(Long id);
    List<Team> get();
    void delete(Long id);
    Optional<Team> update(Team team);
}
