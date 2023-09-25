/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi4;

import java.util.Scanner;

/**
 *
 * @author haove
 */
public class Luyentap2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Moi nhap chuc nang: ");
        int select = Integer.valueOf(scan.nextLine());

        switch (select) {
            case 1: {
                System.out.println("Nhap thong tin ca nhan: ");
                System.out.println("Nhap ten: ");
                String name = scan.nextLine();
                System.out.println("Nhap tuoi: ");
                int age = Integer.valueOf(scan.nextLine());
                System.out.println("Nhap dia chi: ");
                String address = scan.nextLine();
                System.out.println("Can nang: ");
                Float weight = Float.valueOf(scan.nextLine());
                System.out.println("Gioi tinh: ");
                String gender = scan.nextLine();
                System.out.println("Chieu cao: ");
                Float height = Float.valueOf(scan.nextLine());
                System.out.println("Que quan: ");
                String village = scan.nextLine();

                System.out.println("-------------------");
                System.out.println("Ten: " + name);
                System.out.println("Tuoi: " + age);
                System.out.println("Dia chi: " + address);
                System.out.println("Can nang: " + weight);
                System.out.println("Gioi tinh: " + gender);
                System.out.println("Chieu cao: " + height);
                System.out.println("Que quan: " + village);
                break;
            }
            case 2: {
                System.out.println("Tinh tich so le chia het 3");
                System.out.println("Nhap so n: ");
                int n = Integer.valueOf(scan.nextLine());
                int product = 1;
                for (int i = 1; i <= n; i++) {
                    if (i % 2 != 0 && i % 3 == 0) {
                        product *= i;
                    }
                }
                System.out.println("Tich cac so le chia het cho 3 tu 1 den " + n
                        + " la: " + product);
                break;
            }
            case 3: {
                System.out.println("Kiem tra so chia het 5");
                System.out.println("Nhap so n: ");
                int n = Integer.valueOf(scan.nextLine());
                int count = 0;
                for (int i = 0; i >= n; i--) {
                    if (i % 5 == 0) {
                        count++;
                    }
                }
                System.out.println("So cac so nguyen am chia het cho 5: " + count);
                break;
            }
            case 0: {
                System.out.println("Thoat");
                break;
            }

            default: {
                System.out.println("Khong co chuc nang nay");
            }
        }
    }
}
