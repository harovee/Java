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
public class OnTapNhapXuat {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Nhập tên: ");
        String name = scan.nextLine();

        System.out.println("Nhập tuổi: ");
        int age = Integer.valueOf(scan.nextLine());

        System.out.println("Nhập ngành học: ");
        String major = scan.nextLine();

        System.out.println("Nhập kỳ học: ");
        int grade = Integer.valueOf(scan.nextLine());

        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Ngành: " + major);
        System.out.println("Kỳ: " + grade);
    }
}
