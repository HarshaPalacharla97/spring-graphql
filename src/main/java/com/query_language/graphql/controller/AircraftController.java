package com.query_language.graphql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.query_language.graphql.entity.Aircraft;
import com.query_language.graphql.service.AircraftService;

@Controller
public class AircraftController {

    @Autowired
    private AircraftService aircraftService;

    @QueryMapping
    public Aircraft getAircraftInformation(@Argument String tailNumber){

        Aircraft aircraftResponse = aircraftService.fetchAircraftDetails(tailNumber);
        return aircraftResponse;
    }

    
    
}
