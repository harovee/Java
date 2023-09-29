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
public class LuyenTap2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        do {
            System.out.println("-------MENU--------");
            System.out.println("1. Nhap va in thong tin");
            System.out.println("2. Tinh toan 2 so");
            System.out.println("3. Kiem tra so nguyen am");
            System.out.println("4. Kiem tra so chan va chia het 6");
            System.out.println("0. Thoat");
            System.out.println("---------------------");
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
                    System.out.println("Nhap nganh hoc: ");
                    String major = scan.nextLine();
                    System.out.println("Nhap truong hoc: ");
                    String school = scan.nextLine();
                    System.out.println("Nhap ky hoc: ");
                    int grade = Integer.valueOf(scan.nextLine());
                    System.out.println("----------------------------");
                    System.out.println("Ten: " + name);
                    System.out.println("Tuoi: " + age);
                    System.out.println("Dia chi: " + address);
                    System.out.println("Nganh hoc: " + major);
                    System.out.println("Truong hoc: " + school);
                    System.out.println("Ky hoc: " + grade);
                    break;
                }
                case 2: {
                    System.out.println("Tinh toan 2 so");
                    System.out.println("Nhap so thu nhat: ");
                    int number1 = Integer.valueOf(scan.nextLine());
                    System.out.println("Nhap so thu 2: ");
                    int number2 = Integer.valueOf(scan.nextLine());
                    int sum = number1 + number2;
                    System.out.println("Tong 2 so: " + sum);
                    int hieu = number1 - number2;
                    System.out.println("Hieu 2 so: " + hieu);
                    int product = number1 * number2;
                    System.out.println("Tich 2 so: " + product);
                    double quotient = (double) number1 / number2;
                    System.out.println("Thuong 2 so: " + quotient);
                    break;
                }
                case 3: {
                    System.out.println("Kiem tra so nguyen am");
                    System.out.println("Nhap vao so n nguyen duong: ");
                    int number = Integer.valueOf(scan.nextLine());
                    if (number < 0) {
                        for (int i = -1; i > number; i--) {
                            System.out.println("So nguyen am tu 0 toi n: " + i);
                        }
                    } else {
                        System.out.println("Khong co so nguyen am tu 0 toi n");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Nhap so n: ");
                    int number = Integer.valueOf(scan.nextLine());
                    int count = 0;
                    for (int i = 0; i < number + 1; i++) {
                        if (i % 2 == 0 && i % 6 == 0) {
                            count++;
                        }
                    }
                    System.out.println("So cac so chan chia het cho 6: " + count);
                    break;
                }
                case 0: {
                    System.out.println("Thoat");
                    break;
                }
                default: {
                    System.out.println("Khong co chuc nang nay");
                    break;
                }
            }
        } while (select != 0);
    }
}
