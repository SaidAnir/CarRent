package com.said.app.carrent.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@ToString

public class Owner {

    @Id
    @GeneratedValue
    private Long Id;

    private String firstName;

    private String lastName;

    private String businessName;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "owner")
    private List<Car> myCars;



}
