/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai6;

/**
 *
 * @author haove
 */
public class XeSo extends XeMay{
    private String fuel;
    private String engine;

    public XeSo() {
    }

    public XeSo(String fuel, String engine, String name, String motorID, String brand, double cost) {
        super(name, motorID, brand, cost);
        this.fuel = fuel;
        this.engine = engine;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
    public void xeSoDisplay(){
        super.infoPrint();
        System.out.println("Nhieu lieu: "+fuel);
        System.out.println("Dong co: "+engine);
    }
}
