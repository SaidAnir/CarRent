package com.said.app.carrent.Model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Null;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@ToString
public class Car {

    @Id
    @GeneratedValue
    private Long Id;

    private String brand;

    private String brandClass;

    private int numberDoors;

    private int numberSeats;

    private int modelYear;

    private String fuel;

    private String engineVolume;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "owner_id")
    @JsonBackReference
    private Owner owner;



}
