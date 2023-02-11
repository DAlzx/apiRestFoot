package com.example.apiRestFoot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.apiRestFoot.controller.dto.ClubRequestDto;
import com.example.apiRestFoot.model.Club;
import com.example.apiRestFoot.service.ClubService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/club")
public class ClubController {

    ClubService clubService;

    ClubController(ClubService clubService){
        this.clubService = clubService;
    }

    @GetMapping
    List<Club> get(){
        return clubService.get();
    }

    @GetMapping("/{clubId}")
    Optional<Club> getById(@PathVariable(name = "clubId") Long id){
        return clubService.getById(id);
    }

    @PostMapping
    ResponseEntity<Map<String, Object>> create(final @RequestBody ClubRequestDto clubRequestDto){
        Club clubToCreate = new Club();

        clubToCreate.setName(clubRequestDto.getName());
        clubToCreate.setAddress(clubRequestDto.getAddress());
        clubToCreate.setCity(clubRequestDto.getCity());
        clubToCreate.setStade(clubRequestDto.getStade());
        clubToCreate.setDateOfCreation(clubRequestDto.getDateOfCreation());

        clubToCreate.setCreatedAt(LocalDateTime.now());
        clubToCreate.setUpdatedAt(LocalDateTime.now());
        clubService.create(clubToCreate);

        Map<String, Object> responses = new HashMap<>();
        responses.put("created", "true");

        return ResponseEntity.ok(responses);
    }

    @DeleteMapping("/{clubId}")
    ResponseEntity<Map<String, Object>> delete(@PathVariable Long clubId){
        clubService.delete(clubId);

        Map<String, Object> responses = new HashMap<>();
        responses.put("deleted", "true");

        return ResponseEntity.ok(responses);
    }
}
