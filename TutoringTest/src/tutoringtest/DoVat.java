/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutoringtest;

/**
 *
 * @author haove
 */
public class DoVat {

    /**
     * @param args the command line arguments
     */
    private String objectID;
    private String name;
    private int kind;
    private double cost;

    public DoVat() {
    }

    public DoVat(String objectID, String name, int kind, double cost) {
        this.objectID = objectID;
        this.name = name;
        this.kind = kind;
        this.cost = cost;
    }

    public String getObjectID() {
        return objectID;
    }

    public void setObjectID(String objectID) {
        this.objectID = objectID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKind() {
        return kind;
    }

    public void setKind(int kind) {
        this.kind = kind;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    public void infoPrint(){
        System.out.println("Ma: "+objectID);
        System.out.println("Ten: "+name);
        System.out.println("Loai: "+kind);
        System.out.println("Gia: "+cost);
    }
}
