package com.example.parser.service;

import com.example.parser.entity.Country;
import com.example.parser.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    CountryRepository countryRepository;

    public void saveCountry() {
        countryRepository.save(Country.builder().id(1).name("India").build());
    }
}