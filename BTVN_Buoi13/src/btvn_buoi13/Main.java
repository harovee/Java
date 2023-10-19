/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn_buoi13;

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
        ArrayList<ThucVat> plants = new ArrayList<>();
        QLThucVat manage = new QLThucVat();
        int select;
        do {
            System.out.println("---------MENU-----------");
            System.out.println("1. Them Thuc Vat");
            System.out.println("2. Hien thi danh sach TV");
            System.out.println("3. Tim kiem ten TV bat dau bang 'c'");
            System.out.println("4. Hien thi DS Thuc Vat o vi tri chan");
            System.out.println("5. Sap xep DS Thuc Vat tang dan theo ten");
            System.out.println("6. Sap xep DS Thuc Vat giam dan theo chieu cao");
            System.out.println("7. Hien thi DS TV co chieu cao trong khoang nhap tu ban phim");
            System.out.println("8. Hien thi DS TV co ten ket thuc bang 'e'");
            System.out.println("9. Hien thi DS TV trong ten co chu 'a'");
            System.out.println("0. Thoat");
            System.out.println("--------------------------");
            System.out.println("Moi ban chon chuc nang: ");
            select = Integer.valueOf(scan.nextLine());
            switch (select) {
                case 1: {
                    System.out.println("Them Thuc Vat");
                    manage.plantsInput(plants);
                    break;
                }
                case 2: {
                    System.out.println("Hien thi danh sach TV");
                    manage.plantsDisplay(plants);
                    break;
                }
                case 3: {
                    System.out.println("Tim kiem ten TV bat dau bang 'c'");
                    manage.plantsFinding(plants);
                    break;
                }
                case 4: {
                    System.out.println("Hien thi DS Thuc Vat o vi tri chan");
                    manage.evenIndexPlants(plants);
                    break;
                }
                case 5: {
                    System.out.println("Sap xep DS Thuc Vat tang dan theo ten");
                    manage.plantsAscendingSort(plants);
                    manage.plantsDisplay(plants);
                    break;
                }
                case 6: {
                    System.out.println("Sap xep DS Thuc Vat giam dan theo chieu cao");
                    manage.plantsHeightDescendingSort(plants);
                    manage.plantsDisplay(plants);
                    break;
                }
                case 7: {
                    System.out.println("Hien thi DS TV co chieu cao trong khoang nhap tu ban phim");
                    System.out.println("Nhap min - max: ");
                    int min;
                    int max;
                    do {
                        System.out.print("Min: ");
                        min = Integer.valueOf(scan.nextLine());
                        System.out.print("Max: ");
                        max = Integer.valueOf(scan.nextLine());
                    } while (min > max);
                    manage.plantsHeightFinding(plants, min, max);
                    break;
                }
                case 8: {
                    System.out.println("Hien thi DS TV co ten ket thuc bang 'e'");
                    manage.plantsEndstWithE(plants);
                    break;
                }
                case 9: {
                    System.out.println("Hien thi DS TV trong ten co chu 'a'");
                    manage.plantsContainA(plants);
                    break;
                }
                case 10: {
                    System.out.println("Cay an qua");
                    CayAnQua fruitTree = new CayAnQua(10, "abc123", "Vai", "Cay an qua", "Bac Giang", 5);
                    fruitTree.fruitTreeInfoPrint();
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
