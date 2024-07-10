package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
//@RequestMapping("/hello")
public class CarController {

    @GetMapping("/cars")
    public String printCar(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("Hello!");
        messages.add("My name is Edward Matsola!");
        messages.add("I'am solved task 2.2.2 on the Kata Academy course!");
        model.addAttribute("messages", messages);
        return "/cars";
    }
}