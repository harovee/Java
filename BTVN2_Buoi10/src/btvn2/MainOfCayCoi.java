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
public class MainOfCayCoi {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap thong tin cay: ");
        System.out.println("Nhap ma: ");
        String treeID = scan.nextLine();
        System.out.println("Nhap ten: ");
        String name = scan.nextLine();
        System.out.println("Nhap KV song: ");
        String area = scan.nextLine();
        System.out.println("Nhap gia: ");
        float cost = Float.valueOf(scan.nextLine());
        CayCoi tree = new CayCoi(treeID, name, area, cost);
        tree.infoPrint();
    }
}
