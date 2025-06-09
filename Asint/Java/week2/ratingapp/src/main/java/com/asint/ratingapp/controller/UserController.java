package com.asint.ratingapp.controller;

import com.asint.ratingapp.model.Rating;
import com.asint.ratingapp.model.User;
import com.asint.ratingapp.repository.RatingRepository;
import com.asint.ratingapp.repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")

public class UserController {

    private final UserRepository userRepository;
    private final RatingRepository ratingRepository;

    public UserController(UserRepository userRepository, RatingRepository ratingRepository) {
        this.userRepository = userRepository;
        this.ratingRepository = ratingRepository;
    }

    @PostMapping("/rate")
    public ResponseEntity<?> rateServices(@Valid @RequestBody Rating rating, Authentication authentication) {
        String email = authentication.getName();
        User user = userRepository.findByEmail(email).orElseThrow();

        rating.setUser(user);

        ratingRepository.save(rating);
        return ResponseEntity.ok().body("Rating submitted successfully");
    }
}
