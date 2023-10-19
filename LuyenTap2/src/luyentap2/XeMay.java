/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luyentap2;

/**
 *
 * @author haove
 */
public class XeMay {

    private int motorID;
    private String brand;
    private double cost;

    public XeMay() {
    }

    public XeMay(int motorID, String brand, double cost) {
        this.motorID = motorID;
        this.brand = brand;
        this.cost = cost;
    }

    public int getMotorID() {
        return motorID;
    }

    public void setMotorID(int motorID) {
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
        System.out.println("ma: " + motorID);
        System.out.println("hang xe: " + brand);
        System.out.println("gia tien: " + cost);
    }
}
