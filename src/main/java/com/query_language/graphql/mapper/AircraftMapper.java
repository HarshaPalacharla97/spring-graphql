package com.query_language.graphql.mapper;


import com.query_language.graphql.dto.AircraftRequest;
import com.query_language.graphql.entity.Aircraft;
import com.query_language.graphql.enums.AircraftManufacturer;
import com.query_language.graphql.enums.AircraftStatus;

public class AircraftMapper {

    public Aircraft toEntity(AircraftRequest aircraftRequest){
        
        Aircraft aircraft = new Aircraft();
      
        aircraft.setTailNumber(aircraftRequest.getTailNumber());
        aircraft.setAircraftModel(aircraftRequest.getAircraftModel());
        aircraft.setAircraftManufacturer(AircraftManufacturer.valueOf(aircraftRequest.getAircraftManufacturer()));
        aircraft.setSerialNumber(aircraftRequest.getAircraftModel());
        aircraft.setManufactureDate(aircraftRequest.getManufactureDate());
        aircraft.setAircraftStatus(AircraftStatus.valueOf(aircraftRequest.getAircraftStatus()));
        aircraft.setCurrentLocation(aircraftRequest.getCurrentLocation());
        aircraft.setTotalFlightHours(aircraftRequest.getTotalFlightHours());
        aircraft.setTotalFlightCycles(aircraftRequest.getTotalFlightCycles());
        aircraft.setLastMaintenanceDate(aircraftRequest.getLastMaintenanceDate());
        aircraft.setNextMaintenanceDueDate(aircraftRequest.getNextMaintenanceDueDate());
        
        return aircraft;
    }
    
}
