/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Btvn1_Buoi10;

/**
 *
 * @author haove
 */
public class ToaHoc {

    private String buildingID;
    private String name;
    private String area;

    public ToaHoc() {
    }

    public ToaHoc(String buildingID, String name, String area) {
        this.buildingID = buildingID;
        this.name = name;
        this.area = area;
    }

    public String getBuildingID() {
        return buildingID;
    }

    public void setBuildingID(String buildingID) {
        this.buildingID = buildingID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void infoPrint() {
        System.out.println("Ma: " + buildingID);
        System.out.println("Ten: " + name);
        System.out.println("Khu vuc: " + area);
    }
}
