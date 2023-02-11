package com.example.apiRestFoot.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "team")
public class Team {
    // -- Import des d�pendances spring-boot-starter-data-jpa, mysql et h2 database
    // -- Cr�er son mod�le Student(nom, prenom, une date de naissance ainsi de suite)
    // -- Je vais determiner le nom de la table dans la BDD  => students
    // -- Creation de ma repository pour acceder aux fonctions offertes par jpa(hibernate) => StudentRepository
    // -- Controller(API REST) => Service(Business) => Repository(DAO - Acces aux sources de donnees externes)

    public Team(){
    }

    public Team(Long id, String name, String level, Integer nbPlayers, LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.nbPlayers = nbPlayers;
        this.createdAt = createdAt;
    
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String level;

    private Integer nbPlayers; // => date_of_birth

    private LocalDateTime createdAt; // => created_at

    @ManyToOne
    @JoinColumn(name = "club_id")
    private Club club;

    @OneToMany(mappedBy = "team")
    private List<Player> players;

    @OneToOne (mappedBy = "team")
    private Coach coach;    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Club getClub() {
        return club;
    }

    public void SetCoach(Coach coach) {
        this.coach = coach;
    }

    public Coach getCoach() {
        return coach;
    }

    public void SetClub(Club club) {
        this.club = club;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}

