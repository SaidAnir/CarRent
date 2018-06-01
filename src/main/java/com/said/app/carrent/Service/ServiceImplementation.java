package com.said.app.carrent.Service;

import com.said.app.carrent.Model.Car;
import com.said.app.carrent.Model.Owner;
import com.said.app.carrent.Repository.CarRepository;
import com.said.app.carrent.Repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceImplementation implements ServiceInterface {


    private CarRepository carRepository;
    private OwnerRepository ownerRepository;

    @Autowired
    public ServiceImplementation(OwnerRepository ownerRepository, CarRepository carRepository){
       this.ownerRepository = ownerRepository;
       this.carRepository = carRepository;
    }


    @Override
    public Owner createOwner(Owner owner) {
        return ownerRepository.save(owner);
    }

    @Override
    public Boolean deleteOwner(Owner owner) {
        ownerRepository.delete(owner);
        return ownerRepository.findById(owner.getId()) == null;
    }

    @Override
    public Owner getOwnerById(Long ownerId) {
        Optional<Owner> owner = ownerRepository.findById(ownerId);

        if(owner.isPresent())
            return owner.get();
        else throw new NullPointerException();
    }

    @Override
    public List<Owner> getAllOwners() {
        return ownerRepository.findAll();
    }

    @Override
    public Car createCar(Car car) {
        return carRepository.save(car);
    }

    @Override
    public Boolean deleteCar(Car car) {
        carRepository.delete(car);

        return carRepository.findById(car.getId()) == null;
    }

    @Override
    public Car getCarById(Long carId) {
        Optional<Car> car = carRepository.findById(carId);
        if (car.isPresent())
            return car.get();
        else throw new NullPointerException();

    }

    @Override
    public List<Car> getAllCars() {

        return carRepository.findAll();
    }
}
