/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT11_2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author haove
 */
public class DienThoaiService {

    public void DienThoaiInput(ArrayList<DienThoai> lists) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Nhap thong tin dien thoai: ");
            System.out.println("Nhap ma: ");
            int phoneID = Integer.valueOf(scan.nextLine());
            System.out.println("Nhap ten: ");
            String name = scan.nextLine();
            System.out.println("Nhap hang: ");
            String brand = scan.nextLine();
            System.out.println("Nhap mau: ");
            String color = scan.nextLine();
            System.out.println("Nhap bo nho: ");
            int capacity = Integer.valueOf(scan.nextLine());
            System.out.println("Nhap gia: ");
            int cost = Integer.valueOf(scan.nextLine());
            DienThoai dt = new DienThoai(phoneID, name, brand, color, capacity, cost);
            lists.add(dt);
            System.out.println("Ban co muon nhap tiep khong?(1/0)");
            String yon = scan.nextLine();
            if (yon.equalsIgnoreCase("0")) {
                System.out.println("Nhap thanh cong");
                break;
            }
        }
    }

    public void DienThoaiPrint(ArrayList<DienThoai> listDienThoai) {
        for (DienThoai dienThoai : listDienThoai) {
            dienThoai.infoPrint();
        }
    }
// Name -> String -> compareTo

    public void sapXepGiamDanTheoTen(ArrayList<DienThoai> lists) {
        lists.sort((o1, o2) -> {
            return o2.getName().compareTo(o1.getName());
        });
    }

    // Cost (int) -> "-"
    public void sapXepTangDanTheoGia(ArrayList<DienThoai> lists) {
        lists.sort((o1, o2) -> {
            return o1.getCost() - o2.getCost();
        });
    }

    public void xoaTheoViTri(ArrayList<DienThoai> lists, int index) {
        lists.remove(index);
    }
    
    public void xoaTheoMaDT(ArrayList<DienThoai>lists, int phoneIDInput){
        lists.remove(phoneIDInput);
    }

    public void timDienThoaiTheoGia(ArrayList<DienThoai> lists, int costInput) {
        for (DienThoai list : lists) {
            if (list.getCost() == costInput) {
                list.infoPrint();
            }
        }

    }

    public void lietKeDTTheoBoNho(ArrayList<DienThoai> lists, int capacityInput) {
        for (DienThoai list : lists) {
            if (list.getCapacity() == capacityInput) {
                list.infoPrint();
            }
        }
    }
}
