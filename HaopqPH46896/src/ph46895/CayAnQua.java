/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ph46895;

/**
 *
 * @author haove
 */
public class CayAnQua extends ThucVat {

    private String fruitKind;
    private String area;

    public CayAnQua() {
    }

    public CayAnQua(String fruitKind, String area, String id, String name, int height) {
        super(id, name, height);
        this.fruitKind = fruitKind;
        this.area = area;
    }

    public String getFruitKind() {
        return fruitKind;
    }

    public void setFruitKind(String fruitKind) {
        this.fruitKind = fruitKind;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void cayAnQuaPrint() {
        super.infoPrint();
        System.out.println("Loai qua: " + fruitKind);
        System.out.println("Khu vuc song: " + area);
    }
}
