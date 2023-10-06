/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Btvn1_Buoi10;

/**
 *
 * @author haove
 */
public class ThucVat {

    private String plantsID;
    private String name;
    private int age;
    private double height;
    private String area;

    public ThucVat() {
    }

    public ThucVat(String plantsID, String name, int age, double height, String area) {
        this.plantsID = plantsID;
        this.name = name;
        this.age = age;
        this.height = height;
        this.area = area;
    }

    public String getPlantsID() {
        return plantsID;
    }

    public void setPlantsID(String plantsID) {
        this.plantsID = plantsID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void infoPrint() {
        System.out.println("Ma TV: " + plantsID);
        System.out.println("Ten: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("Chieu cao:" + height);
        System.out.println("Khu vuc song: " + area);

    }
}
