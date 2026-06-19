package com.query_language.graphql.dto;


import java.time.LocalDate;

import jakarta.persistence.Column;
import lombok.Data;
import lombok.NonNull;

@Data
public class AircraftRequest{
    
    @NonNull
    private Long id;
    private String tailNumber;
    private String aircraftModel;
    private String aircraftManufacturer;
    private String serialNumber;
    private LocalDate manufactureDate;
    private String aircraftStatus;
    private String currentLocation;
    private Integer totalFlightHours;
    private Integer totalFlightCycles;
    private LocalDate lastMaintenanceDate;
    private LocalDate nextMaintenanceDueDate;
}
