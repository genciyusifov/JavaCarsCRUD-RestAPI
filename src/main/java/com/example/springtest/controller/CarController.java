package com.example.springtest.controller;

import com.example.springtest.model.Car;
import com.example.springtest.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public  class CarController<car> {
    private final CarService carService;
    @GetMapping("/cars")
    public List<Car>  getAll(){
        return carService.getAllCars();
    }
    @PostMapping("/cars")
    public Car createCar(@RequestBody Car car){
        return carService.createCar(car);
    }


}
