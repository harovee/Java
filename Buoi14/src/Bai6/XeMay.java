/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai6;

/**
 *
 * @author haove
 */
public class XeMay {

    private String name;
    private String motorID;
    private String brand;
    private double cost;

    public XeMay() {
    }

    public XeMay(String name, String motorID, String brand, double cost) {
        this.name = name;
        this.motorID = motorID;
        this.brand = brand;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMotorID() {
        return motorID;
    }

    public void setMotorID(String motorID) {
        this.motorID = motorID;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void infoPrint() {
        System.out.println("Ten: " + name);
        System.out.println("Ma xe may: " + motorID);
        System.out.println("Hang xe: " + brand);
        System.out.println("Gia tien: " + cost);
    }
}
