package com.example.parser.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.parser.entity.Country;
import com.example.parser.entity.State;
import com.example.parser.repository.CountryRepository;
import com.example.parser.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class Mutation implements GraphQLMutationResolver {
    @Autowired
    private CountryRepository countryRepository;

    @Autowired
    private StateRepository stateRepository;

    public Country newCountry(String name) {
        Country country = Country.builder().name(name).build();

        countryRepository.save(country);

        return country;
    }

    public List<String> saveAllCountries(List<String> names) {
        countryRepository.deleteAll();

        names.stream()
                .forEach(s -> {
                    countryRepository.save(Country.builder().name(s).build());
                });
        return names;
    }

    public List<State> saveAllStatesOfACountry(List<String> names ,Integer countryId) {
        names.stream()
                .forEach(s -> {
                    stateRepository.save(State.builder().name(s).countryId(countryId).build());
                });
        return stateRepository.findAll();
    }
}
