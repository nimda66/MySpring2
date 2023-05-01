package com.hintze.myspring.services;

import com.hintze.myspring.models.Standard;
import com.hintze.myspring.repositories.StandardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;

@Service
public class StandartService implements IStandartService {
    private static final Logger log = LoggerFactory.getLogger(StandartService.class);

    @Autowired
    private StandardRepository standardRepository;


    @Override
    public List<Standard> fetchStandardList() {
        List<Standard> standardList = standardRepository.findAll();
        if(CollectionUtils.isEmpty(standardList)) {
            log.warn("Standard list is empty");
            return Collections.emptyList();
        }
        standardList.forEach(standard -> log.info("Standard: {} : {}" , standard.getId(), standard.getTitle()));
        return standardList;
    }
}
