package utn.example.UTN.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utn.example.UTN.model.Invoice;
import utn.example.UTN.service.InvoiceService;

import java.util.List;

@RestController
@RequestMapping("invoice/")
public class InvoiceController {

    InvoiceService invoiceService;

    @Autowired
    public InvoiceController(InvoiceService invoiceService){
        this.invoiceService = invoiceService;
    }

    @PostMapping
    public void addInvoice(@RequestBody Invoice invoice) {
        invoiceService.add(invoice);
    }

    @GetMapping
    public List<Invoice> getAll(){
        return invoiceService.getAll();
    }

    @GetMapping("/{id}")
    public Invoice getInvoiceById(@PathVariable Integer id) {
        return invoiceService.getByID(id);
    }
}
