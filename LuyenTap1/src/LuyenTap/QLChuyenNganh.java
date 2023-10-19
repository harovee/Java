/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuyenTap;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author haove
 */
public class QLChuyenNganh {
    public void majorAdd(ArrayList<ChuyenNganh>listMajor){
        Scanner scan = new Scanner(System.in);
        while (true) {            
          System.out.println("Nhap ma: ");
        String id = scan.nextLine();
        System.out.println("Nhap ten: ");
        String name = scan.nextLine();
        System.out.println("Nhap chu nhiem: ");
        String head = scan.nextLine();
        System.out.println("Mo ta: ");
        String description = scan.nextLine();
        System.out.println("Nhap nam thanh lap: ");
        int startDate = Integer.valueOf(scan.nextLine());
        System.out.println("Nhap trang thai: ");
        boolean status = Boolean.valueOf(scan.nextLine());
        ChuyenNganh major = new ChuyenNganh(id, name, head, description, startDate, status);
        listMajor.add(major);
            System.out.println("Ban co nhap tiep khong?");
            if (scan.nextLine().equalsIgnoreCase("n")) {
                System.out.println("Nhap thong tin xong");
                break;
            }
        }   
    }
    
    public void majorDisplay(ArrayList<ChuyenNganh>listMajor){
        for (ChuyenNganh chuyenNganh : listMajor) {
            chuyenNganh.infoPrint();
        }
    }
    
    public void getMajorStartWithC(ArrayList<ChuyenNganh>listMajor){
        for (ChuyenNganh chuyenNganh : listMajor) {
            if (chuyenNganh.getName().toLowerCase().startsWith("c")) {
                chuyenNganh.infoPrint();
            }
        }
    }
    
    public void getMajorOfEvenIndex(ArrayList<ChuyenNganh>listMajor){
        for (int i = 0; i < listMajor.size(); i++) {
            if (i%2==0) {
                listMajor.get(i).infoPrint();
            }
        }
    }
    
    public void getMajorStartInYearAmount(ArrayList<ChuyenNganh>listMajor, int yearMin, int yearMax){
        for (ChuyenNganh chuyenNganh : listMajor) {
            if (chuyenNganh.getStartDate()>= yearMin && chuyenNganh.getStartDate()<=yearMax) {
                chuyenNganh.infoPrint();
            }
        }
    }
    
    public void getMajorEndWithE(ArrayList<ChuyenNganh>listMajor){
        for (ChuyenNganh chuyenNganh : listMajor) {
            if (chuyenNganh.getName().toLowerCase().endsWith("e")) {
                chuyenNganh.infoPrint();
            }
        }
    }
    
    public void getMajorContainA(ArrayList<ChuyenNganh>listMajor){
        for (ChuyenNganh chuyenNganh : listMajor) {
            if (chuyenNganh.getName().toLowerCase().contains("a")) {
                chuyenNganh.infoPrint();
            }
        }
    }
    
    public void getMajorByID(ArrayList<ChuyenNganh>listMajor, String idInput){
        for (ChuyenNganh chuyenNganh : listMajor) {
            if (chuyenNganh.getId().equalsIgnoreCase(idInput)) {
                chuyenNganh.infoPrint();
            }
        }
    }
    
    public void removeMajorByID(ArrayList<ChuyenNganh>listMajor, String removeID){
        for (int i = 0; i < listMajor.size(); i++) {
            if (listMajor.get(i).getId().equalsIgnoreCase(removeID)) {
                listMajor.remove(i);
            }
        }
    }
    
    public void getIndexOfMajorStartEarliest(ArrayList<ChuyenNganh>listMajor){
        int yearMin = listMajor.get(0).getStartDate();
        for (int i = 0; i < listMajor.size(); i++) {
            if (yearMin < listMajor.get(i).getStartDate()) {
                yearMin = listMajor.get(i).getStartDate();
                System.out.println(i);
            }
            
        }
    }
    
}
