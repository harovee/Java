/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn2;

import java.util.Scanner;

/**
 *
 * @author haove
 */
public class MainOfGiangVien {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap thong tin GV: ");
        System.out.println("Nhap ma: ");
        String teacherID = scan.nextLine();
        System.out.println("Nhap ten: ");
        String name = scan.nextLine();
        System.out.println("Nhap dia chi: ");
        String address = scan.nextLine();
        System.out.println("Nhap can nang: ");
        float weight = Float.valueOf(scan.nextLine());
        System.out.println("Nhap chieu cao: ");
        double height = Double.valueOf(scan.nextLine());
        System.out.println("Nhap bac: ");
        int grade = Integer.valueOf(scan.nextLine());
        GiangVien teacher = new GiangVien(teacherID, name, address, weight, height, grade);
        teacher.infoPrint();
    }
}
