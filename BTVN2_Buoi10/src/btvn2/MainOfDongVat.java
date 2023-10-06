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
public class MainOfDongVat {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap thong tin DV: ");
        System.out.println("Nhap ma: ");
        String animalID = scan.nextLine();
        System.out.println("Nhap ten: ");
        String name = scan.nextLine();
        System.out.println("Nhap tuoi: ");
        int age = Integer.valueOf(scan.nextLine());
        System.out.println("Nhap can nang: ");
        double weight = Double.valueOf(scan.nextLine());
        DongVat animal = new DongVat(animalID, name, age, weight);
        animal.infoPrint();
    }
}
