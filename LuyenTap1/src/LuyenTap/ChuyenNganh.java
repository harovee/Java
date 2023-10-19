/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuyenTap;

/**
 *
 * @author haove
 */
public class ChuyenNganh {

    private String id;
    private String name;
    private String head;
    private String description;
    private int startDate;
    private boolean status;

    public ChuyenNganh() {
    }

    public ChuyenNganh(String id, String name, String head, String description, int startDate, boolean status) {
        this.id = id;
        this.name = name;
        this.head = head;
        this.description = description;
        this.startDate = startDate;
        this.status = status;
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

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStartDate() {
        return startDate;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void infoPrint() {
        System.out.println("Ma: " + id);
        System.out.println("Ten: " + name);
        System.out.println("Chu nhiem: " + head);
        System.out.println("Mo ta: " + description);
        System.out.println("Nam thanh lap: " + startDate);
    }
}
