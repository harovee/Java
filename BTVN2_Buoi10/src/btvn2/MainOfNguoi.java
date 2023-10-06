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
public class MainOfNguoi {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap thong tin nguoi: ");
        System.out.println("Nhap ten: ");
        String name = scan.nextLine();
        System.out.println("Nhap tuoi: ");
        int age = Integer.valueOf(scan.nextLine());
        System.out.println("Nhap dia chi: ");
        String address = scan.nextLine();
        Nguoi people = new Nguoi(name, age, address);
        people.infoPrint();
    }
}
