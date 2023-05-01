package com.hintze.myspring.services;

import com.hintze.myspring.models.Standard;
import com.hintze.myspring.repositories.StandardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class StandartService implements IStandartService {
    private static final Logger log = LoggerFactory.getLogger(StandartService.class);
    public static final Comparator<Standard> STANDARD_COMPARATOR_DATE_DESC = (o1, o2) -> o2.getIssueDate().compareTo(o1.getIssueDate());

    @Autowired
    private StandardRepository standardRepository;


    @Override
    public List<Standard> fetchStandardList() {

        List<Standard> standards = standardRepository.findAll();
        if (CollectionUtils.isEmpty(standards)) {
            log.warn("no Standard found");
            return Collections.emptyList();
        }
        /*sort it*/
        standards.sort(STANDARD_COMPARATOR_DATE_DESC);
        standards.forEach(standard -> log.debug("Standard: {} : {} : {}", standard.getId(), standard.getTitle(), standard.getIssueDate()));
        return standards;
    }
}
