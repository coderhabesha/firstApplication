package com.example.firstApplication.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FirstModel {
    @Id
    private Long id;
    private String value;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
