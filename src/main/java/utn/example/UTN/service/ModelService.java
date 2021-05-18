package utn.example.UTN.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.example.UTN.repository.ModelRepository;

@Service
public class ModelService {

    ModelRepository modelRepository;

    @Autowired
    public ModelService(ModelRepository modelRepository){ this.modelRepository = modelRepository;}
}
