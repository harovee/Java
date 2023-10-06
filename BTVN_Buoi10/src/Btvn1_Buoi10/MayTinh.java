/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Btvn1_Buoi10;

/**
 *
 * @author haove
 */
public class MayTinh {

    private String computerID;
    private String name;
    private String kindOfComp;
    private float cost;

    public MayTinh() {
    }

    public MayTinh(String computerID, String name, String kindOfComp, float cost) {
        this.computerID = computerID;
        this.name = name;
        this.kindOfComp = kindOfComp;
        this.cost = cost;
    }

    public String getComputerID() {
        return computerID;
    }

    public void setComputerID(String computerID) {
        this.computerID = computerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKindOfComp() {
        return kindOfComp;
    }

    public void setKindOfComp(String kindOfComp) {
        this.kindOfComp = kindOfComp;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public void infoPrint() {
        System.out.println("Ma may: " + computerID);
        System.out.println("Ten: " + name);
        System.out.println("Dong may: " + kindOfComp);
        System.out.println("Gia tien: " + cost);
    }
}
