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
public class MainOfMayTinh {

    public static void main(String[] args) {
        ArrayList<MayTinh> computer = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ma: ");
        String compID = scan.nextLine();
        System.out.println("Nhap ten: ");
        String name = scan.nextLine();
        System.out.println("Nhap dong may: ");
        String kindOfComp = scan.nextLine();
        System.out.println("Nhap gia: ");
        float cost = Float.valueOf(scan.nextLine());
        MayTinh comp = new MayTinh(compID, name, kindOfComp, cost);
        computer.add(comp);
        for (MayTinh mayTinh : computer) {
            mayTinh.infoPrint();
        }
//        computer.forEach(s->s.infoPrint());
//        computer.forEach(MayTinh::infoPrint);
    }
}
