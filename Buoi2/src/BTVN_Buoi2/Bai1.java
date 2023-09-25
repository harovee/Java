/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTVN_Buoi2;

import java.util.Scanner;

/**
 *
 * @author haove
 */
public class Bai1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Nhap ten: ");
        String name = scan.nextLine();

        System.out.println("Nhap dia chi: ");
        String address = scan.nextLine();

        System.out.println("Ten: " + name);
        System.out.println("Dia chi: " + address);
       
    }
}
