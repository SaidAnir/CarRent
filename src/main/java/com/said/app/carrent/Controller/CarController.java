package com.said.app.carrent.Controller;

import com.said.app.carrent.Model.Car;
import com.said.app.carrent.Service.ServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {

    private final ServiceImplementation serviceImplementation;

    @Autowired
    public CarController(ServiceImplementation serviceImplementation){
        this.serviceImplementation = serviceImplementation;
    }

    @GetMapping("/cars")
    public List<Car> getAllCars(){
        return serviceImplementation.getAllCars();
    }

    @GetMapping("/car/{id}")
    public Car getCarById(@PathVariable Long id){
        return serviceImplementation.getCarById(id);
    }

}
