package com.example.travelplanner.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double distanceFromTrivandrum;  // in kilometers
    private double estimatedCost;  // cost to travel

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getDistanceFromTrivandrum() { return distanceFromTrivandrum; }
    public void setDistanceFromTrivandrum(double distanceFromTrivandrum) { this.distanceFromTrivandrum = distanceFromTrivandrum; }

    public double getEstimatedCost() { return estimatedCost; }
    public void setEstimatedCost(double estimatedCost) { this.estimatedCost = estimatedCost; }
}
