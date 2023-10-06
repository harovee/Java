/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Btvn1_Buoi10;

/**
 *
 * @author haove
 */
public class DienThoai {

    private String phoneID;
    private String name;
    private String kindOfPhone;
    private float cost;
    private int capacity;
    private String color;

    public DienThoai() {
    }

    public DienThoai(String phoneID, String name, String kindOfPhone, float cost, int capacity, String color) {
        this.phoneID = phoneID;
        this.name = name;
        this.kindOfPhone = kindOfPhone;
        this.cost = cost;
        this.capacity = capacity;
        this.color = color;
    }

    public String getPhoneID() {
        return phoneID;
    }

    public void setPhoneID(String phoneID) {
        this.phoneID = phoneID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKindOfPhone() {
        return kindOfPhone;
    }

    public void setKindOfPhone(String kindOfPhone) {
        this.kindOfPhone = kindOfPhone;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void infoPrint() {
        System.out.println("Ma: " + phoneID);
        System.out.println("Ten: " + name);
        System.out.println("Dong may: " + kindOfPhone);
        System.out.println("Gia: " + cost);
        System.out.println("Dung luong: " + capacity);
        System.out.println("Mau sac: " + color);
    }
}
