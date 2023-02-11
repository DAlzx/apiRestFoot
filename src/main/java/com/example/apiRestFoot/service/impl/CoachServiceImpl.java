package com.example.apiRestFoot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apiRestFoot.model.Coach;
import com.example.apiRestFoot.repository.TeamRepository;
import com.example.apiRestFoot.repository.CoachRepository;
import com.example.apiRestFoot.service.CoachService;

import java.util.List;
import java.util.Optional;

@Service
public class CoachServiceImpl implements CoachService {

    @Autowired
    CoachRepository coachRepository;

    @Autowired
    TeamRepository teamRepository;

    @Override
    public void create(Coach coach) {
        coachRepository.save(coach);
    }

    @Override
    public Optional<Coach> getById(Long id) {
        return coachRepository.findById(id);
    }

    @Override
    public List<Coach> get() {
        return coachRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        Optional<Coach> coachToDelete = getById(id);
        coachRepository.delete(coachToDelete.get());
    }

    @Override
    public Optional<Coach> update(Coach coach) {
        coachRepository.save(coach);
        return Optional.empty();
    }
}
