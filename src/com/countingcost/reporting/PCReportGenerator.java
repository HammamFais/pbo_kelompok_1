package com.countingcost.reporting;

import com.countingcost.pc.PC;

public class PCReportGenerator {

    // METHOD INI CEMBURU PADA PC!
    public void generateReport(PC pc) {
        System.out.println("--- PC Build Report ---");
        // Tiga baris berikut semuanya mengakses data dari objek 'pc'
        System.out.println("CPU: " + pc.getCPU().getNama());
        System.out.println("Motherboard: " + pc.getMotherboard().getNama());
        System.out.println("RAM Sticks: " + pc.getRAM().getCapacityGB());
        System.out.println("-----------------------");
    }
}
