/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutortest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author haove
 */
public class SinhVienService {

    public void studentInput(ArrayList<SinhVien> students) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Nhap ma: ");
            String id = scan.nextLine();
            System.out.println("Nhap ten: ");
            String name = scan.nextLine();
            System.out.println("Nhap tuoi: ");
            int age = Integer.valueOf(scan.nextLine());
            System.out.println("Nhap gioi tinh: ");
            boolean gender = Boolean.valueOf(scan.nextLine());
            System.out.println("Nhap que quan: ");
            String village = scan.nextLine();
            System.out.println("Nhap diem Toan: ");
            double mathMark = Double.valueOf(scan.nextLine());
            System.out.println("Nhap diem Ly: ");
            double physicsMark = Double.valueOf(scan.nextLine());
            System.out.println("Nhap diem Hoa: ");
            double chemistryMark = Double.valueOf(scan.nextLine());
            SinhVien sv = new SinhVien(mathMark, physicsMark, chemistryMark, id, name, age, gender, village);
            students.add(sv);
            System.out.println("Ban co nhap tiep khong?");
            if (scan.nextLine().equalsIgnoreCase("n")) {
                System.out.println("Nhap thong tin xong");
                break;
            }
        }
    }

    public ArrayList<SinhVien> studentPrint(ArrayList<SinhVien> students) {
        return students;
    }
}
