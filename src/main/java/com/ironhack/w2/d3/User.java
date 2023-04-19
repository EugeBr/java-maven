package com.ironhack.w2.d3;

public class User {
    private long id;
    private String name;
    private Status status;

    private static long lastId = 1;  //* to create unique ID

    public User(String name) {
        this.name = name;
        this.status = Status.ONLINE; //Default value
        this.lastId = lastId;       //* to create unique ID
        lastId++;                   //* to create unique ID
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public long getId() {  //* Ussually I only need getter for ID (Beacuase is automatically generated and never changed)
        return id;
    }
}
