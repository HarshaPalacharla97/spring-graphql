package com.query_language.graphql.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.query_language.graphql.entity.Aircraft;
import com.query_language.graphql.mapper.AircraftMapper;
import com.query_language.graphql.dto.AircraftRequest;
import com.query_language.graphql.repository.AircraftRepository;


@Service
public class AircraftService {

    @Autowired
    private AircraftRepository aircraftRepository;
    // @Autowired
    // private AircraftMapper aircraftMapper;

    public Aircraft fetchAircraftDetails(String tailNumber){
        Aircraft aircraftInfo = aircraftRepository.findBytailNumber(tailNumber);
        if(aircraftInfo != null){
            return aircraftInfo;
        }
        return null;
    }


    public void addAircraftDetails(AircraftRequest aircraftRequest){
        // try{
        //     if(aircraftTailNumber != null){
        //         Aircraft retrivedAircraft = aircraftRepository.findBytailNumber(aircraftTailNumber);
        //         if(retrivedAircraft != null){
        //             Aircraft mappedAircraftEntity = aircraftMapper.toEntity(aircraftRequest);
        //             aircraftRepository.save(mappedAircraftEntity);
        //         }
        //     }else{
        //         return "No Aircraft Present with tailNumber :: "+aircraftTailNumber;
        //     }
        // }catch(Exception e){
        //     e.printStackTrace();
        // }
        // return "AIrcraft Saved Succssefully"


    }
    
}
