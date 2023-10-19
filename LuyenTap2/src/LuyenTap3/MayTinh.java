/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuyenTap3;

/**
 *
 * @author haove
 */
public class MayTinh {

    private String compID;
    private String name;
    private String brand;
    private int capacity;
    private float cost;
    private boolean status;

    public MayTinh() {
    }

    public MayTinh(String compID, String name, String brand, int capacity, float cost, boolean status) {
        this.compID = compID;
        this.name = name;
        this.brand = brand;
        this.capacity = capacity;
        this.cost = cost;
        this.status = status;
    }

    public String getCompID() {
        return compID;
    }

    public void setCompID(String compID) {
        this.compID = compID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void infoPrint() {
        System.out.println("Ma: " + compID);
        System.out.println("Ten: " + name);
        System.out.println("Hang: " + brand);
        System.out.println("Bo nho: " + capacity);
        System.out.println("Gia: " + cost);
        System.out.println("Trang thai: " + status);
    }
}
