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
public class MainOfDienThoai {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap thong tin dien thoai: ");
        System.out.println("Nhap ma DT: ");
        String phoneID = scan.nextLine();
        System.out.println("Nhap ten: ");
        String name = scan.nextLine();
        System.out.println("Nhap dong may:");
        String kindOfPhone = scan.nextLine();
        System.out.println("Nhap gia: ");
        float cost = Float.valueOf(scan.nextLine());
        System.out.println("Nhap dung luong: ");
        int capacity = Integer.valueOf(scan.nextLine());
        System.out.println("Nhap mau sac: ");
        String color = scan.nextLine();
        DienThoai phone = new DienThoai(phoneID, name, kindOfPhone, cost, capacity, color);
        phone.infoPrint();
    }
}
