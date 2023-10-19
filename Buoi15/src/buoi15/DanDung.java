/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi15;

/**
 *
 * @author haove
 */
public class DanDung extends MayBay {

    private String engineKind;
    private String engineNumber;

    public DanDung() {
    }

    public DanDung(String engineKind, String engineNumber, String planeID, String brand, int seatNumber) {
        super(planeID, brand, seatNumber);
        this.engineKind = engineKind;
        this.engineNumber = engineNumber;
    }

    public String getEngineKind() {
        return engineKind;
    }

    public void setEngineKind(String engineKind) {
        this.engineKind = engineKind;
    }

    public String getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }

    public void danDungDisplay() {
        super.infoPrint();
        System.out.println("Loai dong co: " + engineKind);
        System.out.println("So dong co: " + engineNumber);
    }
}
