package com.example.apiRestFoot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.apiRestFoot.controller.dto.PlayerRequestDto;
import com.example.apiRestFoot.model.Player;
import com.example.apiRestFoot.service.PlayerService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.time.LocalDateTime;
import java.util.Optional;

@RestController
@RequestMapping("/api/player")
public class PlayerController {

    PlayerService playerService;

    PlayerController(PlayerService playerService){
        this.playerService = playerService;
    }

    @GetMapping
    List<Player> get(){
        return playerService.get();
    }

    @GetMapping("/{playerId}")
    Optional<Player> getById(@PathVariable(name = "palyerId") Long id){
        return playerService.getById(id);
    }

    @PostMapping
    ResponseEntity<Map<String, Object>> create(final @RequestBody PlayerRequestDto playerRequestDto){
        Player playerToCreate = new Player();

        playerToCreate.setFirstname(playerRequestDto.getFirstname());
        playerToCreate.setLastname(playerRequestDto.getLastname());
        playerToCreate.setAddress(playerRequestDto.getAddress());
        playerToCreate.setPosition(playerRequestDto.getPosition());
        playerToCreate.setDateOfBirth(playerRequestDto.getDateOfBirth());
        playerToCreate.setCreatedAt(LocalDateTime.now());
        playerService.create(playerToCreate);

        Map<String, Object> responses = new HashMap<>();
        responses.put("created", "true");

        return ResponseEntity.ok(responses);
    }

    @DeleteMapping("/{playerId}")
    ResponseEntity<Map<String, Object>> delete(@PathVariable Long playerId){
        playerService.delete(playerId);

        Map<String, Object> responses = new HashMap<>();
        responses.put("deleted", "true");

        return ResponseEntity.ok(responses);
    }
}
