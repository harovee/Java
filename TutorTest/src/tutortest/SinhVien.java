/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutortest;

/**
 *
 * @author haove
 */
public class SinhVien extends Nguoi {

    private double mathMark;
    private double physicsMark;
    private double chemistryMark;

    public SinhVien(double mathMark1, double physicsMark1, double chemistryMark1, String id, String name, int age, boolean gender, String village) {
    }

    public SinhVien(double mathMark, double physicsMark, double chemistryMark) {
        this.mathMark = mathMark;
        this.physicsMark = physicsMark;
        this.chemistryMark = chemistryMark;
    }

    public double getMathMark() {
        return mathMark;
    }

    public void setMathMark(double mathMark) {
        this.mathMark = mathMark;
    }

    public double getPhysicsMark() {
        return physicsMark;
    }

    public void setPhysicsMark(double physicsMark) {
        this.physicsMark = physicsMark;
    }

    public double getChemistryMark() {
        return chemistryMark;
    }

    public void setChemistryMark(double chemistryMark) {
        this.chemistryMark = chemistryMark;
    }



    public void studentInfo() {
        super.printInfo();
        System.out.println("Diem Toan: " + mathMark);
        System.out.println("Diem Ly: " + physicsMark);
        System.out.println("Diem Hoa: " + chemistryMark);
    }

    public double getAverageMark() {  
        return (mathMark + physicsMark + chemistryMark) / 3;
    }
}
