package utn.example.UTN.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utn.example.UTN.model.EnergyMeter;
import utn.example.UTN.service.EnergyMeterService;

import java.util.List;

@RestController
@RequestMapping("energyMeter/")
public class EnergyMeterController {

    EnergyMeterService energyMeterService;

    @Autowired
    public EnergyMeterController(EnergyMeterService energyMeterService){
        this.energyMeterService = energyMeterService;
    }

    @PostMapping
    public void addEnergyMeter(@RequestBody EnergyMeter energyMeter) {
        energyMeterService.add(energyMeter);
    }

    @GetMapping
    public List<EnergyMeter> getAll(){
        return energyMeterService.getAll();
    }

    @GetMapping("/{id}")
    public EnergyMeter getEnergyMeterById(@PathVariable Integer id) {
        return energyMeterService.getByID(id);
    }
}
