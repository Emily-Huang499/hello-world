package com.emily.entity;

public class City {
    private int id;
    private String name;
    private String provinceid;

    public City() {
    }

    public City(int id, String name, String provinceid) {
        this.id = id;
        this.name = name;
        this.provinceid = provinceid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(String provinceid) {
        this.provinceid = provinceid;
    }
}
