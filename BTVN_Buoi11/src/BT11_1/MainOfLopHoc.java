/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT11_1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author haove
 */
public class MainOfLopHoc {

    public static void main(String[] args) {
        ArrayList<LopHoc> classroom = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        String name = scan.nextLine();
        System.out.println("Nhap toa: ");
        String building = scan.nextLine();
        System.out.println("Nhap dien tich: ");
        int area = Integer.valueOf(scan.nextLine());
        LopHoc cRoom = new LopHoc(name, building, area);
        classroom.add(cRoom);
        for (LopHoc lopHoc : classroom) {
            lopHoc.infoPrint();
        }
//        classroom.forEach(s->s.infoPrint());
//        classroom.forEach(LopHoc::infoPrint);
    }
}
