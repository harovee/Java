/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoringtest;

/**
 *
 * @author haove
 */
public class DoHoaPhat extends DoVat {

    private String material;

    public DoHoaPhat() {
    }

    public DoHoaPhat(String material, String objectID, String name, int kind, double cost) {
        super(objectID, name, kind, cost);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }



    public void hoaPhatPrint() {
        super.infoPrint();
        System.out.println("Chat lieu: " + material);
    }
}
