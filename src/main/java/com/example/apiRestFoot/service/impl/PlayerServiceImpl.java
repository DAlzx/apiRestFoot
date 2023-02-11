package com.example.apiRestFoot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apiRestFoot.model.Player;
import com.example.apiRestFoot.repository.TeamRepository;
import com.example.apiRestFoot.repository.PlayerRepository;
import com.example.apiRestFoot.service.PlayerService;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    PlayerRepository playerRepository;

    @Autowired
    TeamRepository teamRepository;

    @Override
    public void create(Player player) {
        playerRepository.save(player);
    }

    @Override
    public Optional<Player> getById(Long id) {
        return playerRepository.findById(id);
    }

    @Override
    public List<Player> get() {
        return playerRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        Optional<Player> playerToDelete = getById(id);
        playerRepository.delete(playerToDelete.get());
    }

    @Override
    public Optional<Player> update(Player player) {
        playerRepository.save(player);
        return Optional.empty();
    }
}
