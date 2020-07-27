package com.example.liuchangling.myapplication;

/**
 * Created by liuchangling on 2020/7/22.
 */

public class Taobao {
    private String name;
    private String information;


    @Override
    public String toString() {
        return "Taobao{" +
                "name='" + name + '\'' +
                ", information='" + information + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
}
