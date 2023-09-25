/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package btvn5;

import java.util.Scanner;

/**
 *
 * @author haove
 */
public class BTVN5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        do {

            System.out.println("---------MENU---------");
            System.out.println("1. Tinh toan");
            System.out.println("2. Nhap thong tin vat nuoi");
            System.out.println("3. Tinh tong cac so le tu 1 -n");
            System.out.println("4. Tinh tich so chan");
            System.out.println("5. Thoat");
            System.out.println("---------------------------------");
            System.out.println("Moi chon chuc nang: ");
            select = Integer.valueOf(scan.nextLine());
            switch (select) {
                case 1: {
                    System.out.println("Tinh toan");
                    System.out.println("Nhap diem Toan: ");
                    float mathPoint = Float.valueOf(scan.nextLine());
                    System.out.println("Nhap diem Ly: ");
                    float physicsPoint = Float.valueOf(scan.nextLine());
                    System.out.println("Nhap diem Hoa: ");
                    float chemistryPoint = Float.valueOf(scan.nextLine());
                    float average = (mathPoint + physicsPoint + chemistryPoint) / 3;
                    System.out.println("Trung binh tong cua 3 mon la: " + average);
                    break;
                }
                case 2: {
                    System.out.println("Nhap thong tin vat nuoi");
                    System.out.println("Nhap ma vat nuoi: ");
                    String id = scan.nextLine();
                    System.out.println("Nhap can nang: ");
                    float weight = Float.valueOf(scan.nextLine());
                    System.out.println("Nhap chieu cao: ");
                    float height = Float.valueOf(scan.nextLine());
                    System.out.println("Giong loai: ");
                    String kind = scan.nextLine();
                    System.out.println("-------------------------");
                    System.out.println("Ma: " + id);
                    System.out.println("Can nang: " + weight);
                    System.out.println("Chieu cao: " + height);
                    System.out.println("Giong loai: " + kind);
                    break;
                }
                case 3: {
                    System.out.println("Tinh tong cac so le");
                    System.out.println("Nhap so bat ky: ");
                    int number = Integer.valueOf(scan.nextLine());
                    int sum = 0;
                    for (int i = 0; i < number + 1; i++) {
                        if (i % 2 != 0) {
                            sum += i;
                        }
                    }
                    System.out.println("Tong cac so le: " + sum);
                    break;
                }
                case 4: {
                    System.out.println("Tinh tich cac so chan");
                    System.out.println("Nhap so bat ky: ");
                    int number = Integer.valueOf(scan.nextLine());
                    int product = 1;
                    for (int i = 1; i < number; i++) {
                        if (i % 2 == 0) {
                            product *= i;
                        }
                    }
                    System.out.println("Tich cac so chan: " + product);
                    break;
                }
                case 5: {
                    System.out.println("Thoat");
                    break;
                }

                default: {
                    System.out.println("Khong co chuc nang nay");
                    break;
                }
            }
        } while (select != 5);
    }

}
