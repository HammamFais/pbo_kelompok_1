package com.countingcost.components;

public abstract class Component {

    protected String nama;
    protected double price;

    public Component(String nama, double price) {
        this.nama = nama;
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public String getNama() {
        return this.nama;
    }
}
