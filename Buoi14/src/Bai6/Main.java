/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai6;

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
        ArrayList<XeMay> motor = new ArrayList<>();
        QuanLyXeMayService service = new QuanLyXeMayService();
        int select;
        do {
            System.out.println("-----------");
            System.out.println("1. Nhap thong tin");
            System.out.println("2. In thong tin");
            System.out.println("3. Tim xe may theo khoang gia");
            System.out.println("4. Sap xep giam dan theo gia");
            System.out.println("5. Xoa doi tuong theo ma");
            System.out.println("6. Sap xep tang dan theo ten");
            System.out.println("7. Tim kiem xe may trong ten co cu 'a'");
            System.out.println("8. Tim kiem XM hang bat dau bang 'a', ten chua chuoi nhap");
            System.out.println("9. Liet ke 3 xe may co gia lon nhat cua hang Poly");
            System.out.println("10. Xe So");
            System.out.println("0. Thoat");
            System.out.println("----------------");
            System.out.println("Moi chon chuc nang: ");
            select = Integer.valueOf(scan.nextLine());

            switch (select) {
                case 1: {
                    System.out.println("Nhap thong tin");
                    service.xeMayInput(motor);
                    break;
                }
                case 2: {
                    System.out.println("In thong tin");
                    service.xeMayDisplay(motor);
                    break;
                }
                case 3: {
                    System.out.println("Tim xe may theo khoang gia");
                    double costMin;
                    double costMax;
                    System.out.println("Nhap khoang gia: ");
                    do {
                        System.out.println("Gia nho nhat: ");
                        costMin = Double.valueOf(scan.nextLine());
                        System.out.println("Gia lon nhat: ");
                        costMax = Double.valueOf(scan.nextLine());
                    } while (costMin > costMax);
                    service.findingByCostAmount(motor, costMin, costMax);
                    break;
                }
                case 4: {
                    System.out.println("Sap xep giam dan theo gia");
                    service.costDescendingSort(motor);
                    service.xeMayDisplay(motor);
                    break;
                }
                case 5: {
                    System.out.println("Xoa doi tuong theo ma");
                    System.out.println("Nhap ma can xoa: ");
                    String idInput = scan.nextLine();
                    service.removingByID(motor, idInput);
                    System.out.println("Danh sach sau khi xoa: ");
                    service.xeMayDisplay(motor);
                    break;
                }
                case 6: {
                    System.out.println("Sap xep tang dan theo ten");
                    service.nameAscendingSort(motor);
                    service.xeMayDisplay(motor);
                    break;
                }
                case 7: {
                    System.out.println("Tim kiem xe may trong ten co cu 'a'");
                    service.findingObjectContainA(motor);
                    break;
                }
                case 8: {
                    System.out.println("Tim kiem XM hang bat dau bang 'a', ten chua chuoi nhap");
                    System.out.println("Nhap chuoi can tim: ");
                    String stringInput = scan.nextLine();
                    service.findingObjectStartsWithAContainStringInput(motor, stringInput);
                    break;
                }
                case 9: {
                    System.out.println("Liet ke 3 xe may co gia lon nhat cua hang Poly");
                    service.list3PolyBrandMaxValuesOfCost(motor);
                    break;
                }
                case 10: {
                    System.out.println(" Xe So");
                    XeSo xs = new XeSo();
                    xs.setName("wave");
                    xs.setMotorID("abc1");
                    xs.setBrand("honda");
                    xs.setCost(100);
                    xs.setFuel("ron");
                    xs.setEngine("abc1");
                    xs.xeSoDisplay();
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
