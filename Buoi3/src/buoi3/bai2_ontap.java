/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi3;

import java.util.Scanner;

/**
 *
 * @author haove
 */
public class bai2_ontap {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        String name = scan.nextLine();
        System.out.println("Nhập khu vực sống: ");
        String area = scan.nextLine();
        System.out.println("Địa chỉ: ");
        String address = scan.nextLine();

        System.out.println("Tên: " + name + "-Khu vực sống: " + area
                + "-Địa chỉ: " + address);
    }
}
