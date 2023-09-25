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
public class LuyenTapTrenLop {

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
                System.out.println("Nhap nganh hoc: ");
                String major = scan.nextLine();
                System.out.println("Ky hoc: ");
                int grade = Integer.valueOf(scan.nextLine());
                System.out.println("-------------------------");
                System.out.println("Ten: "+name);
                System.out.println("Tuoi: "+age);
                System.out.println("Dia chi: "+address);
                System.out.println("Nganh hoc: "+major);
                System.out.println("Ky hoc: "+grade);
                break;
            }
            case 2: {
                System.out.println("Tinh toan 2 so:  ");
                System.out.println("Nhap so thu nhat: ");
                Float number1 = Float.valueOf(scan.nextLine());
                System.out.println("Nhap so thu 2: ");
                Float number2 = Float.valueOf(scan.nextLine());
                Float sum = number1 + number2;
                Float hieu = number1 - number2;
                Float tich = number1 * number2;
                Float thuong = number1 / number2;
                
                System.out.println("------------------------");
                System.out.println("Tong = "+sum);
                System.out.println("Hieu = "+hieu);
                System.out.println("Tich = "+tich);
                System.out.println("Thuong = "+thuong);
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
    }
}
