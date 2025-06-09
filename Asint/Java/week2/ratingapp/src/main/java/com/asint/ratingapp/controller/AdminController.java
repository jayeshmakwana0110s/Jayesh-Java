package com.asint.ratingapp.controller;

import com.asint.ratingapp.model.Rating;
import com.asint.ratingapp.repository.RatingRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/admin")

public class AdminController {

    private final RatingRepository ratingRepository;

    public AdminController(RatingRepository ratingRepository) {
        this.ratingRepository = ratingRepository;
    }

    // Filter ratings by multiple criteria - any combination can be null to ignore
    @GetMapping("/ratings/filter")
    public ResponseEntity<?> filterRatings(
            @RequestParam(required = false) Integer ambiance,
            @RequestParam(required = false) Integer food,
            @RequestParam(required = false) Integer service,
            @RequestParam(required = false) Integer cleanliness,
            @RequestParam(required = false) Integer drinks
    ) {
        List<Rating> filtered = ratingRepository.findByFilters(ambiance, food, service, cleanliness, drinks);
        return ResponseEntity.ok(filtered);
    }

    @GetMapping("/ratings/with-users")
    public ResponseEntity<?> getAllRatingsWithUsers() {
        List<Rating> ratings = ratingRepository.findAll();

        if (ratings.isEmpty()) {
            return ResponseEntity.ok(Map.of("message", "No ratings found"));
        }

        return ResponseEntity.ok(ratings);
    }
    @GetMapping("/ratings/report")
    public ResponseEntity<?> getRatingsReport() {
        List<Rating> allRatings = ratingRepository.findAll();

        if (allRatings.isEmpty()) {
            return ResponseEntity.ok(Map.of("message", "No ratings available"));
        }

        double avgAmbiance = allRatings.stream().mapToInt(Rating::getAmbiance).average().orElse(0);
        double avgFood = allRatings.stream().mapToInt(Rating::getFood).average().orElse(0);
        double avgService = allRatings.stream().mapToInt(Rating::getService).average().orElse(0);
        double avgCleanliness = allRatings.stream().mapToInt(Rating::getCleanliness).average().orElse(0);
        double avgDrinks = allRatings.stream().mapToInt(Rating::getDrinks).average().orElse(0);

        double overallAvg = (avgAmbiance + avgFood + avgService + avgCleanliness + avgDrinks) / 5.0;

        Map<String, Object> report = new HashMap<>();
        report.put("averageAmbiance", avgAmbiance);
        report.put("averageFood", avgFood);
        report.put("averageService", avgService);
        report.put("averageCleanliness", avgCleanliness);
        report.put("averageDrinks", avgDrinks);
        report.put("overallAverage", overallAvg);

        return ResponseEntity.ok(report);
    }
}
