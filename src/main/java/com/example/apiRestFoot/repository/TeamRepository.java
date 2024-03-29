package com.example.apiRestFoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.apiRestFoot.model.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {
}