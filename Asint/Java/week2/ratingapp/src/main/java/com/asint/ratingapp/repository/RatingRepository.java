package com.asint.ratingapp.repository;

import com.asint.ratingapp.model.Rating;
import com.asint.ratingapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RatingRepository extends JpaRepository<Rating, Long> {

    List<Rating> findByUser(User user);

    // Custom filtering - more can be added as needed

    @Query("SELECT r FROM Rating r WHERE "
            + "(:ambiance IS NULL OR r.ambiance = :ambiance) AND "
            + "(:food IS NULL OR r.food = :food) AND "
            + "(:service IS NULL OR r.service = :service) AND "
            + "(:cleanliness IS NULL OR r.cleanliness = :cleanliness) AND "
            + "(:drinks IS NULL OR r.drinks = :drinks)")
    List<Rating> findByFilters(Integer ambiance, Integer food, Integer service, Integer cleanliness, Integer drinks);
}
