package com.asint.ratingapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.Set;

@Entity
@Table(name = "users")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @NotNull(message = "Name is required")
        @Column(nullable = false)
        private String name;

        @NotNull(message = "Email is required")
        @Column(nullable = false, unique = true)
        private String email;

        @NotNull(message = "Password is required")
        @Column(nullable = false)
        @JsonIgnore // do not expose password
        private String password;

        private String role;

        @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
        @JsonIgnore
        private Set<Rating> ratings;

        public User() {
        }

        public User(Long id, String name, String email, String password, String role, Set<Rating> ratings) {
                this.id = id;
                this.name = name;
                this.email = email;
                this.password = password;
                this.role = role;
                this.ratings = ratings;
        }

        // Getters and setters

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

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public String getPassword() {
                return password;
        }

        public void setPassword(String password) {
                this.password = password;
        }

        public String getRole() {
                return role;
        }

        public void setRole(String role) {
                this.role = role;
        }

        public Set<Rating> getRatings() {
                return ratings;
        }

        public void setRatings(Set<Rating> ratings) {
                this.ratings = ratings;
        }
}
