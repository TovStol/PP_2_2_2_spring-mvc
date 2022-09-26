package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;


@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String printCar(Model model, @RequestParam(defaultValue = "5") int count) {


        CarServiceImpl car = new CarServiceImpl();
        model.addAttribute("listCar", car.getCar(count));

        return "cars";
    }
}
