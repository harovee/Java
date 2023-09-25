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
public class Buoi4_bt2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Moi nhap chuc nang: ");
        int select = Integer.valueOf(scan.nextLine());
        switch (select) {
            case 1: {
                System.out.println("Tinh tong 2 so nguyen tu ban phim");
                System.out.println("Nhap so thu nhat: ");
                int num1 = Integer.valueOf(scan.nextLine());
                System.out.println("Nhap so thu 2: ");
                int num2 = Integer.valueOf(scan.nextLine());
                int sum = num1 + num2;
                System.out.println("--------");
                System.out.println("Tong 2 so la: " + sum);
                break;
            }
            case 2: {
                System.out.println("Nhap thong tin ca nhan");
                System.out.println("Nhap ten: ");
                String name = scan.nextLine();
                System.out.println("Nhap tuoi: ");
                int age = Integer.valueOf(scan.nextLine());
                System.out.println("Nhap dia chi: ");
                String address = scan.nextLine();
                System.out.println("----------");
                System.out.println("" + name + " " + age
                        + " " + address);
                break;
            }
            case 3: {
                System.out.println("Thoat");
                break;
            }
            default: {
                System.out.println("Chuc nang khong ton tai");
                break;
            }
        }
    }
}
