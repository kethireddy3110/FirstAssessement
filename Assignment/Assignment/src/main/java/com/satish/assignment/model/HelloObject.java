package com.satish.assignment.model;

import lombok.Data;

@Data
public class HelloObject {
    private String message;

    public HelloObject(String message) {
        this.message = message;
    }
}
