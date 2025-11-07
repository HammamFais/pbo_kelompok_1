package com.countingcost.components.core;

import com.countingcost.components.storage.SSD;

public class Motherboard extends Core {

    int slotCount;

    public Motherboard(String nama, double price) {
        super(nama, price);
    }

    public Motherboard(String nama, double price, int slotCount) {
        super(nama, price);
        this.slotCount = slotCount;
    }

    public int getSlotCount() {
        return slotCount;
    }

    public void setSlotCount(int slotCount) {
        this.slotCount = slotCount;
    }

    public void addSSD(SSD ssd) {
        if (this.slotCount > 0) {
            System.out.println("SSD " + ssd.getNama() + " added to Motherboard " + this.getNama());
            this.slotCount--;
        } else {
            System.out.println("No available slots to add SSD " + ssd.getNama() + " to Motherboard " + this.getNama());
        }
    }

    public void removeSSD(SSD ssd) {
        if (this.slotCount > 0) {
            System.out.println("SSD " + ssd.getNama() + " removed from Motherboard " + this.getNama());
            this.slotCount++;
        } else {
            System.out.println("No SSD to remove from Motherboard " + this.getNama());
        }
    }
}