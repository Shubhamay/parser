package com.example.parser.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.parser.entity.Country;
import com.example.parser.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {
    @Autowired
    private CountryRepository countryRepository;

    public Iterable<Country> findAllCountries() {
        return countryRepository.findAll();
    }
}
