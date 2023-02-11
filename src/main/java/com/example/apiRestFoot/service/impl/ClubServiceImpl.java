package com.example.apiRestFoot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apiRestFoot.model.Club;
import com.example.apiRestFoot.repository.ClubRepository;
import com.example.apiRestFoot.repository.PlayerRepository;
import com.example.apiRestFoot.service.ClubService;

import java.util.List;
import java.util.Optional;

@Service
public class ClubServiceImpl implements ClubService {

    @Autowired
    ClubRepository clubRepository;

    @Autowired
    PlayerRepository playerRepository;

    @Override
    public void create(Club club) {
        clubRepository.save(club);
    }

    @Override
    public Optional<Club> getById(Long id) {
        return clubRepository.findById(id);
    }

    @Override
    public List<Club> get() {
        return clubRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        Optional<Club> clubToDelete = getById(id);
        clubRepository.delete(clubToDelete.get());
    }

    @Override
    public Optional<Club> update(Club club) {
        clubRepository.save(club);
        return Optional.empty();
    }
}
