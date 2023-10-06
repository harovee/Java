/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn2;

/**
 *
 * @author haove
 */
public class DongVat {

    private String animalID;
    private String name;
    private int age;
    private double weight;

    public DongVat() {
    }

    public DongVat(String animalID, String name, int age, double weight) {
        this.animalID = animalID;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getAnimalID() {
        return animalID;
    }

    public void setAnimalID(String animalID) {
        this.animalID = animalID;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void infoPrint() {
        System.out.println("Ma DV: " + animalID);
        System.out.println("Ten: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("Can nang: " + weight);
    }
}
