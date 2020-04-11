package com.example.parser.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.parser.entity.Country;
import com.example.parser.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLMutationResolver {
    @Autowired
    private CountryRepository countryRepository;

    public Country newCountry(String name) {
        Country country = Country.builder().name(name).build();

        countryRepository.save(country);

        return country;
    }
}
