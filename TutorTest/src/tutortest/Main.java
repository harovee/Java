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
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<SinhVien> list = new ArrayList<>();
        SinhVienService service = new SinhVienService();
        int select;
        do {
            System.out.println("---MENU---");
            System.out.println("1. Them sinh vien");
            System.out.println("2. Xuat sinh vien");
            System.out.println("3. Tim kiem sinh vien ten bat dau chu a");
            System.out.println("4. Tim sinh vien diem tb lon nhat");
            System.out.println("0. Thoat");
            System.out.println("---MENU---");
            System.out.println("Moi chon: ");
            select = Integer.valueOf(scan.nextLine());
            switch (select) {
                case 1: {
                    System.out.println("1. Them sinh vien");
                    service.studentInput(list);
                    break;
                }
                case 2: {
                    System.out.println("2. Xuat sinh vien");
                    ArrayList<SinhVien> sv1 = service.studentPrint(list);
                    for (SinhVien sinhVien : sv1) {
                        sinhVien.studentInfo();
                    }
                    break;
                }
                case 3: {
                    System.out.println("3. Tim kiem sinh vien ten bat dau chu a");
                    
                    break;
                }
                case 4: {
                    System.out.println("4. Tim sinh vien diem tb lon nhat");
                    
                    break;
                }
                case 5: {

                    break;
                }
                case 0: {
                    System.out.println("0. Thoat");
                    break;
                }
                default: {
                    System.out.println("Khong co chuc nang nay");
                }
            }
        } while (select != 0);
    }
}
