/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn_buoi12;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author haove
 */
public class QuanLyNguoiService {
    
    public void NguoiInput(ArrayList<Nguoi> personList) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        String name = scan.nextLine();
        System.out.println("Nhap tuoi: ");
        int age = Integer.valueOf(scan.nextLine());
        System.out.println("Nhap gioi tinh: ");
        int gender = Integer.valueOf(scan.nextLine());
        System.out.println("Nhap que quan: ");
        String village = scan.nextLine();
        System.out.println("Nhap nghe nghiep: ");
        String career = scan.nextLine();
        Nguoi body = new Nguoi(name, age, gender, village, career);
        personList.add(body);
    }
    
    public void NguoiPrint(ArrayList<Nguoi> personList) {
        for (Nguoi nguoi : personList) {
            nguoi.infoPrint();
        }
    }
    
    public void listFemaleGender(ArrayList<Nguoi> personList) {
        for (Nguoi nguoi : personList) {
            if (nguoi.getGender() == 0) {
                nguoi.infoPrint();
            }
        }
    }
    
    public void listAgeFromMinToMax(ArrayList<Nguoi> personList, int ageMin, int ageMax) {
        for (Nguoi nguoi : personList) {
            if (ageMin <= nguoi.getAge() && nguoi.getAge() <= ageMax) {
                nguoi.infoPrint();
            }
        }
    }
    
    public void ageAscendingSort(ArrayList<Nguoi> personList) {
        personList.sort((o1, o2) -> {
            return o1.getAge() - o2.getAge();
        });
    }
    
    public void removeNguoiByIndex(ArrayList<Nguoi> personList, int indexInput) {
        personList.remove(indexInput);
    }
    
    public void nameDescendingSort(ArrayList<Nguoi> personList) {
        personList.sort((o2, o1) -> {
            return o2.getName().compareTo(o1.getName());
        });
    }
}
