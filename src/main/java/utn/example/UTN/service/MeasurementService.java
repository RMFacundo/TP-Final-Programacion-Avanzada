package utn.example.UTN.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.example.UTN.repository.MeasurementRepository;

@Service
public class MeasurementService {

    MeasurementRepository measurementRepository;

    @Autowired
    public MeasurementService(MeasurementRepository measurementRepository){ this.measurementRepository = measurementRepository;}
}
