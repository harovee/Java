/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoringtest;

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
        ArrayList<DoVat> things = new ArrayList<>();
        DoVatService service = new DoVatService();
        do {
            System.out.println("1. Nhap danh sach");
            System.out.println("2. Xuat DS");
            System.out.println("3. Tim theo ma");
            System.out.println("4. Xoa theo ten");
            System.out.println("5. Sap xep theo ma tang dan");
            System.out.println("6. Tim theo khoang gia");
            System.out.println("7. Sap xep theo gia giam dan");
            System.out.println("8. Do Hoa Phat");
            System.out.println("0. Thoat");
            System.out.println("--------------------------");
            System.out.println("Moi chon chuc nang: ");
            select = Integer.valueOf(scan.nextLine());
            switch (select) {
                case 1: {
                    System.out.println("Nhap danh sach");
                    service.objectInput();
                    break;
                }
                case 2: {
                    System.out.println("Xuat DS");
                    service.objectPrint();
                    break;
                }
                case 3: {
                    System.out.println("Tim theo ma");
                    System.out.println("Nhap ma can tim: ");
                    String idInput = scan.nextLine();
                    service.findingObjectByID(idInput);
                    break;
                }
                case 4: {
                    System.out.println("Xoa theo ten");
                    System.out.println("Nhap ten can xoa: ");
                    String nameInput = scan.nextLine();
                    service.removingObjectByName(nameInput);
                    break;
                }
                case 5: {
                    System.out.println("Sap xep theo ma tang dan");
                    service.objectIDAscendingSort();
                    break;
                }
                case 6: {
                    System.out.println("Tim theo khoang gia");
                    break;
                }
                case 7: {
                    System.out.println("Sap xep theo gia giam dan");
                    break;
                }
                case 8: {
                    System.out.println("Do Hoa Phat");
                    DoHoaPhat dhp = new DoHoaPhat("asdas", "asdas", "asda", 0, 10);
                    dhp.hoaPhatPrint();
                    break;
                }
                case 0: {
                    System.out.println("THOAT");
                    break;
                }

                default: {
                    System.out.println("Khong co chuc nang nay");
                }
            }
        } while (select != 0);
    }
}
