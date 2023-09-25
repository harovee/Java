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
public class Bai7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập số nguyên: ");
        Integer intNum = scan.nextInt();

        if (intNum % 2 != 0) {
            if (intNum % 5 == 0) {
                System.out.println(intNum + " là số lẻ chia hết cho 5");
            } else {
                System.out.println(intNum + " là số lẻ không chia hết cho 5");
            }
        } else {
            System.out.println(intNum + " không phải số lẻ");
        }
    }
}
