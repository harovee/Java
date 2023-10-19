/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author haove
 */
public class QLDienThoai {

    ArrayList<Dienthoai> phone = new ArrayList<>();

    public void dienThoaiInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        String name = scan.nextLine();
        System.out.println("Nhap hang: ");
        String brand = scan.nextLine();
        System.out.println("Nhap mau: ");
        String color = scan.nextLine();
        System.out.println("Nhap bo nho: ");
        int capacity = Integer.valueOf(scan.nextLine());
        System.out.println("Nhap gia: ");
        int cost = Integer.valueOf(scan.nextLine());
        Dienthoai dt = new Dienthoai(name, brand, color, capacity, cost);
        phone.add(dt);
    }

    public void DienThoaiDisplay() {
        for (Dienthoai dienthoai : phone) {
            dienthoai.infoPrint();
        }
    }
}
