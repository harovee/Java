/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

/**
 *
 * @author haove
 */
public class SinhVien extends Nguoi {

    /**
     * TInh ke thua: extends - Class con se ke thua cac thuoc tinh phuong thuc
     * cua class Cha(Tru cac thuoc tinh va phuong thuc Private)
     */
    private double mark;
    //=>SinhVien co 7 thuoc tinh:

    public SinhVien() {
    }

    public SinhVien(double mark, String name, int age, int gender, String village, String phoneNumber, String email) {
        super(name, age, gender, village, phoneNumber, email);
        this.mark = mark;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public void display() {
//        System.out.println("Ten: " + super.getName());
//        System.out.println("Tuoi: " + super.getAge());
//        System.out.println("Gioi Tinh: " + super.getGender());
//        System.out.println("Que quan: " + super.getVillage());
//        System.out.println("SDT: " + super.getPhoneNumber());
//        System.out.println("Email: " + super.getEmail());
        super.display();
        System.out.println("Diem: " + mark);
    }
}
