package com.example.springtest.controller;

import com.example.springtest.model.Car;
import com.example.springtest.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Car> createCar(@RequestBody Car car){
        return new ResponseEntity<>(carService.createCar(car), HttpStatus.CREATED);
    }


}
