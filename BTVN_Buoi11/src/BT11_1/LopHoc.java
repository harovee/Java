/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT11_1;

/**
 *
 * @author haove
 */
public class LopHoc {

    private String name;
    private String building;
    private int area;

    public LopHoc() {
    }

    public LopHoc(String name, String building, int area) {
        this.name = name;
        this.building = building;
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

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void infoPrint() {
        System.out.println("Ten: " + name);
        System.out.println("Toa: " + building);
        System.out.println("Dien tich: " + area);
    }
}
