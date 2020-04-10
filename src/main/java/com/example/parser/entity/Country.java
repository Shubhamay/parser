package com.example.parser.entity;

import lombok.Builder;
import lombok.Generated;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Builder
@Document(collection = "countries")
public class Country {
    String name;

    @Override
    public String toString() {
        return String.format("name= " +name);
    }
}
