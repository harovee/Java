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
public class bai3_ontap {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        String name = scan.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.println("Nhập địa chỉ: ");
        String address = scan.nextLine();
        System.out.println("Nhập chiều cao: ");
        Float height = scan.nextFloat();
        scan.nextLine();
        System.out.println("Nhập ngành học: ");
        String major = scan.nextLine();
        System.out.println("Nhập kỳ học: ");
        int grade = scan.nextInt();
        scan.nextLine();
        System.out.println("Nhập quê quán: ");
        String village = scan.nextLine();
        System.out.println("--------------------------------");

        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Địa chỉ: " + address);
        System.out.println("Chiều cao: " + height);
        System.out.println("Ngành học: " + major);
        System.out.println("Kỳ học: " + grade);
        System.out.println("Quê quán: " + village);
    }
}
