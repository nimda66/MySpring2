package com.hintze.myspring.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.sql.Date;

@Entity
public class Standard {
    @Id
    @GeneratedValue
    private Long id;
    private String title;

    private String dokNr;
    private Date issueDate;
    private String workingGrem;

    private String workingGremId;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDokNr() {
        return dokNr;
    }

    public void setDokNr(String dokNr) {
        this.dokNr = dokNr;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public String getWorkingGrem() {
        return workingGrem;
    }

    public void setWorkingGrem(String workingGrem) {
        this.workingGrem = workingGrem;
    }

    public String getWorkingGremId() {
        return workingGremId;
    }

    public void setWorkingGremId(String workingGremId) {
        this.workingGremId = workingGremId;
    }
}
