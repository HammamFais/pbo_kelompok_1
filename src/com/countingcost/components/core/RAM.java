package com.countingcost.components.core;

public class RAM extends Core {

    int capacityGB;

    public RAM(String nama, double price) {
        super(nama, price);
    }

    public RAM(String nama, double price, int capacityGB) {
        super(nama, price);
        this.capacityGB = capacityGB;
    }

    public void setCapacityGB(int capacityGB) {
        this.capacityGB = capacityGB;
    }

    public int getCapacityGB() {
        return capacityGB;
    }
}
