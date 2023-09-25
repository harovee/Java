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
public class ontap {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Nhập chiều cao: ");
        Float height = scan.nextFloat();
        System.out.println("Nhập cân nặng: ");
        Float weight = scan.nextFloat();
        System.out.println("Nhập tuổi: ");
        int age = scan.nextInt();

        System.out.println("Chiều cao: " + height + "Cân nặng: " + weight
                + "Tuổi: " + age);
    }
}
/**
 * 1. Nhập chiều cao, cân nặng, tuổi nyc và in 2. Nhập tên, khu vực sống, địa
 * chỉ của con chó hàng xóm và in 3. Nhập tên, tuổi, địa chỉ, chiều cao, ngành
 * học, kỳ học, quê quán của bản thân và in
 */
