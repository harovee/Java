/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4;

/**
 *
 * @author haove
 */
public class Dienthoai {

    private String name;
    private String brand;
    private String color;
    private int capacity;
    private int cost;

    public Dienthoai() {
    }

    public Dienthoai(String name, String brand, String color, int capacity, int cost) {
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.capacity = capacity;
        this.cost = cost;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void infoPrint() {
        System.out.println("Ten: " + name);
        System.out.println("Hang: " + brand);
        System.out.println("Mau: " + color);
        System.out.println("Bo nho: " + capacity);
        System.out.println("Gia: " + cost);
    }
}
