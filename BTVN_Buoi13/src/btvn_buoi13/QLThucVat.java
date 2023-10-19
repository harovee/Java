/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn_buoi13;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author haove
 */
public class QLThucVat {

    public void plantsInput(ArrayList<ThucVat> list) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Nhap ma: ");
            String plantsID = scan.nextLine();
            System.out.println("Nhap ten: ");
            String name = scan.nextLine();
            System.out.println("Nhap loai cay: ");
            String kind = scan.nextLine();
            System.out.println("Nhap khu vuc song: ");
            String area = scan.nextLine();
            System.out.println("Nhap chieu cao: ");
            int height = Integer.valueOf(scan.nextLine());
            ThucVat tv = new ThucVat(plantsID, name, kind, area, height);
            list.add(tv);
            System.out.println("Ban co muon nhap tiep khong (Yes/No)?");
            if (scan.nextLine().equalsIgnoreCase("N")) {
                System.out.println("Nhap thong tin xong");
                break;
            }
        }
    }

    public void plantsDisplay(ArrayList<ThucVat> list) {
        for (ThucVat thucVat : list) {
            thucVat.infoPrint();
        }
    }

    public void plantsFinding(ArrayList<ThucVat> list) {
        for (ThucVat thucVat : list) {
            if (thucVat.getName().toLowerCase().startsWith("c")) {
                thucVat.infoPrint();
            }
        }
    }

    public void evenIndexPlants(ArrayList<ThucVat> list) {
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                list.get(i).infoPrint();
            }
        }
    }

    public void plantsAscendingSort(ArrayList<ThucVat> list) {
        list.sort((o1, o2) -> {
            return o1.getName().compareTo(o2.getName());
        });
    }

    public void plantsHeightDescendingSort(ArrayList<ThucVat> list) {
        list.sort((o1, o2) -> {
            return o2.getHeight() - o1.getHeight();
        });
    }

    public void plantsHeightFinding(ArrayList<ThucVat> list, int min, int max) {
        for (ThucVat thucVat : list) {
            if (thucVat.getHeight() > min && thucVat.getHeight() < max) {
                thucVat.infoPrint();
            }
        }
    }

    public void plantsEndstWithE(ArrayList<ThucVat> list) {
        for (ThucVat thucVat : list) {
            if (thucVat.getName().toLowerCase().endsWith("e")) {
                thucVat.infoPrint();
            }
        }
    }

    public void plantsContainA(ArrayList<ThucVat> list) {
        for (ThucVat thucVat : list) {
            if (thucVat.getName().toLowerCase().contains("a")) {
                thucVat.infoPrint();
            }
        }
    }
}
