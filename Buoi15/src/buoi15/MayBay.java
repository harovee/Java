/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buoi15;

/**
 *
 * @author haove
 */
public class MayBay {

    /**
     * @param args the command line arguments
     */
    private String planeID;
    private String brand;
    private int seatNumber;

    public MayBay() {
    }

    public MayBay(String planeID, String brand, int seatNumber) {
        this.planeID = planeID;
        this.brand = brand;
        this.seatNumber = seatNumber;
    }

    public String getPlaneID() {
        return planeID;
    }

    public void setPlaneID(String planeID) {
        this.planeID = planeID;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void infoPrint() {
        System.out.println("Ma: " + planeID);
        System.out.println("Hang: " + brand);
        System.out.println("So ghe: " + seatNumber);
    }
}
