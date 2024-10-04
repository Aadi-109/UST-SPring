package com.example.travelplanner.repository;

import com.example.travelplanner.entity.Place;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlaceRepository extends JpaRepository<Place, Long> {

    @Query("SELECT p FROM Place p WHERE p.estimatedCost <= ?1 ORDER BY p.distanceFromTrivandrum ASC")
    List<Place> findPlacesWithinBudget(double budget);
}
