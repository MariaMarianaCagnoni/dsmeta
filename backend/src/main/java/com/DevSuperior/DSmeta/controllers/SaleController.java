package com.DevSuperior.DSmeta.controllers;




import com.DevSuperior.DSmeta.entities.Sale;
import com.DevSuperior.DSmeta.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/sales")
public class SaleController {


    @Autowired
    private SaleService service;

    @GetMapping
    public List<Sale> findSales(){


        return service.findSales();
    }





}
