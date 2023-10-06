/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi11;

/**
 *
 * @author haove
 */
public class DongVat {
    private String animalsID;
    private String name;
    private double weight;

    public DongVat() {
    }

    public DongVat(String animalsID, String name, double weight) {
        this.animalsID = animalsID;
        this.name = name;
        this.weight = weight;
    }

    public String getAnimalsID() {
        return animalsID;
    }

    public void setAnimalsID(String animalsID) {
        this.animalsID = animalsID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public void infoPrint(){
        System.out.println("Ma DV: "+animalsID);
        System.out.println("Ten: "+name);
        System.out.println("Can nang: "+weight);
    }
}
