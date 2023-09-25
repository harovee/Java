/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn5;

import java.util.Scanner;

/**
 *
 * @author haove
 */
public class BT5_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu trong mang: ");
        int amount = Integer.valueOf(scan.nextLine());
        int[] array = new int[amount];
        System.out.println("Nhap phan tu cho mang: ");

        for (int i = 0; i < amount; i++) {
            System.out.println("Phan tu vi tri " + i + " la: ");
            array[i] = Integer.valueOf(scan.nextLine());
        }

        System.out.println("Tich cac phan tu o vi tri le: ");
        int product = 1;
        for (int i = 0; i < amount; i++) {
            if (i % 2 != 0) {
                product *= array[i];
            }
        }
        System.out.println("" + product);

        System.out.println("So luong phan tu la so nguyen am: ");
        int count = 0;
        for (int i = 0; i < amount; i++) {
            if (array[i] < 0) {
                count++;
            }
        }
        System.out.println("" + count);

        System.out.println("Tong cac phan tu o vi tri chan chia het 3: ");
        int sum = 0;
        for (int i = 0; i < amount; i++) {
            if (i % 2 == 0 && array[i] % 3 == 0) {
                sum += array[i];
            }
        }
        System.out.println("" + sum);
    }

}
