package com.api.parkingcontrol.services;

import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.repositories.ParkingSpotModelRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
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

    public Page<ParkingSpotModel> findAll(Pageable pageable) {
        return parkingSpotModelRepository.findAll(pageable);
    }

    public Optional<ParkingSpotModel> findById(UUID id) {
        return parkingSpotModelRepository.findById(id);
    }

    @Transactional
    public void delete(ParkingSpotModel parkingSpotModel) {
        parkingSpotModelRepository.delete(parkingSpotModel);
    }
}
