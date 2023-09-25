/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KieuDuLieuvaNhapXuat;

import java.util.Scanner;

/**
 *
 * @author haove
 */
public class bai3_buoi2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Nhap ten: ");
        String name = scan.nextLine();

        System.out.println("Nhap tuoi: ");
        //Cách 1: thêm scan.nextLine
        //int age = scan.nextInt();
        //scan.nextLine();
        //Cach2: 
        //Ép kieur String -> Integer
        //Coi tất cả mọi thứ nhập từ bàn phím là chuỗi
        //Sau đó mới ép kiểu về dữ liệu tương ứng
        int age = Integer.valueOf(scan.nextLine());
        System.out.println("Nhap dia chi: ");
        String address = scan.nextLine();

        System.out.println("Nhap nganh hoc: ");
        String major = scan.nextLine();

        System.out.println("Nhap ky hoc: ");
        Integer grade = scan.nextInt();

        System.out.println("Ten: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("Dia chi: " + address);
        System.out.println("Nganh hoc: " + major);
        System.out.println("Ky hoc: " + grade);
    }
}
