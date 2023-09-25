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
public class Bai6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Nhập số nguyên: ");
        Integer intNum = scan.nextInt();
        int sum = (intNum+1)*intNum/2;
        System.out.println("tong bằng "+sum);
    }
}
