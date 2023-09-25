/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KieuDuLieuvaNhapXuat;

import java.util.Scanner;

/**
 *
 * @author haove
 */
public class bai2_buoi2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Nhap tuoi: ");
        Integer age = scan.nextInt();

        System.out.println("Nhap can nang: ");
        Float weight = scan.nextFloat();

        System.out.println("Nhap chieu cao: ");
        Long height = scan.nextLong();

        System.out.println("Tuoi: " + age);
        System.out.println("Can nang: " + weight);
        System.out.println("Chieu cao: " + height);
    }
}
