package com.example.myformationproject.model;

import java.io.Serializable;

public class Address  implements Serializable{
    private String fullAddress;


    public Address( ) {

    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    @Override
    public String toString() {
        return "Address{" +
                "fullAddress='" + fullAddress + '\'' +
                '}';
    }
}
