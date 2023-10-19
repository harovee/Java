/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ph46895;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author haove
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<ThucVat> listTV = new ArrayList<>();
        QuanLyThucVat manage = new QuanLyThucVat();
        int select;
        do {
            System.out.println("---------MENU-----------");
            System.out.println("1. Nhap doi tuong thuc vat");
            System.out.println("2. Xuat danh sach ");
            System.out.println("3. Hien thi Thuc Vat co ten ket thuc bang 'sa'");
            System.out.println("4. Sap xep tang dan theo ten");
            System.out.println("5. Xoa thuc vat theo ma");
            System.out.println("6. Top 3 Thuc Vat co chieu cao lon nhat");
            System.out.println("7. Sap xep tang dan theo ten & giam dan theo chieu cao");
            System.out.println("8. Cay An Qua");
            System.out.println("0. Thoat");
            System.out.println("------------------------");
            System.out.println("Moi chon chuc nang: ");
            select = Integer.valueOf(scan.nextLine());

            switch (select) {
                case 1: {
                    System.out.println(" Nhap doi tuong thuc vat");
                    manage.thucVatInput(listTV);
                    break;
                }
                case 2: {
                    System.out.println("Xuat danh sach ");
                    ArrayList<ThucVat> list1 = manage.getList(listTV);
                    for (ThucVat thucVat : list1) {
                        thucVat.infoPrint();
                    }
                    break;
                }
                case 3: {
                    System.out.println(" Hien thi Thuc Vat co ten ket thuc bang 'sa'");
                    manage.getThucVatNameEndsWithSA(listTV);
                    break;
                }
                case 4: {
                    System.out.println(" Sap xep tang dan theo ten");
                    manage.nameAscendingSort(listTV);
                    manage.thucVatPrint(listTV);
                    break;
                }
                case 5: {
                    System.out.println(" Xoa thuc vat theo ma");
                    System.out.println("Nhap ma can xoa: ");
                    String idInput = scan.nextLine();
                    manage.removeTVByID(listTV, idInput);
                    System.out.println("Danh sach sau khi xoa: ");
                    manage.thucVatPrint(listTV);         
                    break;
                }
                case 6: {
                    System.out.println(" Top 3 Thuc Vat co chieu cao lon nhat");
                    manage.list3MaxHeight(listTV);
                    break;
                }
                case 7: {
                    System.out.println("Sap xep tang dan theo ten & giam dan theo chieu cao");
                    manage.nameAscendingAndHeightDescendingSort(listTV);
                    manage.thucVatPrint(listTV);
                    break;
                }
                case 8: {
                    System.out.println("Cay An Qua");
                    CayAnQua fruitTree = new CayAnQua();
                    fruitTree.setId("ABC1");
                    fruitTree.setName("Cay Tao");
                    fruitTree.setHeight(3);
                    fruitTree.setFruitKind("Qua ngot");
                    fruitTree.setArea("Ha Noi");
                    fruitTree.cayAnQuaPrint();
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
