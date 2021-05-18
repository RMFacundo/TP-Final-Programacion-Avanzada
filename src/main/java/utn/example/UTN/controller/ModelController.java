package utn.example.UTN.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utn.example.UTN.service.ModelService;

@RestController
@RequestMapping("/model")
public class ModelController {

    ModelService modelService;

    @Autowired
    public ModelController(ModelService modelService){ this.modelService = modelService; }
}
