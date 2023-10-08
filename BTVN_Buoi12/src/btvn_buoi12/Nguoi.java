/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package btvn_buoi12;

/**
 *
 * @author haove
 */
public class Nguoi {

    private String name;
    private int age;
    private int gender;
    private String village;
    private String career;

    public Nguoi() {
    }

    public Nguoi(String name, int age, int gender, String village, String career) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.village = village;
        this.career = career;
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

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public void infoPrint() {
        System.out.println("Ten: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("Gioi tinh: " + gender);
        System.out.println("Que quan: " + village);
        System.out.println("Nghe nghiep: " + career);
    }
}
