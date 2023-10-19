/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4;

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
        ArrayList<Dienthoai> phone = new ArrayList<>();
        QLDienThoai manage = new QLDienThoai();
        int select;
        do {
            System.out.println("-----------");
            System.out.println("1. Nhap thong tin");
            System.out.println("2. In thong tin");
            System.out.println("0. Thoat");
            System.out.println("----------------");
            System.out.println("Moi chon chuc nang: ");
            select = Integer.valueOf(scan.nextLine());

            switch (select) {
                case 1: {
                    System.out.println("Nhap thong tin");
                    manage.dienThoaiInput();
                    break;
                }
                case 2: {
                    System.out.println("In thong tin");
                    manage.DienThoaiDisplay();
                    break;
                }
                case 0: {
                    System.out.println("Thoat");
                    break;
                }
                default: {
                    System.out.println("Khong co chuc nang nay");
                }
            }
        } while (select != 0);
    }
}
