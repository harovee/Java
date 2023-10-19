/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.util.Scanner;

/**
 *
 * @author haove
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        String name = scan.nextLine();
        System.out.println("Nhap tuoi: ");
        int age = Integer.valueOf(scan.nextLine());
        System.out.println("Nhap gioi tinh: ");
        int gender = Integer.valueOf(scan.nextLine());
        System.out.println("Nhap que quan: ");
        String village = scan.nextLine();
        System.out.println("Nhap SDT: ");
        String phoneNumber = scan.nextLine();
        System.out.println("Nhap Email: ");
        String email = scan.nextLine();
        System.out.println("Nhap diem: ");
        double mark = Double.valueOf(scan.nextLine());
        
        SinhVien sv = new SinhVien();
        sv.setName(name);
        sv.setAge(age);
        sv.setGender(gender);
        sv.setVillage(village);
        sv.setPhoneNumber(phoneNumber);
        sv.setEmail(email);
        sv.setMark(mark);
        sv.display();
    }
}
