package com.hintze.myspring.services;

import com.hintze.myspring.models.Standard;

import java.util.List;

public interface IStandartService {
    /**
     * @return List of all standards
     */
    List<Standard> fetchStandardList();
}
