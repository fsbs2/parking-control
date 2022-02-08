package com.api.parkingcontrol.services;

import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.repositories.ParkingSpotModelRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

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
        return parkingSpotModelRepository.existsByApartmentAndBlock(apartment, block);
    }

    @Transactional
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
        return parkingSpotModelRepository.save(parkingSpotModel);
    }

    public List<ParkingSpotModel> findAll() {
        return parkingSpotModelRepository.findAll();
    }

    public Optional<ParkingSpotModel> findById(UUID id) {
        return parkingSpotModelRepository.findById(id);
    }

    @Transactional
    public void delete(ParkingSpotModel parkingSpotModel) {
        parkingSpotModelRepository.delete(parkingSpotModel);
    }
}
