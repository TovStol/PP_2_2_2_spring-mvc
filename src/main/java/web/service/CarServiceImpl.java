package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    private static final List<Car> listCar = new ArrayList<>();

    static {
        listCar.add(new Car("OPEL", 212, "red"));
        listCar.add(new Car("BMW", 318, "green"));
        listCar.add(new Car("MB", 220, "black"));
        listCar.add(new Car("MAN", 45, "black"));
        listCar.add(new Car("KAMAZ", 5490, "red"));
    }


    public List<Car> getCar(int count) {
        return listCar.stream().limit(count).toList();
    }
}
