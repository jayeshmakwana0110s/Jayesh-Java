package com.asint.ratingapp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

@Entity
@Table(name = "ratings")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    @JsonIgnoreProperties({"ratings", "password", "hibernateLazyInitializer", "handler"})
    private User user;

    @Min(1)
    @Max(5)
    private int ambiance;

    @Min(1)
    @Max(5)
    private int food;

    @Min(1)
    @Max(5)
    private int service;

    @Min(1)
    @Max(5)
    private int cleanliness;

    @Min(1)
    @Max(5)
    private int drinks;

    public Rating() {
    }

    public Rating(Long id, User user, int ambiance, int food, int service, int cleanliness, int drinks) {
        this.id = id;
        this.user = user;
        this.ambiance = ambiance;
        this.food = food;
        this.service = service;
        this.cleanliness = cleanliness;
        this.drinks = drinks;
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getAmbiance() {
        return ambiance;
    }

    public void setAmbiance(int ambiance) {
        this.ambiance = ambiance;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getService() {
        return service;
    }

    public void setService(int service) {
        this.service = service;
    }

    public int getCleanliness() {
        return cleanliness;
    }

    public void setCleanliness(int cleanliness) {
        this.cleanliness = cleanliness;
    }

    public int getDrinks() {
        return drinks;
    }

    public void setDrinks(int drinks) {
        this.drinks = drinks;
    }
}
