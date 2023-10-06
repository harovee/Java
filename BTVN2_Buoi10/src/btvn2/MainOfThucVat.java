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
public class MainOfThucVat {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap thong tin TV: ");
        System.out.println("Nhap ma TV:");
        String plantsID = scan.nextLine();
        System.out.println("Nhap ten: ");
        String name = scan.nextLine();
        System.out.println("Nhap tuoi: ");
        int age = Integer.valueOf(scan.nextLine());
        System.out.println("Nhap chieu cao: ");
        double hieght = Double.valueOf(scan.nextLine());
        System.out.println("Nhap KV song: ");
        String area = scan.nextLine();
        ThucVat plants = new ThucVat(plantsID, name, age, hieght, area);
        plants.display();
    }
}
