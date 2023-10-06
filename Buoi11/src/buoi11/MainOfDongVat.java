/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author haove
 */
public class MainOfDongVat {
    
    public static void main(String[] args) {
        ArrayList<DongVat> animals = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ma: ");
        String animalsID = scan.nextLine();
        System.out.println("Nhap ten: ");
        String name = scan.nextLine();
        System.out.println("Nhap can nang: ");
        double weight = Double.valueOf(scan.nextLine());
        DongVat dv = new DongVat(animalsID, name, weight);
        //Add doi tuong DongVat vao list
        animals.add(dv);
        //In ra man hih
        for (DongVat animal : animals) {
            animal.infoPrint();
        }
        //cach2:
        System.out.println("------------");
        animals.forEach(s -> s.infoPrint());
        System.out.println("------------");
        //cach4: for eacg + method reference
        animals.forEach(DongVat::infoPrint);
    }
}
