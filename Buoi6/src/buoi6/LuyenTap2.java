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
public class LuyenTap2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        do {
            System.out.println("------MENU------");
            System.out.println("1. Nhap va in thong tin");
            System.out.println("2. Mang so nguyen");
            System.out.println("------------------");
            System.out.println("Moi chon chuc nang: ");
            select = Integer.valueOf(scan.nextLine());

            switch (select) {
                case 1: {
                    System.out.println("Nhap va in thong tin");
                    System.out.println("Nhap ten: ");
                    String name = scan.nextLine();
                    System.out.println("Nhap tuoi: ");
                    int age = Integer.valueOf(scan.nextLine());
                    System.out.println("Nhap dia chi: ");
                    String address = scan.nextLine();
                    System.out.println("Nhap ky hoc: ");
                    int grade = Integer.valueOf(scan.nextLine());
                    System.out.println("Nhap nganh hoc: ");
                    String major = scan.nextLine();
                    System.out.println("------------------");
                    System.out.println("Ten: " + name);
                    System.out.println("Tuoi: " + age);
                    System.out.println("Dia chi: " + address);
                    System.out.println("Ky hoc: " + grade);
                    System.out.println("Nganh: " + major);
                    break;
                }
                case 2: {
                    System.out.println("Mang so nguyen");
                    System.out.println("Nhap so luong phan tu mang: ");
                    int amount = Integer.valueOf(scan.nextLine());
                    int arr[] = new int[amount];
                    System.out.println("Nhap gia tri cac phan tu: ");
                    for (int i = 0; i < amount; i++) {
                        arr[i] = Integer.valueOf(scan.nextLine());
                    }

                    System.out.println("Tong cac phan tu: ");
                    int sum = 0;
                    for (int i = 0; i < amount; i++) {
                        sum += arr[i];
                    }
                    System.out.println(sum);
                    break;
                }
                case 3: {
                    System.out.println("Thoat");
                    break;
                }
                default: {
                    System.out.println("Khong co chuc nang nay");
                }
            }
        } while (select != 0);
    }
}
