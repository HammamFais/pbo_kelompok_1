package com.countingcost;

import com.countingcost.components.core.*;
import com.countingcost.components.peripheral.*;
import com.countingcost.components.storage.*;
import com.countingcost.pc.PC;
import java.text.NumberFormat;
import java.util.Locale;

public class App {

    public static void main(String[] args) {
        Motherboard mobo = new Motherboard("ASUS ROG STRIX", 4000000, 6);
        CPU cpu = new CPU("Intel Core i7", 6000000, 4);
        RAM ram = new RAM("Kingston FURY 32GB", 2000000, 32);

        PC myPC = new PC(mobo, cpu, ram);

        myPC.tambahKomponen(new SSD("Samsung 980 Pro 2TB", 3000000));
        myPC.tambahKomponen(new CloudStorage("Google Drive 2TB (1yr)", 1500000));

        myPC.tambahKomponen(new Monitor("LG UltraGear 27\"", 4500000));
        myPC.tambahKomponen(new Keyboard("Logitech G Pro", 1800000));
        myPC.tambahKomponen(new Mouse("Razer DeathAdder", 1100000));

        Locale indonesia = new Locale.Builder().setLanguage("id").setRegion("ID").build();
        NumberFormat formatter = NumberFormat.getCurrencyInstance(indonesia);

        System.out.println("--- PC Build by Team Tim 1 ---");

        System.out.println("CPU: " + myPC.getCPU().getNama());
        System.out.println("Motherboard: " + myPC.getMotherboard().getNama());
        System.out.println("RAM: " + myPC.getRAM().getNama());

        for (Storage s : myPC.getDaftarPenyimpanan()) {
            if (s instanceof SSD) {
                System.out.println("Storage (SSD): " + s.getNama());
            } else if (s instanceof CloudStorage) {
                System.out.println("Storage (Cloud): " + s.getNama());
            } else {
                System.out.println("Storage: " + s.getNama());
            }
        }

        for (Peripheral p : myPC.getDaftarPeriferal()) {
            if (p instanceof Monitor) {
                System.out.println("Peripheral (Monitor): " + p.getNama());
            } else if (p instanceof Keyboard) {
                System.out.println("Peripheral (Keyboard): " + p.getNama());
            } else if (p instanceof Mouse) {
                System.out.println("Peripheral (Mouse): " + p.getNama());
            } else {
                System.out.println("Peripheral: " + p.getNama());
            }
        }

        System.out.println("---------------------------------");

        double total = myPC.calculateTotalPrice();
        System.out.println("Final Price: " + formatter.format(total));

        System.out.println("--- Build Successful! ---");
    }
}
