package com.example.apiRestFoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.apiRestFoot.model.Coach;

@Repository
public interface CoachRepository extends JpaRepository<Coach, Long> {
}
