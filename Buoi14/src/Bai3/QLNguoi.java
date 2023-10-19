/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author haove
 */
public class QLNguoi {
    ArrayList<Nguoi>person = new ArrayList<>();
    public void nguoiInput(){
        Scanner scan = new Scanner(System.in);
        do {            
           System.out.println("Nhap ten: ");
           String name = scan.nextLine();
            System.out.println("Nhap tuoi: ");
            int age = Integer.valueOf(scan.nextLine());
            System.out.println("Nhap gioi tinh: ");
            String gender = scan.nextLine();
            System.out.println("Nhap que quan: ");
            String village = scan.nextLine();
            System.out.println("Nhap nghe nghiep: ");
            String career = scan.nextLine();
            Nguoi body = new Nguoi(name, age, age, village, career);
            person.add(body);
            System.out.println("Ban co nhap tiep khong?(y/n)");
            if (scan.nextLine().equalsIgnoreCase("n")) {
                System.out.println("Nhap thong tin xong");
                break;
            }
        } while (true);
    }
    
    public void nguoiDisplay(){
        for (Nguoi nguoi : person) {
            nguoi.infoPrint();
        }
    }
}
