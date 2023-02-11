package com.example.apiRestFoot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.apiRestFoot.controller.dto.CoachRequestDto;
import com.example.apiRestFoot.model.Coach;
import com.example.apiRestFoot.service.CoachService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.time.LocalDateTime;
import java.util.Optional;

@RestController
@RequestMapping("/api/coach")
public class CoachController {

    CoachService coachService;

    CoachController(CoachService coachService){
        this.coachService = coachService;
    }

    @GetMapping
    List<Coach> get(){
        return coachService.get();
    }

    @GetMapping("/{coachId}")
    Optional<Coach> getById(@PathVariable(name = "coachId") Long id){
        return coachService.getById(id);
    }

    @PostMapping
    ResponseEntity<Map<String, Object>> create(final @RequestBody CoachRequestDto coachRequestDto){
        Coach coachToCreate = new Coach();

        coachToCreate.setFirstname(coachRequestDto.getFirstname());
        coachToCreate.setLastname(coachRequestDto.getLastname());
        coachToCreate.setAddress(coachRequestDto.getAddress());
        coachToCreate.setDateOfBirth(coachRequestDto.getDateOfBirth());
        coachToCreate.setCreatedAt(LocalDateTime.now());
        coachService.create(coachToCreate);

        Map<String, Object> responses = new HashMap<>();
        responses.put("created", "true");

        return ResponseEntity.ok(responses);
    }

    @DeleteMapping("/{coachId}")
    ResponseEntity<Map<String, Object>> delete(@PathVariable Long playerId){
        coachService.delete(playerId);

        Map<String, Object> responses = new HashMap<>();
        responses.put("deleted", "true");

        return ResponseEntity.ok(responses);
    }
}
