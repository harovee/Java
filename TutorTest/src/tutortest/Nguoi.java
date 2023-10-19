/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutortest;

/**
 *
 * @author haove
 */
public class Nguoi {

    /**
     * @param args the command line arguments
     */
    private String id;
    private String name;
    private int age;
    private boolean gender;
    private String village;

    public Nguoi() {
    }

    public Nguoi(String id, String name, int age, boolean gender, String village) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.village = village;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public void printInfo() {
        System.out.println("Ma: " + id);
        System.out.println("Ten: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("Gioi tinh: " + gender);
        System.out.println("Que quan: " + village);
    }

}
