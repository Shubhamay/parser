package com.example.parser.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.parser.entity.Country;
import com.example.parser.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Arrays;
import java.util.List;

@Component
public class Mutation implements GraphQLMutationResolver {
    @Autowired
    private CountryRepository countryRepository;

    public Country newCountry(String name) {
        Country country = Country.builder().name(name).build();

        countryRepository.save(country);

        return country;
    }

    public String[] saveAllCountries(String[] names) {
        List<String> countryCollection = Arrays.asList(names);
        countryCollection.stream()
                .map(s -> {
                    Country country = Country.builder().name(s).build();
                    return countryRepository.save(country);
                });

        return names;
    }
}
