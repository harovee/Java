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
public class MainOfMayTinh {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap thong tin may tinh: ");
        System.out.println("Nhap ma may tinh: ");
        String compID = scan.nextLine();
        System.out.println("Nhap ten may tinh: ");
        String name = scan.nextLine();
        System.out.println("Nhap dong may: ");
        String kindOfComp = scan.nextLine();
        System.out.println("Nhap gia: ");
        float cost = Float.valueOf(scan.nextLine());
        MayTinh comp = new MayTinh(compID, name, kindOfComp, cost);
        comp.infoPrint();
    }
}
