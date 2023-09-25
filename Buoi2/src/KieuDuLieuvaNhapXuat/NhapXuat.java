/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KieuDuLieuvaNhapXuat;

import java.util.Scanner;

/**
 *
 * @author haove
 */
public class NhapXuat {

    /**
     * Trong C : dùng scanf 
     * Trong Java: Scanner
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //cú pháp khai báo Scanner
        //Nhập tên từ bàn phím
        //Co 2 cach nhap String
        //-cach1: next
        // -cach2: nextLine
    //    System.out.println("Mời bạn nhập tên1: ");
     //   String name1 = scan.next();

      // System.out.println("Mời bạn nhập tên 2: ");
     //  String name2 = scan.nextLine();

        //In ra man hinh
        //System.out.println("ten 1: " + name1 + "ten 2: " + name2);
      //  System.out.println("Tên 1: " + name1);
      //  System.out.println("Tên 2: " + name2);
      
      //NHẬP CÁC KIỂU DL KHÁC: 
        System.out.println("Moi nhap: ");
        int number = scan.nextInt();
        float number1 = scan.nextFloat();
        // double -> nextDouble
        //...
        //b1: nhap ten, dia chi, nganh hoc cua ban than va in ra man hinh
        //b2: Nhap tuoi, can nang, chieu cao cua ban than va in
        //b3: Nhap ten, tuoi, dia chi, ky hoc, nganh hoc cua nyc va in ra
    }
}
