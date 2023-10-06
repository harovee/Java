/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Btvn1_Buoi10;

/**
 *
 * @author haove
 */
public class LopHoc {

    private String name;
    private String building;
    private String address;
    private int area;

    public LopHoc() {
    }

    public LopHoc(String name, String building, String address, int area) {
        this.name = name;
        this.building = building;
        this.address = address;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void infoPrint() {
        System.out.println("Ten: " + name);
        System.out.println("Toa nha: " + building);
        System.out.println("Dia chi: " + address);
        System.out.println("Dien tich: " + area);
    }
}
