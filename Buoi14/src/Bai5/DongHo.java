/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai5;

/**
 *
 * @author haove
 */
public class DongHo {

    private int watchID;
    private String kind;
    private String color;
    private int width;
    private String material;
    private int cost;

    public DongHo() {
    }

    public DongHo(int watchID, String kind, String color, int width, String material, int cost) {
        this.watchID = watchID;
        this.kind = kind;
        this.color = color;
        this.width = width;
        this.material = material;
        this.cost = cost;
    }

    public int getWatchID() {
        return watchID;
    }

    public void setWatchID(int watchID) {
        this.watchID = watchID;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void infoPrint() {
        System.out.println("Ma: " + watchID);
        System.out.println("The loai: " + kind);
        System.out.println("Mau sac: " + color);
        System.out.println("Kich thuoc: " + width);
        System.out.println("Chat lieu: " + material);
        System.out.println("Gia: " + cost);
    }
}
