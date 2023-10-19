/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai5;

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
        ArrayList<DongHo> watch = new ArrayList<>();
        DongHoService service = new DongHoService();
        do {
            System.out.println("-----------");
            System.out.println("1. Nhap thong tin");
            System.out.println("2. In thong tin");
            System.out.println("3. Tim dong ho theo khoang gia");
            System.out.println("4. Xoa dong ho theo ma");
            System.out.println("5. Sap xep dong ho theo kich thuoc tang dan");
            System.out.println("6. Sap xep dong ho theo kich thuoc giam dan");
            System.out.println("0. Thoat");
            System.out.println("----------------");
            System.out.println("Moi chon chuc nang: ");
            select = Integer.valueOf(scan.nextLine());

            switch (select) {
                case 1: {
                    System.out.println("Nhap thong tin");
                    service.dongHoInput();
                    break;
                }
                case 2: {
                    System.out.println("In thong tin");
                    service.dongHoDisplay();
                    break;
                }
                case 3: {
                    System.out.println("Tim dong ho theo khoang gia");
                    int costMin;
                    int costMax;
                    System.out.println("Nhap khoang gia: ");
                    do {
                        System.out.println("Gia nho nhat: ");
                        costMin = Integer.valueOf(scan.nextLine());
                        System.out.println("Gia lon nhat: ");
                        costMax = Integer.valueOf(scan.nextLine());
                    } while (costMin > costMax);
                    service.findingByCostAmount(costMin, costMax);
                    break;
                }
                case 4: {
                    System.out.println("Xoa dong ho theo ma");
                    System.out.println("Nhap ma can xoa: ");
                    int idInput = Integer.valueOf(scan.nextLine());
                    service.removingByWatchID(idInput);
                    service.dongHoDisplay();
                    break;
                }
                case 5: {
                    System.out.println("Sap xep dong ho theo kich thuoc tang dan");
                    service.widthAscendingSort();
                    break;
                }
                case 6: {
                    System.out.println("Sap xep dong ho theo kich thuoc giam dan");
                    service.widthDescendingSort();
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
