package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String printCar(Model model, @RequestParam(defaultValue = "5") int count) {

        List<Car> listCar = new ArrayList<>();
        listCar.add(new Car("OPEL", 212, "red"));
        listCar.add(new Car("BMW", 318, "green"));
        listCar.add(new Car("MB", 220, "black"));
        listCar.add(new Car("MAN", 45, "black"));
        listCar.add(new Car("KAMAZ", 5490, "red"));

        CarServiceImpl car = new CarServiceImpl();
        model.addAttribute("listCar", car.getCar(listCar, count));

        return "cars";
    }
}
