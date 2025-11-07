package com.countingcost.pc;

import com.countingcost.components.core.*;
import com.countingcost.components.peripheral.*;
import com.countingcost.components.storage.*;
import java.util.ArrayList;
import java.util.List;

public class PC {

    private final Motherboard motherboard;
    private final CPU cpu;
    private final RAM ram;

    private final List<Storage> daftarPenyimpanan;
    private final List<Peripheral> daftarPeriferal;

    public PC(Motherboard motherboard, CPU cpu, RAM ram) {
        if (motherboard == null || cpu == null || ram == null) {
            throw new IllegalArgumentException("Komponen inti (Motherboard, CPU, RAM) wajib ada.");
        }
        this.motherboard = motherboard;
        this.cpu = cpu;
        this.ram = ram;

        this.daftarPenyimpanan = new ArrayList<>();
        this.daftarPeriferal = new ArrayList<>();
    }

    public void tambahKomponen(Storage storage) {
        if (storage instanceof SSD) {
            motherboard.addSSD((SSD) storage);
            return;
        } else if (storage instanceof CloudStorage) {
            System.out.println("Cloud Storage " + storage.getNama() + " added to PC.");
        } else if (storage instanceof FlashDisk) {
            System.out.println("Flash Disk " + storage.getNama() + " added to PC.");
        }
        this.daftarPenyimpanan.add(storage);
    }

    public void tambahKomponen(Peripheral peripheral) {
        this.daftarPeriferal.add(peripheral);
    }

    public double calculateTotalPrice() {
        double total = motherboard.getPrice() + cpu.getPrice() + ram.getPrice();

        for (Storage storage : daftarPenyimpanan) {
            total += storage.getPrice();
        }

        for (Peripheral peripheral : daftarPeriferal) {
            total += peripheral.getPrice();
        }

        return total;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public CPU getCPU() {
        return cpu;
    }

    public RAM getRAM() {
        return ram;
    }

    public List<Storage> getDaftarPenyimpanan() {
        return daftarPenyimpanan;
    }

    public List<Peripheral> getDaftarPeriferal() {
        return daftarPeriferal;
    }

    public void generateReport() {
        System.out.println("--- PC Build Report ---");
        // Tiga baris berikut semuanya mengakses data dari objek 'pc'
        System.out.println("CPU: " + this.getCPU().getNama());
        System.out.println("Motherboard: " + this.getMotherboard().getNama());
        System.out.println("RAM Sticks: " + this.getRAM().getCapacityGB());
        System.out.println("-----------------------");
    }
}
