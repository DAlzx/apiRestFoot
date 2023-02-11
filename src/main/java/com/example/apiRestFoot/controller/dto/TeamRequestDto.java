package com.example.apiRestFoot.controller.dto;


public class TeamRequestDto {
    private String name;

    private String level;

    private Integer nbPlayers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Integer getNbPlayers() {
        return nbPlayers;
    }

    public void setNbPlayers(Integer nbPlayers) {
        this.nbPlayers = nbPlayers;
    }
}
