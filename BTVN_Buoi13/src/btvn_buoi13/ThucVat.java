/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package btvn_buoi13;

/**
 *
 * @author haove
 */
public class ThucVat {

    /**
     * @param args the command line arguments
     */
    private String plantsID;
    private String name;
    private String kind;
    private String area;
    private int height;

    public ThucVat() {
    }

    public ThucVat(String plantsID, String name, String kind, String area, int height) {
        this.plantsID = plantsID;
        this.name = name;
        this.kind = kind;
        this.area = area;
        this.height = height;
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

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void infoPrint() {
        System.out.println("Ma: " + plantsID);
        System.out.println("Ten: " + name);
        System.out.println("Loai cay: " + kind);
        System.out.println("Khu vuc sog: " + area);
        System.out.println("Chieu cao: " + height);
    }

}
