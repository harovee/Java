/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi6;

import java.util.Scanner;

/**
 *
 * @author haove
 */
public class LuyenTap {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu: ");
        int amount = Integer.valueOf(scan.nextLine());
        int arr[] = new int[amount];
        System.out.println("Nhap gia tri cac ptu: ");
        for (int i = 0; i < amount; i++) {
            arr[i] = Integer.valueOf(scan.nextLine());
        }
        System.out.println("----------------");
        System.out.println("In thong tin mang: ");
        for (int i = 0; i < amount; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Tinh tong cac ptu trong mang: ");
        int sum = 0;
        for (int i = 0; i < amount; i++) {
            sum += arr[i];
        }
        System.out.println(sum);

        System.out.println("Tinh tich cac ptu: ");
        int product = 1;
        for (int i = 0; i < amount; i++) {
            product *= arr[i];
        }
        System.out.println(product);

        System.out.println("So luong ptu chia het 3: ");
        int count3 = 0;
        for (int i = 0; i < amount; i++) {
            if (i % 3 == 0) {
                count3++;
            }
        }
        System.out.println(count3);

        System.out.println("So luong ptu chia het cho 5 o vi tri le: ");
        int count5 = 0;
        for (int i = 0; i < amount; i++) {
            if (i % 2 != 0 && arr[i] % 5 == 0) {
                count5++;
            }
        }
        System.out.println(count5);

        System.out.println("Tong cac ptu o vi tri chan: ");
        int sum1 = 0;
        for (int i = 0; i < amount; i++) {
            if (i % 2 == 0) {
                sum1 += arr[i];
            }
        }
        System.out.println(sum1);

        System.out.println("Tich cac ptu o vi tri chan va chia het 2: ");
        int product1 = 1;
        for (int i = 0; i < amount; i++) {
            if (i % 2 == 0 && arr[i] % 2 == 0) {
                product1 *= arr[i];
            }
        }
        System.out.println(product1);

        System.out.println("So lon nhat trong mang: ");
        int max = arr[0];
        for (int i = 0; i < amount; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);

        System.out.println("So nho nhat trong mang: ");
        int min = arr[0];
        for (int i = 0; i < amount; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
