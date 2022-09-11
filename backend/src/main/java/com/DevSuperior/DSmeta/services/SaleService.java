package com.DevSuperior.DSmeta.services;

import com.DevSuperior.DSmeta.entities.Sale;
import com.DevSuperior.DSmeta.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SaleService {


    @Autowired
    private SaleRepository repository;

    public List<Sale> findSales(){

        return repository.findAll();

    }
}
