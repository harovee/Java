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
        ArrayList<DienThoai> list = new ArrayList<>();
        DienThoaiService service = new DienThoaiService();
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
                    service.DienThoaiInput(list);
                    break;
                }
                case 2: {
                    System.out.println("In cac thong tin ra man hinh");
                    service.DienThoaiPrint(list);
                    break;
                }
                case 3: {
                    System.out.println("Tim cac dien thoai theo gia");
                    System.out.println("Nhap gia dien thoai can tim: ");
                    int costInput = Integer.valueOf(scan.nextLine());
                    service.timDienThoaiTheoGia(list, costInput);
                    break;
                }
                case 4: {
                    System.out.println("Nhap vao bo nho - Liet ke cac dien thoai");
                    System.out.println("Nhap bo nho dien thoai can tim: ");
                    int capacityInput = Integer.valueOf(scan.nextLine());
                    service.lietKeDTTheoBoNho(list, capacityInput);
                    break;
                }
                case 5: {
                    System.out.println("Sap xep dien thoai giam dan theo ten");
                    service.sapXepGiamDanTheoTen(list);
                    service.DienThoaiPrint(list);
                    break;
                }
                case 6: {
                    System.out.println("Sap xep dien thoai tang dan theo gia");
                    service.sapXepTangDanTheoGia(list);
                    service.DienThoaiPrint(list);
                    break;
                }
                case 7: {
                    System.out.println("Xoa dien thoai theo vi tri");
                    System.out.println("Moi nhap vi tri can xoa: ");
                    int index = Integer.valueOf(scan.nextLine());
                    service.xoaTheoViTri(list, index);
                    System.out.println("List sau khi xoa: ");
                    service.DienThoaiPrint(list);
                    break;
                }
                case 8: {
                    System.out.println("Xoa dien thoai theo ma");
                    System.out.println("Nhap ma dien thoai can xoa: ");
                    int phoneIDInput = Integer.valueOf(scan.nextLine());
                    service.xoaTheoMaDT(list, phoneIDInput);
                    System.out.println("List sau khi xoa: ");
                    service.DienThoaiPrint(list);
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
