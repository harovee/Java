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
public class Bai5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Nhap so nguyen: ");
        Integer intNumber = scan.nextInt();

        if (intNumber % 2 == 0) {
            System.out.println(intNumber + " là số chẵn");
        } else {
            System.out.println(intNumber + " là số lẻ");
        }
    }
}
