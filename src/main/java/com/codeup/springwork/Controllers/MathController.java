package com.codeup.springwork.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class MathController {
    public String roll(Model model) {
        int number = (int) Math.floor(Math.random()) + 1;

        return "roll";
    }

//    @GetMapping("/add/{num1}/and/{num2}")
//    @ResponseBody
//    public int add(@PathVariable int num1, @PathVariable int num2) {
//        return num1 + num2;
//    }
//
//    @GetMapping("/subtract/{num1}/from/{num2}")
//    @ResponseBody
//    public int subtract(@PathVariable int num1, @PathVariable int num2) {
//        return num2 - num1;
//    }
//
//    @GetMapping("/multiply/{num1}/and/{num2}")
//    @ResponseBody
//    public int multiply(@PathVariable int num1, @PathVariable int num2) {
//        return num1 * num2;
//    }
//
//    @GetMapping("/divide/{num1}/by/{num2}")
//    @ResponseBody
//    public int divide(@PathVariable int num1, @PathVariable int num2) {
//        return num1 / num2;
//    }
}
