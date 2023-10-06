/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT11_1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author haove
 */
public class MainOfThucVat {

    public static void main(String[] args) {
        ArrayList<ThucVat> plants = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ma TV: ");
        String plantsID = scan.nextLine();
        System.out.println("Nhap ten: ");
        String name = scan.nextLine();
        System.out.println("Nhap tuoi: ");
        int age = Integer.valueOf(scan.nextLine());
        System.out.println("Nhap chieu cao: ");
        double height = Double.valueOf(scan.nextLine());
        System.out.println("Nhap khu vuc song: ");
        String area = scan.nextLine();
        ThucVat pl = new ThucVat(plantsID, name, age, height, area);
        plants.add(pl);
        for (ThucVat plant : plants) {
            plant.infoPrint();
        }
//        plants.forEach(s -> s.infoPrint());
//        plants.forEach(ThucVat::infoPrint);
    }
}
