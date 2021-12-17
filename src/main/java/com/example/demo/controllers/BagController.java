package com.example.demo.controllers;

import com.example.demo.models.Bag;
import com.example.demo.service.implementation.MemoryBag;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BagController {
    private final MemoryBag memoryBag;

    public BagController(MemoryBag memoryBag) {
        this.memoryBag = memoryBag;
    }

    @GetMapping("/bag")
    public String bag() {
        return "bag";
    }

    @PostMapping("/bag")
    public String postBag(Bag bag, Model model) {
        List<Bag> bags = memoryBag.search();
        for (Bag oneBag: bags) {
            if(oneBag.equals(bag)){
                model.addAttribute("message", "Chek-in!");
                return "bag";
            }
        }
        model.addAttribute("message", "Your bag or destination is not exists!");
        return "bag";
    }
}
