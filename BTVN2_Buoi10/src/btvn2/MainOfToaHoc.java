/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn2;

import java.util.Scanner;

/**
 *
 * @author haove
 */
public class MainOfToaHoc {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap thong tin toa hoc: ");
        System.out.println("Nhap ma:");
        String buildingID = scan.nextLine();
        System.out.println("Nhap ten: ");
        String name = scan.nextLine();
        System.out.println("Nhap khu vuc: ");
        String area = scan.nextLine();
        ToaHoc building = new ToaHoc(buildingID, name, area);
        building.infoPrint();
    }
}
