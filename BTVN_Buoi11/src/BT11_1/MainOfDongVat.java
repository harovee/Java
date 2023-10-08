/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT11_1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author haove
 */
public class MainOfDongVat {
    public static void main(String[] args) {
        ArrayList<DongVat>animal = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ma DV: ");
        String animalID = scan.nextLine();
        System.out.println("Nhap ten: ");
        String name = scan.nextLine();
        System.out.println("Nhap tuoi: ");
        int age = Integer.valueOf(scan.nextLine());
        System.out.println("Nhap can nang: ");
        double weight = Double.valueOf(scan.nextLine());
        DongVat ani = new DongVat(animalID, name, age, weight);
        animal.add(ani);
        for (DongVat dongVat : animal) {
            dongVat.infoPrint();
        }
//        animal.forEach(s->s.infoPrint());
//        animal.forEach(DongVat::infoPrint);
    }
}
