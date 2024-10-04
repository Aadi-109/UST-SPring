package com.example.travelplanner.service;

import com.example.travelplanner.entity.Place;
import com.example.travelplanner.repository.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravelService {

    @Autowired
    private PlaceRepository placeRepository;

    public List<Place> getPlacesWithinBudget(double budget) {
        return placeRepository.findPlacesWithinBudget(budget);
    }
}