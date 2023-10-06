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
public class MainOfLopHoc {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap thong tin lop hoc: ");
        System.out.println("Nhap ten: ");
        String name = scan.nextLine();
        System.out.println("Nhap toa: ");
        String building = scan.nextLine();
        System.out.println("Nhap Dia chi: ");
        String address = scan.nextLine();
        System.out.println("Nhap dien tich: ");
        int area = Integer.valueOf(scan.nextLine());
        LopHoc classroom = new LopHoc(name, building, address, area);
        classroom.infoPrint();
    }
}
