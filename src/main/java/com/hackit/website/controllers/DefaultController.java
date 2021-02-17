package com.hackit.website.controllers;

import org.springframework.web.bind.annotation.*;
import com.hackit.website.models.*;
import java.util.Date;

@RestController
public class DefaultController {

    @RequestMapping("/")
    public Event getEvent() {
        return new Event("1",new Date(), new Date());
    }

}