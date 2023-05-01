package com.hintze.myspring.services;

import com.hintze.myspring.models.Standard;

import java.util.List;

public interface IStandartService {
    /**
     * @return List of all standards ordered by issue date descending
     */
    List<Standard> fetchStandardList();
}
