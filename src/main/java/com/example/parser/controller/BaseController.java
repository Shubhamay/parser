package com.example.parser.controller;

import com.example.parser.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BaseController {

    @Autowired
    Service service;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        service.saveCountry();
        return "1";
    }

    @RequestMapping("/getCountry")
    @ResponseBody
    String getCountry() {
        return service.getCountry();
    }
}
