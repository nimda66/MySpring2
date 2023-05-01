package com.hintze.myspring.services;

import com.hintze.myspring.models.Standard;
import com.hintze.myspring.repositories.StandardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@Service
public class StandartService {
    private static final Logger log = LoggerFactory.getLogger(StandartService.class);


    @Autowired
    private StandardRepository standardRepository;

    public List<Standard> getSortedStandards() {
        List<Standard> standardList = standardRepository.findAll();
        log.info("StandardList: {0}" , standardList);
        return standardList;
    }
}
