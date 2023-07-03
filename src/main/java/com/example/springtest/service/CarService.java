package com.example.springtest.service;

import com.example.springtest.model.Car;
import com.example.springtest.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarService {
    private  final CarRepository carRepository;
    public List<Car>  getAllCars(){
        return carRepository.findAll();
    }

    public Car createCar(Car car) {
        return  carRepository.save(car);
    }


}
