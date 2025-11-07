package com.countingcost;

import com.countingcost.components.core.*;
import com.countingcost.components.peripheral.*;
import com.countingcost.components.storage.*;
import com.countingcost.pc.PC;
import com.countingcost.reporting.*;
import java.text.NumberFormat;
import java.util.Locale;

public class App {

    public static void main(String[] args) {
        System.out.println("Merakit PC...");

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
        double total = myPC.calculateTotalPrice();

        System.out.println("Rakitan Selesai!");
        System.out.println("TOTAL HARGA: " + formatter.format(total));

        PCReportGenerator report = new PCReportGenerator();
        report.generateReport(myPC);
    }
}
