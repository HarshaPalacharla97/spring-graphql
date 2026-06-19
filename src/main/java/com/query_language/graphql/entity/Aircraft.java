package com.query_language.graphql.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

import com.query_language.graphql.enums.AircraftManufacturer;
import com.query_language.graphql.enums.AircraftStatus;

@Entity
@Table(name = "aircraft")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Aircraft implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false, unique=true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String tailNumber;
    private String aircraftModel;
    @Enumerated(EnumType.STRING)
    private AircraftManufacturer aircraftManufacturer;
    private String serialNumber;
    private LocalDate manufactureDate;
    @Enumerated(EnumType.STRING)
    private AircraftStatus aircraftStatus;
    private String currentLocation;
    private Integer totalFlightHours;
    private Integer totalFlightCycles;
    private LocalDate lastMaintenanceDate;
    private LocalDate nextMaintenanceDueDate;

}
