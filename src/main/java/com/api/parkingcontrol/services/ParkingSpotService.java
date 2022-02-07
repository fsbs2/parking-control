package com.api.parkingcontrol.services;

import com.api.parkingcontrol.repositories.ParkingSpotModelRepository;
import org.springframework.stereotype.Service;

@Service
public class ParkingSpotService {

    ParkingSpotModelRepository parkingSpotModelRepository;

    public ParkingSpotService(ParkingSpotModelRepository parkingSpotModelRepository) {
        this.parkingSpotModelRepository = parkingSpotModelRepository;
    }

}
