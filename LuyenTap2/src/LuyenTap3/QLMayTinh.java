/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuyenTap3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author haove
 */
public class QLMayTinh {
    public void compInput(ArrayList<MayTinh>listComp){
        Scanner scan = new Scanner(System.in);
        while (true) {            
            System.out.println("Nhap ma: ");
            String compId = scan.nextLine();
            System.out.println("Nhap ten: ");
            String name = scan.nextLine();
            System.out.println("Nhap hang: ");
            String brand = scan.nextLine();
            System.out.println("Nhap bo nho: ");
            int capacity = Integer.valueOf(scan.nextLine());
            System.out.println("Nhap gia: ");
            float cost = Float.valueOf(scan.nextLine());
            System.out.println("Nhap trang thai: ");
            boolean status = Boolean.valueOf(scan.nextLine());
            MayTinh comp = new MayTinh(compId, name, brand, capacity, cost, status);
            listComp.add(comp);
            System.out.println("Ban co nhap tiep khong?(y/n)");
            if (scan.nextLine().equalsIgnoreCase("n")) {
                System.out.println("Nhap thong tin xong");
            }
        }
    }
    
    public void compDisplay(ArrayList<MayTinh>listComp){
        for (MayTinh mayTinh : listComp) {
            mayTinh.infoPrint();
        }
    }
    
    public void getCompStartWithA(ArrayList<MayTinh>listComp){
        for (MayTinh mayTinh : listComp) {
            if (mayTinh.getName().toLowerCase().startsWith("a")) {
                mayTinh.infoPrint();
            }
        }
    }
}
