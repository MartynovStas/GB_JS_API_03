package org.example.Lession06;

public class Notebook {
    private String brand;
    private String model;
    private String color;
    private double screenSize;
    private String screenTechnology;
    private int ram;
    private int rom;
    private String typeDisk;
    private int sizeDiskSsd;
    private int sizeDiskHdd;

    public Notebook(String brand, String model, String color, double screenSize, String screenTechnology, int ram, int rom, String typeDisk) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.screenSize = screenSize;
        this.screenTechnology = screenTechnology;
        this.ram = ram;
        this.rom = rom;
        this.typeDisk = typeDisk;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public String getScreenTechnology() {
        return screenTechnology;
    }

    public void setScreenTechnology(String screenTechnology) {
        this.screenTechnology = screenTechnology;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getRom() {
        return rom;
    }

    public void setRom(int rom) {
        this.rom = rom;
    }

    public String getTypeDisk() {
        return typeDisk;
    }

    public void setTypeDisk(String typeDisk) {
        this.typeDisk = typeDisk;
    }

    public int getSizeDiskSsd() {
        return sizeDiskSsd;
    }

    public void setSizeDiskSsd(int sizeDiskSsd) {
        this.sizeDiskSsd = sizeDiskSsd;
    }

    public int getSizeDiskHdd() {
        return sizeDiskHdd;
    }

    public void setSizeDiskHdd(int sizeDiskHdd) {
        this.sizeDiskHdd = sizeDiskHdd;
    }

    public String printInfo(){
        System.out.printf("Brand: %s, Model: %s, Color: %s, ScreenSize: %s, RAM: %s, ROM: %s, TypeDisk: %s", brand, model, color, screenSize, ram, rom, typeDisk);
        return ".";
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", screenSize=" + screenSize +
                ", screenTechnology='" + screenTechnology + '\'' +
                ", ram=" + ram +
                ", rom=" + rom +
                ", typeDisk='" + typeDisk + '\'' +
                ", sizeDiskSsd=" + sizeDiskSsd +
                ", sizeDiskHdd=" + sizeDiskHdd +
                '}';
    }
}
