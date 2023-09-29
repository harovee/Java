/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi7_luyentap;

import java.util.Scanner;

/**
 *
 * @author haove
 */
public class LuyenTap3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        do {
            System.out.println("----------MENU----------");
            System.out.println("1. Nhap va in thong tin");
            System.out.println("2. Tinh tich so le chia het 3");
            System.out.println("3. Kiem tra so nguyen am chia het 5");
            System.out.println("0. Thoat");
            System.out.println("---------------------------");
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
                    System.out.println("Nhap can nang: ");
                    float weight = Float.valueOf(scan.nextLine());
                    System.out.println("Nhap gioi tinh: ");
                    String gender = scan.nextLine();
                    System.out.println("Nhap chieu cao: ");
                    float height = Float.valueOf(scan.nextLine());
                    System.out.println("Nhap que quan: ");
                    String village = scan.nextLine();
                    System.out.println("----In thong tin----");
                    System.out.println("Ten: " + name);
                    System.out.println("Tuoi: " + age);
                    System.out.println("Dia chi: " + address);
                    System.out.println("Can nang: " + weight);
                    System.out.println("Gioi tinh: " + gender);
                    System.out.println("Chieu cao: " + height);
                    System.out.println("Que quan " + village);
                    break;
                }
                case 2: {
                    System.out.println("Tinh tich so le chia het 3");
                    System.out.println("Nhap so n bat ky: ");
                    int number = Integer.valueOf(scan.nextLine());
                    int product = 1;
                    for (int i = 1; i < number + 1; i++) {
                        if (i % 2 != 0 && i % 3 == 0) {
                            product *= i;
                            System.out.println(i);
                        }
                    }
                    System.out.println("Tich cac so le: " + product);
                    break;
                }
                case 3: {
                    System.out.println("Kiem tra so nguyen am chia het 5");
                    System.out.println("Nhap so n nguyen am: ");
                    int number = Integer.valueOf(scan.nextLine());
                    int count = 0;
                    for (int i = 0; i > number; i--) {
                        if (i < 0 && i % 5 == 0) {
                            count++;
                        }
                    }
                    System.out.println("So cac so nguyen am chia het 5: " + count);
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
        } while (select != 0);
    }
}
