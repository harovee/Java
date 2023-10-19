/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi15;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author haove
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<MayBay> plane = new ArrayList<>();
        MayBayService service = new MayBayService();
        int select;
        do {
            System.out.println("--------------------------------");
            System.out.println("1. Nhap thong tin may bay");
            System.out.println("2. Xuat thong tin");
            System.out.println("3. Tim kiem may bay trong khoang so ghe");
            System.out.println("4. Sap xep giam dan cua so ghe");
            System.out.println("5. Xoa doi tuong theo ma");
            System.out.println("6. Sap xep tang dan theo ma");
            System.out.println("7. Tim kiem may bay hang chua 'e'");
            System.out.println("8. Tim kiem may bay hang bat dau bang 'b'");
            System.out.println("9. Liet ke 3 may bay Boeing co so ghe lon nhat");
            System.out.println("10. May bay Dan Dung");
            System.out.println("0. Thoat");
            System.out.println("-------------------------------------------------");
            System.out.println("Moi chon chuc nang: ");
            select = Integer.valueOf(scan.nextLine());
            switch (select) {
                case 1: {
                    System.out.println("1. Nhap thong tin may bay");
                    service.mayBayInput(plane);
                    break;
                }
                case 2: {
                    System.out.println("2. Xuat thong tin");
                    service.mayBayDisplay(plane);
                    break;
                }
                case 3: {
                    System.out.println("3. Tim kiem may bay trong khoang so ghe");
                    System.out.println("Nhap so ghe min: ");
                    int seatMin = Integer.valueOf(scan.nextLine());
                    System.out.println("Nhap so ghe max: ");
                    int seatMax = Integer.valueOf(scan.nextLine());
                    service.findingBySeatNumberAmount(plane, seatMin, seatMax);
                    break;
                }
                case 4: {
                    System.out.println("4. Sap xep giam dan cua so ghe");
                    service.seatDescendingSort(plane);
                    service.mayBayDisplay(plane);
                    break;
                }
                case 5: {
                    System.out.println("5. Xoa doi tuong theo ma");
                    System.out.println("Nhap ma can xoa: ");
                    String idInput = scan.nextLine();
                    service.removingByID(plane, idInput);
                    System.out.println("Danh sach sau khi xoa: ");
                    service.mayBayDisplay(plane);
                    break;
                }
                case 6: {
                    System.out.println("6. Sap xep tang dan theo ma");
                    service.planeIDAscendingSort(plane);
                    service.mayBayDisplay(plane);
                    break;
                }
                case 7: {
                    System.out.println("7. Tim kiem may bay hang chua 'e'");
                    service.findingPlaneBrandContainE(plane);
                    break;
                }
                case 8: {
                    System.out.println("8. Tim kiem may bay hang bat dau bang 'b'");
                    ArrayList<MayBay> planes = service.getPlanesStartWith(plane);
                    for (MayBay mayBay : planes) {
                        mayBay.infoPrint();
                    }
                    break;
                }
                case 9: {
                    System.out.println("9. Liet ke 3 may bay Boeing co so ghe lon nhat");
                    service.list3BoeingHavingSeatMax(plane);
                    break;
                }
                case 10: {
                    System.out.println("10. May bay Dan Dung");
                    DanDung dd = new DanDung();
                    dd.setPlaneID("abc1");
                    dd.setBrand("VNE");
                    dd.setSeatNumber(100);
                    dd.setEngineKind("ABC1");
                    dd.setEngineNumber("abc1");
                    dd.danDungDisplay();
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
