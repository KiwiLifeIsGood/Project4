package com.example.demofirebase.Entity;

import com.example.demofirebase.Entity.Categoris;

public class Services {
    String SerName;
    Categoris CateID;

    public Services() {
    }

    public Services(String serName) {
        SerName = serName;
    }

    public String getSerName() {
        return SerName;
    }

    public void setSerName(String serName) {
        SerName = serName;
    }
}
