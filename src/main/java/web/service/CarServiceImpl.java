package web.service;

import web.model.Car;

import java.util.List;

public class CarServiceImpl implements  CarService{

    public List<Car> getCar(List<Car> car, int count) {

        return car.stream().limit(count).toList();
    }
}
