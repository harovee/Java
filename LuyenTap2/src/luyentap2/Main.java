/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package luyentap2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author haove
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<XeMay> list = new ArrayList<>();
        QLXeMay manage = new QLXeMay();
        Scanner scan = new Scanner(System.in);
        int select;
        do {
            System.out.println("-------------------");
            System.out.println("1. Nhap doi tuong");
            System.out.println("2. Xuat doi tuong");
            System.out.println("3. Tim xe may theo khoang ma");
            System.out.println("4. Tim xe may trong khoang gia");
            System.out.println("5. Sap xep giam dan cua gia tien");
            System.out.println("6. Xoa doi tuong");
            System.out.println("7. Xe So");
            System.out.println("0. Thoat");
            System.out.println("--------------------------");
            System.out.println("Moi chon chuc nang: ");
            select = Integer.valueOf(scan.nextLine());
            switch (select) {
                case 1: {
                    System.out.println("Nhap doi tuong");
                    manage.motorInput(list);
                    break;
                }
                case 2: {
                    System.out.println("Xuat doi tuong");
                    manage.motorDisplay(list);
                    break;
                }
                case 3: {
                    System.out.println("Tim xe may theo khoang ma");
                    System.out.println("Nhap ma min: ");
                    int idMin = Integer.valueOf(scan.nextLine());
                    System.out.println("Nhap ma max: ");
                    int idMax = Integer.valueOf(scan.nextLine());
                    manage.getMotorByIDAmount(list, idMin, idMax);
                    break;
                }
                case 4: {
                    System.out.println("Tim xe may trong khoang gia");
                    System.out.println("Nhap gia min: ");
                    double costMin = Double.valueOf(scan.nextLine());
                    System.out.println("Nhap gia max: ");
                    double costMax = Double.valueOf(scan.nextLine());
                    manage.getMotorByCostAmount(list, costMin, costMax);
                    break;
                }
                case 5: {
                    System.out.println("Sap xep giam dan cua gia tien");
                    manage.costDescendingSort(list);
                    manage.motorDisplay(list);
                    break;
                }
                case 6: {
                    System.out.println("Xoa doi tuong");
                    System.out.println("Nhap vi tri can xoa: ");
                    int index = Integer.valueOf(scan.nextLine());
                    manage.removeOgject(list, index);
                    System.out.println("DS sau khi xoa");
                    manage.motorDisplay(list);
                    break;
                }
                case 7: {
                    System.out.println("Xe So");
                    XeSo xs = new XeSo();
                    xs.setMotorID(123);
                    xs.setBrand("honda");
                    xs.setCost(30.5);
                    xs.setFuel("Ron");
                    xs.setEngine("abc");
                    xs.xeSoPrint();
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
