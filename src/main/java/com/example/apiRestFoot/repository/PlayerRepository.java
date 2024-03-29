package com.example.apiRestFoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.apiRestFoot.model.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
}
