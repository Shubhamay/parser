package com.example.parser.entity;

import lombok.Builder;
import org.springframework.data.annotation.Id;


@Builder
public class Country {
    @Id
    int id;
    String name;
}
