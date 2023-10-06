/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn2;

/**
 *
 * @author haove
 */
public class GiangVien {

    private String teacherID;
    private String name;
    private String address;
    private float weight;
    private double height;
    private int grade;

    public GiangVien() {
    }

    public GiangVien(String teacherID, String name, String address, float weight, double height, int grade) {
        this.teacherID = teacherID;
        this.name = name;
        this.address = address;
        this.weight = weight;
        this.height = height;
        this.grade = grade;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void infoPrint() {
        System.out.println("Ma: " + teacherID);
        System.out.println("Ten: " + name);
        System.out.println("Dia chi: " + address);
        System.out.println("Can nang: " + weight);
        System.out.println("Chieu cao: " + height);
        System.out.println("Bac: " + grade);
    }
}
