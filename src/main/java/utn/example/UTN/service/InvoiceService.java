package utn.example.UTN.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import utn.example.UTN.model.Invoice;
import utn.example.UTN.repository.InvoiceRepository;

import java.util.List;

@Service
public class InvoiceService {

    InvoiceRepository invoiceRepository;

    @Autowired
    public InvoiceService(InvoiceRepository invoiceRepository){
        this.invoiceRepository = invoiceRepository;
    }

    public List<Invoice> getAll() {
        return invoiceRepository.findAll();
    }

    public Invoice getByID(Integer id) {
        return invoiceRepository.findById(id).orElseThrow(() -> new HttpClientErrorException(HttpStatus.NOT_FOUND));
    }

    public void add(Invoice invoice) {
        invoiceRepository.save(invoice);
    }
}
