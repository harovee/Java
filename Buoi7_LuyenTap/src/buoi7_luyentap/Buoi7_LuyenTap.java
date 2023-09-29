/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buoi7_luyentap;

import java.util.Scanner;

/**
 *
 * @author haove
 */
public class Buoi7_LuyenTap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        int amount = Integer.valueOf(scan.nextLine());
        int arr[] = new int[amount];
        System.out.println("Nhap gia tri cac phan tu: ");
        for (int i = 0; i < amount; i++) {
            arr[i] = Integer.valueOf(scan.nextLine());
        }
        System.out.println("----In thong tin-----");
        for (int i = 0; i < amount; i++) {
            System.out.println(arr[i]);
        }
        int product = 1;
        for (int i = 0; i < amount; i++) {
            if (i % 2 != 0) {
                product *= arr[i];
            }
        }
        System.out.println("Tich cac phan tu o vi tri le: " + product);

        int max = arr[0];
        for (int i = 0; i < amount; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Vi tri cua cac phan tu co gia tri lon nhat: ");
        for (int i = 0; i < amount; i++) {
            if (max == arr[i]) {
                System.out.println(i);
            }
        }

        int count = 0;
        for (int i = 0; i < amount; i++) {
            if (arr[i] < 0) {
                count++;
            }
        }
        System.out.println("So phan tu la so nguyen am: " + count);

        int sum = 0;
        for (int i = 0; i < amount; i++) {
            if (i % 2 == 0 && arr[i] % 3 == 0) {
                sum += arr[i];
            }
        }
        System.out.println("Tong cac phan tu o vi tri chan va chia het 3: " + sum);
    }

}
