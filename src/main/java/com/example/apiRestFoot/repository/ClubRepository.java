package com.example.apiRestFoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.apiRestFoot.model.Club;

@Repository
public interface ClubRepository extends JpaRepository<Club, Long> {
}
