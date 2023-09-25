/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package btvn4;

import java.util.Scanner;

/**
 *
 * @author haove
 */
public class BaiTapVN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Moi chon chuc nang:");
        int select = Integer.valueOf(scan.nextLine());

        switch (select) {
            case 1: {
                System.out.println("Tinh Toan");
                System.out.println("Nhap so thu nhat: ");
                Float number1 = Float.valueOf(scan.nextLine());
                System.out.println("Nhap so thu hai: ");
                Float number2 = Float.valueOf(scan.nextLine());
                System.out.println("Nhap so thu ba: ");
                Float number3 = Float.valueOf(scan.nextLine());
                Float sum = number1 + number2 + number3;
                Float difference = number1 - number2 - number3;
                Float product = number1 * number2 * number3;
                Float quotient = number1 / number2 / number3;
                System.out.println("----------------------");
                System.out.println("Tong 3 so: " + sum);
                System.out.println("Hieu 3 so: " + difference);
                System.out.println("Tich 3 so: " + product);
                System.out.println("Thuong 3 so: " + quotient);
                break;
            }
            case 2: {
                System.out.println("Nhap thong tin ca nhan");
                System.out.println("Nhap ten: ");
                String name = scan.nextLine();
                System.out.println("Nhap tuoi: ");
                int age = Integer.valueOf(scan.nextLine());
                System.out.println("Nhap que quan: ");
                String village = scan.nextLine();
                System.out.println("Nhap can nang: ");
                Float weight = Float.valueOf(scan.nextLine());
                System.out.println("Nhap ky hoc: ");
                int grade = Integer.valueOf(scan.nextLine());
                System.out.println("Nhap chuyen nganh: ");
                String major = scan.nextLine();
                System.out.println("So nha: ");
                int homeNumber = Integer.valueOf(scan.nextLine());
                System.out.println("Dia chi: ");
                String addess = scan.nextLine();
                System.out.println("-----------------------");
                System.out.println("Ten: " + name);
                System.out.println("Tuoi: " + age);
                System.out.println("Que quan: " + village);
                System.out.println("Can nang: " + weight);
                System.out.println("Ky hoc: " + grade);
                System.out.println("Chuyen nganh: " + major);
                System.out.println("So nha: " + homeNumber);
                System.out.println("Dia chi: " + addess);
                break;
            }
            case 3: {
                System.out.println("Kiem tra hoc luc");
                System.out.println("Nhap diem Toan: ");
                Float mathPoint = Float.valueOf(scan.nextLine());
                System.out.println("Nhap diem Ly: ");
                Float physicsPoint = Float.valueOf(scan.nextLine());
                System.out.println("Nhap diem Hoa");
                Float chemistryPoint = Float.valueOf(scan.nextLine());
                Float average = (mathPoint + physicsPoint + chemistryPoint) / 3;
                System.out.println("Diem TB: " + average);
                if (average >= 0 && average < 5) {
                    System.out.println("Hoc luc yeu");
                }
                else if (average >= 5 && average < 7) {
                    System.out.println("Hoc luc TB");
                }
                else if (average >= 7 && average < 8) {
                    System.out.println("Hoc luc kha");
                }
                else if (average >= 8 && average < 9) {
                    System.out.println("Hoc luc Gioi");
                } else {
                    System.out.println("Hoc luc xuat sac");
                }
                break;
            }
            case 4: {
                System.out.println("Kiem tra so");
                System.out.println("Nhap so nguyen: ");
                int number = Integer.valueOf(scan.nextLine());
                if (number % 2 == 0) {
                    System.out.println("Day khong phai so le");
                } else {
                    if (number % 3 == 0) {
                        System.out.println("Day la so le chia het cho 3");
                    } else {
                        System.out.println("Day la so le khong chia het cho 3");
                    }
                }
                break;
            }
            case 5: {
                System.out.println("Tinh tong");
                System.out.println("Nhap so n: ");
                int nNumber = Integer.valueOf(scan.nextLine());
                int sum = 0;
                for (int i = 0; i <= nNumber; i++) {
                    sum += i;
                }
                System.out.println("Tong tu 0 den n la: " + sum);
                break;
            }
            case 6: {
                System.out.println("Tinh tich");
                System.out.println("Nhap so n: ");
                int nNumber = Integer.valueOf(scan.nextLine());
                int product = 1;
                for (int i = 1; i <= nNumber; i++) {
                    product *= i;
                }
                System.out.println("Tich tu 0 den n la: " + product);
                break;
            }
            case 7: {
                System.out.println("Tinh tong le");
                System.out.println("Nhap so n: ");
                int nNumber = Integer.valueOf(scan.nextLine());
                int sum = 0;
                for (int i = 0; i <= nNumber; i++) {
                    if (i % 2 != 0) {
                        sum += i;
                    }
                }
                System.out.println("Tong cac so le: " + sum);
                break;
            }
            case 8: {
                System.out.println("Thoat");
                break;
            }
            default: {
                System.out.println("Khong co chuc nang nay");
                break;
            }
        }
    }

}
