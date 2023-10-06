/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT11_2;

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
        int select;
        do {
            System.out.println("---------MENU-----------");
            System.out.println("1. Thong tin dien thoai");
            System.out.println("2. In cac thong tin ra man hinh");
            System.out.println("3. Tim cac dien thoai theo gia");
            System.out.println("4. Nhap vao bo nho - Liet ke cac dien thoai");
            System.out.println("5. Sap xep dien thoai giam dan theo ten");
            System.out.println("6. Sap xep dien thoai tang dan theo gia");
            System.out.println("7. Xoa dien thoai theo vi tri");
            System.out.println("8. Xoa dien thoai theo ma");
            System.out.println("0. Thoat");
            System.out.println("--------------------------");
            System.out.println("Moi ban chon chuc nang: ");
            select = Integer.valueOf(scan.nextLine());
            switch (select) {
                case 1: {
                    System.out.println("Thong tin dien thoai");
                    break;
                }
                case 2: {
                    System.out.println("In cac thong tin ra man hinh");
                    break;
                }
                case 3: {
                    System.out.println("Tim cac dien thoai theo gia");
                    break;
                }
                case 4: {
                    System.out.println("Nhap vao bo nho - Liet ke cac dien thoai");
                    break;
                }
                case 5: {
                    System.out.println("Sap xep dien thoai giam dan theo ten");
                    break;
                }
                case 6: {
                    System.out.println("Sap xep dien thoai tang dan theo gia");
                    break;
                }
                case 7: {
                    System.out.println("Xoa dien thoai theo vi tri");
                    break;
                }
                case 8: {
                    System.out.println("Xoa dien thoai theo ma");
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
