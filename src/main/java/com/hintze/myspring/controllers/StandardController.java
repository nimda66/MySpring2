package com.hintze.myspring.controllers;

import com.hintze.myspring.models.Standard;
import com.hintze.myspring.services.StandartService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class StandardController {
    private static final Logger log = LoggerFactory.getLogger(StandardController.class);

    @Autowired
    private StandartService standartService;

    /**
     * call it like 'http://localhost:8080/showStandards'
     * @return ModelAndView view and a list of all standards
     */
    @GetMapping(value = "/showStandards")
    public ModelAndView showStandards() {

        List<Standard> standards = standartService.fetchStandardList();
        Map<String, Object> params = new HashMap<>();
        params.put("standards", standards);
        return new ModelAndView("showStandards", params);
    }
}
