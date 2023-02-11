package com.example.apiRestFoot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.apiRestFoot.controller.dto.TeamRequestDto;
import com.example.apiRestFoot.model.Team;
import com.example.apiRestFoot.service.TeamService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/team")
public class TeamController {

    TeamService teamService;

    TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping
    List<Team> get(){
        return teamService.get();
    }

    @GetMapping("/{teamid}")
    Optional<Team> getById(@PathVariable(name = "teamid") Long id){
        return teamService.getById(id);
    }

    @PostMapping
    ResponseEntity<Map<String, Object>> create(final @RequestBody TeamRequestDto teamRequestDto){
        Team teamToCreate = new Team();

        teamToCreate.setName(teamRequestDto.getName());
        teamToCreate.setLevel(teamRequestDto.getLevel());
        teamToCreate.setNbPlayers(teamRequestDto.getNbPlayers());

        Map<String, Object> responses = new HashMap<>();
        responses.put("created", "true");

        return ResponseEntity.ok(responses);
    }

    @DeleteMapping("/{teamid}")
    ResponseEntity<Map<String, Object>> delete(@PathVariable Long teamid){
        teamService.delete(teamid);

        Map<String, Object> responses = new HashMap<>();
        responses.put("deleted", "true");

        return ResponseEntity.ok(responses);
    }

    
}
