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
public class Bai2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Nhap diem Toan: ");
        Float mathMark = scan.nextFloat();

        System.out.println("Nhap diem Ly: ");
        Float physicsMark = scan.nextFloat();

        System.out.println("Nhap diem Hoa: ");
        Float chemistryMark = scan.nextFloat();

        System.out.println("Diem Toan: " + mathMark);
        System.out.println("Diem Ly: " + physicsMark);
        System.out.println("Diem Hoa: " + chemistryMark);
    }
}
