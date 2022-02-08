package com.api.parkingcontrol.services;

import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.repositories.ParkingSpotModelRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ParkingSpotService {

    ParkingSpotModelRepository parkingSpotModelRepository;

    public ParkingSpotService(ParkingSpotModelRepository parkingSpotModelRepository) {
        this.parkingSpotModelRepository = parkingSpotModelRepository;
    }

    public boolean existsByLicensePlateCar(String licensePlateCar) {
        return parkingSpotModelRepository.existsByLicensePlateCar(licensePlateCar);
    }

    public boolean existsByParkingSpotNumber(String parkingSpotNumber) {
        return parkingSpotModelRepository.existsByParkingSpotNumber(parkingSpotNumber);
    }

    public boolean existByApartmentAndBlock(String apartment, String block) {
        return parkingSpotModelRepository.existsByApartmentAndBlock(apartment,block);
    }

    @Transactional
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
        return parkingSpotModelRepository.save(parkingSpotModel);
    }
}
