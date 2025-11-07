package com.countingcost.components.core;

public class CPU extends Core {
    int coreCount;
    public CPU(String nama, double price, int coreCount) {
        super(nama, price);
        this.coreCount = coreCount;
    }

    public int getCoreCount() {
        return coreCount;
    }
}