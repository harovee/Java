/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn2;

/**
 *
 * @author haove
 */
public class XeMay {

    private String motorID;
    private String name;
    private String kindOfMotor;
    private float cost;
    private String color;

    public XeMay() {
    }

    public XeMay(String motorID, String name, String kindOfMotor, float cost, String color) {
        this.motorID = motorID;
        this.name = name;
        this.kindOfMotor = kindOfMotor;
        this.cost = cost;
        this.color = color;
    }

    public String getMotorID() {
        return motorID;
    }

    public void setMotorID(String motorID) {
        this.motorID = motorID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKindOfMotor() {
        return kindOfMotor;
    }

    public void setKindOfMotor(String kindOfMotor) {
        this.kindOfMotor = kindOfMotor;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void infoPrint() {
        System.out.println("Ma: " + motorID);
        System.out.println("Ten: " + name);
        System.out.println("Dong may: " + kindOfMotor);
        System.out.println("Gia: " + cost);
        System.out.println("Mau sac: " + color);
    }
}
