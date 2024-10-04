package com.example.travelplanner.controller;

import com.example.travelplanner.dto.TravelRequestDTO;
import com.example.travelplanner.entity.Place;
import com.example.travelplanner.service.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/travel")
public class TravelController {

    @Autowired
    private TravelService travelService;

    @PostMapping("/plan")
    public List<Place> planTrip(@RequestBody TravelRequestDTO travelRequestDTO) {
        double budget = travelRequestDTO.getBudget();
        return travelService.getPlacesWithinBudget(budget);
    }
}
