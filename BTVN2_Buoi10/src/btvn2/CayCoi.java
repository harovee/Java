/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn2;

/**
 *
 * @author haove
 */
public class CayCoi {

    private String treeID;
    private String name;
    private String area;
    private float cost;

    public CayCoi() {
    }

    public CayCoi(String treeID, String name, String area, float cost) {
        this.treeID = treeID;
        this.name = name;
        this.area = area;
        this.cost = cost;
    }

    public String getTreeID() {
        return treeID;
    }

    public void setTreeID(String treeID) {
        this.treeID = treeID;
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

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public void infoPrint() {
        System.out.println("Ma: " + treeID);
        System.out.println("ten: " + name);
        System.out.println("KV song: " + area);
        System.out.println("Gia: " + cost);
    }
}
