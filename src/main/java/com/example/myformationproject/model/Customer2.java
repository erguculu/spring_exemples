package com.example.myformationproject.model;

import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

public class Customer2 implements Serializable {
    private String action;
    private int type;
    @Autowired
    private Person person;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Customer2{" +
                "action='" + action + '\'' +
                ", type=" + type +
                ", person=" + person +
                '}';
    }
}
