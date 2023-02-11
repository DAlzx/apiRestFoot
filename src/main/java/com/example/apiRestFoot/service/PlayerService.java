package com.example.apiRestFoot.service;

import java.util.List;
import java.util.Optional;

import com.example.apiRestFoot.model.Player;

public interface PlayerService {
    void create(Player player);
    Optional<Player> getById(Long id);
    List<Player> get();
    void delete(Long id);
    Optional<Player> update(Player player);
}
