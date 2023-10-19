/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ph46895;

/**
 *
 * @author haove
 */
public class ThucVat {

    /**
     * @param args the command line arguments
     */
    private String id;
    private String name;
    private int height;

    public ThucVat() {
    }

    public ThucVat(String id, String name, int height) {
        this.id = id;
        this.name = name;
        this.height = height;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void infoPrint() {
        System.out.println("Ma thuc vat: " + id);
        System.out.println("Ten thuc vat: " + name);
        System.out.println("Chieu cao: " + height);
    }
}
