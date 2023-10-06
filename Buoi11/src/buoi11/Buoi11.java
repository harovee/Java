/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buoi11;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author haove
 */
public class Buoi11 {

    /**
     * Mang C: Nhap size roi khai bao mang => Lang phi bo nho =>Mang dong: ko
     * quan tam size cua mang Collections. J1: ArrayList Cu phap:
     *
     */
//    ArrayList<Kieu du lieu>ten bien = new ArrayList<>();
    public static void main(String[] args) {
        ArrayList<String> lists = new ArrayList<>();
        //kiem tra so phan tu
        System.out.println(lists.size());
        //Them phan tu
        lists.add("ph46895");
        lists.add("avc");
        lists.add("abc");
        lists.add("aec");
        System.out.println(lists.size());
        //Xoa phan tu
        lists.remove(0);
        System.out.println(lists.size());
        lists.remove("avc");
        //Lay gia tri cua vi tri bat ky: lists.get(i)
        //In cac ptu trong mang
        //C1: (for i)
        System.out.println("In cac phan tu: ");
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i));
        }
        System.out.println("-----------------");
        //Cach2: (ko truy xuat dc vi tri)
        for (String str : lists) {
            System.out.println(str);
        }
        //cach3: for each + lamda(->)
        System.out.println("-----------------");
        lists.forEach(s -> System.out.println(s));
        System.out.println("-----------------");
        //tao 1 class DongVat gom maDV- String, ten, canNang - double 
        // tao classMain
        //SD arrlist de luu thong tin cua doi tuong dong vat va in
    }
}
