package com.example.parser.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "state")
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "countryid")
    int countryId;
    String name;

    @Override
    public String toString() {
        return String.format("id= " +id + "name= " +name + "countryId= " +countryId);
    }
}
