package com.example.myformationproject.service;

public class Service {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Service{" +
                "message='" + message + '\'' +
                '}';
    }
}
