package com.query_language.graphql.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.query_language.graphql.entity.Aircraft;

@Repository
public interface AircraftRepository extends JpaRepository<Aircraft, Long> {

    Aircraft findBytailNumber(String tailNumber);
    
}
