package com.cenfotec.graphql.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cenfotec.graphql.entities.*;

@Repository
public interface  VehicleRepository extends JpaRepository<Vehicle, Integer> {

}
