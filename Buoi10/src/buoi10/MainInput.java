/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi10;

import java.util.Scanner;
import javafx.scene.shape.SVGPath;

/**
 *
 * @author haove
 */
public class MainInput {
    //Nhap Dl cua SV va In ra man hinh
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap thong tin SV: ");
        System.out.println("Ten: ");
        String name = scan.nextLine();
        System.out.println("Nhap MSSV: ");
        String studentID = scan.nextLine();
        System.out.println("Nhap Tuoi: ");
        int age = Integer.valueOf(scan.nextLine());
        System.out.println("Nhap gioi tinh: ");
        boolean gender = Boolean.valueOf(scan.nextLine());
        System.out.println("Nhap ky hoc: ");
        int grade = Integer.valueOf(scan.nextLine());
        System.out.println("Nhap Dia chi: ");
        String address = scan.nextLine();
        System.out.println("Nhap mat khau FB: ");
        String facebookPass = scan.nextLine();
        
//Khoi tao doi tuong
//    //cach1: khong tham so
//    SinhVien sv = new SinhVien();
//    sv.setStudentID(studentID);
//    sv.setName(name);
//    sv.setAge(age);
//    sv.setGender(gender);
//    sv.setGrade(grade);
//    sv.setAddress(address);
//    sv.setFacebookPass(facebookPass);
//    //In thong tin
//    sv.infoPrint();

    //Cach2: Full tham so
    SinhVien sv = new SinhVien(studentID, name, age, gender, grade, address, facebookPass);
    sv.infoPrint();
    }
}
