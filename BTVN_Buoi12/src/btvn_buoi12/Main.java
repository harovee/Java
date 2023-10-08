/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn_buoi12;

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
        ArrayList<Nguoi> list = new ArrayList<>();
        QuanLyNguoiService service = new QuanLyNguoiService();
        do {
            System.out.println("---------MENU-----------");
            System.out.println("1. Thong tin Nguoi");
            System.out.println("2. In cac thong tin ra man hinh");
            System.out.println("3. Liet ke Nguoi co gioi tinh Nu");
            System.out.println("4. Liet ke cac Nguoi co tuoi trong khoang min - max");
            System.out.println("5. Sap xep Nguoi theo tuoi tang dan");
            System.out.println("6. Xoa Nguoi theo vi tri");
            System.out.println("7. Sap xep giam dan theo ten");
            System.out.println("0. Thoat");
            System.out.println("--------------------------");
            System.out.println("Moi ban chon chuc nang: ");
            select = Integer.valueOf(scan.nextLine());
            switch (select) {
                case 1: {
                    System.out.println("Thong tin Nguoi");
                    service.NguoiInput(list);
                    break;
                }
                case 2: {
                    System.out.println("In cac thong tin ra man hinh");
                    service.NguoiPrint(list);
                    break;
                }
                case 3: {
                    System.out.println("Liet ke Nguoi co gioi tinh Nu");
                    service.listFemaleGender(list);
                    break;
                }
                case 4: {
                    System.out.println("Liet ke cac Nguoi co tuoi trong khoang min - max");
                    int ageMin;
                    int ageMax;
                    do {
                        System.out.print("Nhap tuoi min: ");
                        ageMin = Integer.valueOf(scan.nextLine());
                        System.out.print("Nhap tuoi max: ");
                        ageMax = Integer.valueOf(scan.nextLine());
                    } while (ageMin >= ageMax);
                    service.listAgeFromMinToMax(list, ageMin, ageMax);
                    break;
                }
                case 5: {
                    System.out.println("Sap xep Nguoi theo tuoi tang dan");
                    service.ageAscendingSort(list);
                    System.out.println("Danh sach Nguoi sau khi sap xep: ");
                    service.NguoiPrint(list);
                    break;
                }
                case 6: {
                    System.out.println("Xoa Nguoi theo vi tri");
                    System.out.println("Nhap vi tri can xoa: ");
                    int indexInput = Integer.valueOf(scan.nextLine());
                    service.removeNguoiByIndex(list, indexInput);
                    System.out.println("Danh sach sau khi xoa: ");
                    service.NguoiPrint(list);
                    break;
                }
                case 7: {
                    System.out.println("Xap sep giam dan theo ten");
                    service.nameDescendingSort(list);
                    System.out.println("Danh sach sau khi sap xep: ");
                    service.NguoiPrint(list);
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
