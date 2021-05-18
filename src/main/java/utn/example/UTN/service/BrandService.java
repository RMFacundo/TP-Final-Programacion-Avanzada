package utn.example.UTN.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.example.UTN.repository.BrandRepository;

@Service
public class BrandService {

    BrandRepository brandRepository;

    @Autowired
    public BrandService(BrandRepository brandRepository){ this.brandRepository = brandRepository; }
}
