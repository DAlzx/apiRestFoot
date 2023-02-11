package com.example.apiRestFoot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apiRestFoot.model.Team;
import com.example.apiRestFoot.repository.TeamRepository;
import com.example.apiRestFoot.service.TeamService;

import java.util.List;
import java.util.Optional;

@Service
public class TeamServiceImpl implements TeamService {

    @Autowired
    TeamRepository teamRepository;

    @Override
    public void create(Team team) {
        teamRepository.save(team);
    }

    @Override
    public Optional<Team> getById(Long id) {
        return teamRepository.findById(id);
    }

    @Override
    public List<Team> get() {
        return teamRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        Optional<Team> teamToDelete = getById(id);
        teamRepository.delete(teamToDelete.get());
    }

    @Override
    public Optional<Team> update(Team team) {
        teamRepository.save(team);
        return Optional.empty();
    }
}
