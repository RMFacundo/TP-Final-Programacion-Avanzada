package utn.example.UTN.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utn.example.UTN.service.MeasurementService;

@RestController
@RequestMapping("/measurements")
public class MeasurementController {

    MeasurementService measurementService;

    @Autowired
    public MeasurementController(MeasurementService measurementService){ this.measurementService = measurementService; }
}
