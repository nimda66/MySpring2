package com.hintze.myspring.controllers;

import com.hintze.myspring.services.StandartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class StandartController {
    @Autowired
    private StandartService standartService;

}
