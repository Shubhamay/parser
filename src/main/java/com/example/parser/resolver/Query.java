package com.example.parser.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.parser.entity.Country;
import com.example.parser.entity.State;
import com.example.parser.repository.CountryRepository;
import com.example.parser.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {
    @Autowired
    private CountryRepository countryRepository;

    @Autowired
    private StateRepository stateRepository;

    public Iterable<Country> findAllCountries() {
        return countryRepository.findAll();
    }

    public Iterable<State> findAllStates() {
        return stateRepository.findAll();
    }
}
