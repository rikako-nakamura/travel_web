package com.travel.travel_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TravelController {
  @GetMapping("/")
  public String index(){
    return "travel/index";
  }

  @PostMapping("/create")
  public String create(@RequestParam String title, Model model){
    model.addAttribute("title", title);
    return "travel/create";
  }
}
