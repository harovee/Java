/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn_buoi13;

/**
 *
 * @author haove
 */
public class CayAnQua extends ThucVat {

    private int ageYear;

    public CayAnQua() {
    }

    public CayAnQua(int ageYear, String plantsID, String name, String kind, String area, int height) {
        super(plantsID, name, kind, area, height);
        this.ageYear = ageYear;
    }

    public int getAgeYear() {
        return ageYear;
    }

    public void setAgeYear(int ageYear) {
        this.ageYear = ageYear;
    }

    public void fruitTreeInfoPrint() {
        super.infoPrint();
        System.out.println("So nam tuoi: " + ageYear);
    }
}
