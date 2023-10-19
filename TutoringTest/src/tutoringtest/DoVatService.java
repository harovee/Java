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
public class DoVatService {

    ArrayList<DoVat> list = new ArrayList<>();

    public void objectInput() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Nhap ma: ");
            String objectID = scan.nextLine();
            System.out.println("Nhap ten: ");
            String name = scan.nextLine();
            System.out.println("Nhap loai: ");
            int kind = Integer.valueOf(scan.nextLine());
            System.out.println("Nhap gia: ");
            double cost = Double.valueOf(scan.nextLine());
            DoVat things = new DoVat(objectID, name, kind, cost);
            list.add(things);
            System.out.println("Ban co nhap tiep khong?(y/n)");
            if (scan.nextLine().toLowerCase().equalsIgnoreCase("n")) {
                System.out.println("Nhap thanh cong");
                break;
            }
        }
    }

    public void objectPrint() {
        for (DoVat doVat : list) {
            doVat.infoPrint();
        }
    }

    public void findingObjectByID(String idInput) {
        for (DoVat doVat : list) {
            if (doVat.getObjectID().equalsIgnoreCase(idInput)) {
                doVat.infoPrint();
            }
        }
    }

    public void removingObjectByName(String nameInput) {
        for (DoVat doVat : list) {
            if (doVat.getName().equalsIgnoreCase(nameInput)) {
                list.remove(doVat);
            }
        }
    }

    public void objectIDAscendingSort() {

        list.sort((o1, o2) -> {
            return o1.getObjectID().compareTo(o2.getObjectID());
        });

    }

    public void findingObjectByCostAmout(double costMin, double costMax) {
        for (DoVat doVat : list) {
            if (doVat.getCost() > costMin && doVat.getCost() < costMax) {
                doVat.infoPrint();
            }
        }
    }

    public void costDescendingSort() {
        list.sort((o1, o2) -> {
            return Double.compare(o2.getCost(), o1.getCost());
        });
    }
}
