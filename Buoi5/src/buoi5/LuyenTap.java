/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi5;

import java.util.Scanner;

/**
 *
 * Menu lap lai toi khi chon 3 thi dung 1.Nhap 2 so nguyen duong. Tinh thuong
 * cua 2 so 2.Nhap ten, tuoi, dia chi va in
 */
public class LuyenTap {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        do {
            System.out.println("----------------------------------");
            System.out.println("1.Tinh thuong 2 so nguyen duong");
            System.out.println("2.In thong tin");
            System.out.println("3. Thoat");
            System.out.println("----------------------------------");
            System.out.println("Moi chon chuc nang: ");
            select = Integer.valueOf(scan.nextLine());
            switch (select) {
                case 1: {
                    System.out.println("Tinh Thuong 2 so nguyen duong");
                    System.out.println("Nhap so thu nhat: ");
                    int number1 = Integer.valueOf(scan.nextLine());
                    System.out.println("Nhap so thu 2: ");
                    int number2 = Integer.valueOf(scan.nextLine());
                    double quotient = (double)number1 / number2;
                    System.out.println("Thuong cua 2 so la: "
                            + quotient);
                    break;
                }
                case 2: {
                    System.out.println("In thong tin");
                    System.out.println("Nhap ten: ");
                    String name = scan.nextLine();
                    System.out.println("Nhap tuoi: ");
                    int age = Integer.valueOf(scan.nextLine());
                    System.out.println("Nhap dia chi: ");
                    String address = scan.nextLine();
                    System.out.println("---------------");
                    System.out.println("Ten: " + name);
                    System.out.println("Tuoi: " + age);
                    System.out.println("Dia chi: " + address);
                    break;
                }
                case 3: {
                    System.out.println("Thoat");
                    break;
                }
                default: {
                    System.out.println("Khong co chuc nang nay");
                    break;
                }
            }
        } while (select != 3);

    }
}
