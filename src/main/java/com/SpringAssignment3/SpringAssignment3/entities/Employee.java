package com.SpringAssignment3.SpringAssignment3.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Employee {
    @Id
    private long id;
    private String name;
    private String address;

    public Employee() {
    }

    public Employee(long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
