package com.said.app.carrent;

import com.said.app.carrent.Model.Car;
import com.said.app.carrent.Model.Owner;
import com.said.app.carrent.Service.ServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


@SpringBootApplication
public class CarRentApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarRentApplication.class, args);
    }


    @Autowired
    private ServiceImplementation serviceImplementation;



    @Bean
    public CommandLineRunner run() {

        return args -> {
            List<Car> carsList1 = new ArrayList<>();
            List<Car> carsList2 = new ArrayList<>();


            Owner owner1  = new Owner();
            owner1.setFirstName("Said");
            owner1.setLastName("BEN MOUH");
            owner1.setBusinessName("Tagmat Car Rent");

            Owner owner2  = new Owner();
            owner2.setFirstName("Fatima Zahra");
            owner2.setLastName("BEN MOUH");
            owner2.setBusinessName("Iss-Car Rent");


            owner1 = serviceImplementation.createOwner(owner1);
            owner2 = serviceImplementation.createOwner(owner2);


            Car car = new Car();
            car.setBrand("Mercedes-Benz");
            car.setBrandClass("Class-S");
            car.setFuel("Diesel");
            car.setEngineVolume("5L");
            car.setNumberDoors(4);
            car.setNumberSeats(5);
            car.setModelYear(2017);
            car.setOwner(owner1);

            carsList1.add(car);

            car = new Car();
            car.setBrand("BMW");
            car.setBrandClass("Class-E");
            car.setFuel("Diesel");
            car.setEngineVolume("3L");
            car.setNumberDoors(4);
            car.setNumberSeats(5);
            car.setModelYear(2016);
            car.setOwner(owner2);



            carsList2.add(car);



            carsList1.stream()
                    .forEach(carItem -> {
                        serviceImplementation.createCar(carItem);
                    });

            carsList2.stream()
                    .forEach(carItem -> {
                        serviceImplementation.createCar(carItem);
                    });


            };

    }


}
