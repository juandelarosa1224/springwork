package com.codeup.springwork.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class RollDiceController {
    @GetMapping("/roll-dice")
    public String getNum() {
        return "roll-dice";
    }

    @GetMapping("/roll-dice/{number}")
    public String getNumber(@PathVariable int number, Model model) {
        int randomNumber = (int) Math.floor(Math.random() * 6 + 1);
        model.addAttribute("number", number);
        model.addAttribute("randomNumber", randomNumber);
        return "roll-dice-number";
    }
}
