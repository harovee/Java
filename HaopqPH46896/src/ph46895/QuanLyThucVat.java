/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ph46895;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author haove
 */
public class QuanLyThucVat {

    public void thucVatInput(ArrayList<ThucVat> listTV) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Nhap ma thuc vat: ");
            String id = scan.nextLine();
            System.out.println("Nhap ten: ");
            String name = scan.nextLine();
            System.out.println("Nhap chieu cao: ");
            int height = Integer.valueOf(scan.nextLine());
            ThucVat tv = new ThucVat(id, name, height);
            listTV.add(tv);
            System.out.println("Ban co nhap tiep khong?(y/n)");
            if (scan.nextLine().equalsIgnoreCase("n")) {
                System.out.println("Nhap thong tin xong");
                break;
            }
        }
    }

    public void thucVatPrint(ArrayList<ThucVat> listTV) {
        for (ThucVat thucVat : listTV) {
            thucVat.infoPrint();
        }
    }

    public void getThucVatNameEndsWithSA(ArrayList<ThucVat> listTV) {
        for (ThucVat thucVat : listTV) {
            if (thucVat.getName().toLowerCase().contains("sa")) {
                thucVat.infoPrint();
            }
        }
    }

    public void nameAscendingSort(ArrayList<ThucVat> listTV) {
        listTV.sort((o1, o2) -> {
            return o1.getName().compareTo(o2.getName());
        });
    }

    public void removeTVByID(ArrayList<ThucVat> listTV, String idInput) {
        for (int i = 0; i < listTV.size(); i++) {
            if (listTV.get(i).getId().toLowerCase().contains(idInput)) {
                listTV.remove(i);
                break;
            }
        }
    }

    public void list3MaxHeight(ArrayList<ThucVat> listTV) {
        listTV.sort((o1, o2) -> {
            return o1.getHeight() - o2.getHeight();
        });
        int count = 0;
        for (ThucVat thucVat : listTV) {
            thucVat.infoPrint();
            count++;
            if (count == 3) {
                break;
            }
        }
    }

    public void nameAscendingAndHeightDescendingSort(ArrayList<ThucVat> listTV) {
        listTV.sort((o1, o2) -> {
            return o1.getName().compareTo(o2.getName());
        });
        listTV.sort((o1, o2) -> {
            return o2.getHeight() - o1.getHeight();
        });
    }

    public ArrayList<ThucVat> getList(ArrayList<ThucVat> listTV) {
        return listTV;
    }

    public ArrayList<ThucVat> removeList(ArrayList<ThucVat> listTV) {
        ArrayList<ThucVat> resultList = new ArrayList<>();
        for (ThucVat thucVat : listTV) {
            if (thucVat.getName().toLowerCase().endsWith("sa")) {
                resultList.add(thucVat);
            }
        }
        return resultList;
    }
}
