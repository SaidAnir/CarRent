package com.said.app.carrent.Service;

import com.said.app.carrent.Model.Car;
import com.said.app.carrent.Model.Owner;

import java.util.List;

interface ServiceInterface {

    public Owner createOwner(Owner owner);

    public Boolean deleteOwner(Owner owner);

    public Owner getOwnerById(Long ownerId);

    public List<Owner> getAllOwners();



    public Car createCar(Car car);

    public Boolean deleteCar(Car car);

    public Car getCarById(Long carId);

    List<Car> getAllCars();


}
