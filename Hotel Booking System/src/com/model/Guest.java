package com.model;

public class Guest {
    private String id;
    private String name;

    public Guest(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "Guest [id=" + id + ", name=" + name + "]";
    }
}
