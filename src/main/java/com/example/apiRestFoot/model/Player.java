package com.example.apiRestFoot.model;

import jakarta.persistence.*;
import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Table(name = "player")
public class Player {
    // -- Import des d�pendances spring-boot-starter-data-jpa, mysql et h2 database
    // -- Cr�er son mod�le Student(nom, prenom, une date de naissance ainsi de suite)
    // -- Je vais determiner le nom de la table dans la BDD  => students
    // -- Creation de ma repository pour acceder aux fonctions offertes par jpa(hibernate) => StudentRepository
    // -- Controller(API REST) => Service(Business) => Repository(DAO - Acces aux sources de donnees externes)

    public Player(){
    }

    public Player(Long id, String firstname, String lastname, String address, String position, Date dateOfBirth, LocalDateTime createdAt) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.position = position;
        this.dateOfBirth = dateOfBirth;
        this.createdAt = createdAt;
    
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstname;

    private String lastname;

    private String address;

    private String position;

    private Date dateOfBirth; // => date_of_birth

    private LocalDateTime createdAt; // => created_at

    @ManyToOne
    @JoinColumn(name = "club_id")
    private Club club;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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

    public void SetClub(Club club) {
        this.club = club;
    }

    public Team getTeam() { 
        return team;
    }

    public void SetTeam(Team team) {
        this.team = team;
    }
}

