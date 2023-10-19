/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author haove
 */
public class QuanLyXeMayService {

    public void xeMayInput(ArrayList<XeMay> list) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Nhap ten: ");
            String name = scan.nextLine();
            System.out.println("Nhap ma xe: ");
            String motorID = scan.nextLine();
            System.out.println("Nhap hang xe: ");
            String brand = scan.nextLine();
            System.out.println("Nhap gia tien: ");
            double cost = Double.valueOf(scan.nextLine());
            XeMay motor = new XeMay(name, motorID, brand, cost);
            list.add(motor);
            System.out.println("Ban co nhap tiep khong?(y/n)");
            if (scan.nextLine().equalsIgnoreCase("n")) {
                System.out.println("Nhap thong tin xong");
                break;
            }
        }
    }

    public void xeMayDisplay(ArrayList<XeMay> list) {
        for (XeMay xeMay : list) {
            xeMay.infoPrint();
        }
    }

    public void findingByCostAmount(ArrayList<XeMay> list, double costMin, double costMax) {
        for (XeMay xeMay : list) {
            if (xeMay.getCost() > costMin && xeMay.getCost() < costMax) {
                xeMay.infoPrint();
            }
        }
    }

    public void costDescendingSort(ArrayList<XeMay> list) {
        list.sort((o1, o2) -> {
            return Double.compare(o2.getCost(), o1.getCost());
        });
    }

    public void removingByID(ArrayList<XeMay> list, String idInput) {
        for (XeMay xeMay : list) {
            if (xeMay.getMotorID().equalsIgnoreCase(idInput)) {
                list.remove(xeMay);
                break;
            }
        }
    }

    public void nameAscendingSort(ArrayList<XeMay> list) {
        list.sort((o1, o2) -> {
            return o1.getName().compareTo(o2.getName());
        });
    }

    public void findingObjectContainA(ArrayList<XeMay> list) {
        for (XeMay xeMay : list) {
            if (xeMay.getName().toLowerCase().contains("a")) {
                xeMay.infoPrint();
            }
        }
    }

    public void findingObjectStartsWithAContainStringInput(ArrayList<XeMay> list, String stringInput) {
        for (XeMay xeMay : list) {
            if (xeMay.getBrand().toLowerCase().startsWith("a")
                    && xeMay.getName().toLowerCase().contains(stringInput)) {
                xeMay.infoPrint();
            }
        }
    }

    public void list3PolyBrandMaxValuesOfCost(ArrayList<XeMay> list) {
        int count = 0;
        list.sort((o1, o2) -> {
            return Double.compare(o2.getCost(), o1.getCost());
        });
        for (XeMay xeMay : list) {
            if (xeMay.getBrand().equalsIgnoreCase("poly")) {
                xeMay.infoPrint();
                count++;
                if (count == 3) {
                    break;
                }
            }
        }
    }
}
