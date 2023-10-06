/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn2;

/**
 *
 * @author haove
 */
public class MayTinh {

    private String compID;
    private String name;
    private String kindOfComp;
    private float cost;

    public MayTinh() {
    }

    public MayTinh(String compID, String name, String kindOfComp, float cost) {
        this.compID = compID;
        this.name = name;
        this.kindOfComp = kindOfComp;
        this.cost = cost;
    }

    public String getCompID() {
        return compID;
    }

    public void setCompID(String compID) {
        this.compID = compID;
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
        System.out.println("Ma: " + compID);
        System.out.println("Ten: " + name);
        System.out.println("Dong may: " + kindOfComp);
        System.out.println("Gia: " + cost);
    }
}
