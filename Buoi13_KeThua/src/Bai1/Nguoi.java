/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bai1;

/**
 *
 * @author haove
 */
public class Nguoi {

    /**
     * @param args the command line arguments
     */
    private String name;
    private int age;
    private int gender;
    private String village;
    private String phoneNumber;
    private String email;

    public Nguoi() {
    }

    public Nguoi(String name, int age, int gender, String village, String phoneNumber, String email) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.village = village;
        this.phoneNumber = phoneNumber;
        this.email = email;
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

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void display() {
        System.out.println("Ten: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("Gioi Tinh: " + gender);
        System.out.println("Que quan: " + village);
        System.out.println("SDT: " + phoneNumber);
        System.out.println("Email: " + email);
    }
}
