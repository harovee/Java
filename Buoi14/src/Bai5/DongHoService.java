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
public class DongHoService {

    ArrayList<DongHo> watch = new ArrayList<>();

    public void dongHoInput() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Nhap ma DH: ");
            int watchID = Integer.valueOf(scan.nextLine());
            System.out.println("Nhap the loai: ");
            String kind = scan.nextLine();
            System.out.println("Nhap mau sac: ");
            String color = scan.nextLine();
            System.out.println("Nhap kich thuoc: ");
            int width = Integer.valueOf(scan.nextLine());
            System.out.println("Nhap chat lieu: ");
            String material = scan.nextLine();
            System.out.println("Nhap gia: ");
            int cost = Integer.valueOf(scan.nextLine());
            DongHo dh = new DongHo(watchID, kind, color, width, material, cost);
            watch.add(dh);
            System.out.println("Ban co nhap tiep khong?(y/n)");
            if (scan.nextLine().equalsIgnoreCase("n")) {
                System.out.println("Nhap thong tin xong");
                break;
            }
        }
    }

    public void dongHoDisplay() {
        for (DongHo dongHo : watch) {
            dongHo.infoPrint();
        }
    }

    public void findingByCostAmount(int costMin, int costMax) {
        for (DongHo dongHo : watch) {
            if (dongHo.getCost() > costMin && dongHo.getCost() < costMax) {
                dongHo.infoPrint();
            }
        }
    }

    public void removingByWatchID(int idInput) {
        for (DongHo dongHo : watch) {
            if (dongHo.getWatchID() == idInput) {
                watch.remove(dongHo);
            }
        }
    }

    public void widthAscendingSort() {
        watch.sort((o1, o2) -> {
            return o1.getWidth() - o2.getWidth();
        });
    }

    public void widthDescendingSort() {
        watch.sort((o1, o2) -> {
            return o2.getWidth() - o1.getWidth();
        });
    }
}
