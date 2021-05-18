package utn.example.UTN.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import utn.example.UTN.model.EnergyMeter;
import utn.example.UTN.repository.EnergyMeterRepository;

import java.util.List;

@Service
public class EnergyMeterService {

    EnergyMeterRepository energyMeterRepository;

    @Autowired
    public EnergyMeterService(EnergyMeterRepository energyMeterRepository){
        this.energyMeterRepository = energyMeterRepository;
    }

    public List<EnergyMeter> getAll() {
        return energyMeterRepository.findAll();
    }

    public EnergyMeter getByID(Integer id) {
        return energyMeterRepository.findById(id)
                .orElseThrow(() -> new HttpClientErrorException(HttpStatus.NOT_FOUND));
    }

    public void add(EnergyMeter energyMeter) {
        energyMeterRepository.save(energyMeter);
    }
}
