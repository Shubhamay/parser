package com.example.parser.entity;

import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Builder
@Document(collection = "countries")
public class Country {
    @Id
    int id;
    String name;

    @Override
    public String toString() {
        return String.format("id= " + id + " , name= " +name);
    }
}
