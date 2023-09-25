/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi4;

import java.util.Scanner;

/**
 *
 * @author haove
 */
public class switchCase {

    /**
     * int, String -> Truyen` ten bien kieu so nguyen hoac ky tu switch(ten
     * bien){ case gia tri:{ //code break; }So luong case khong gioi han
     * default:{ //Cac truowng hop con lai break; } 
     * B1:Nhap 1 thang kieu so
     * nguyen. Kiem tra do la thang nao trong nam 
     * B2: Tao 1 menu gom cac chuc
     * nang sau 
     * 1.tinh tong 2 so nguyen nhap tu ban phim 2. Nhap tu ban phim
     * thong tin ca nhan ten, tuoi, dia chi va in 3.Thoat
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap thang: ");
        int month = Integer.valueOf(scan.nextLine());
        switch (month) {
            case 1: {
                System.out.println("Thang thu nhat");
                break;
            }
            case 2: {
                System.out.println("Thang thu 2");
                break;
            }
            case 3: {
                System.out.println("Thang thu 3");
                break;
            }
            case 4: {
                System.out.println("Thang thu 4");
                break;
            }
            case 5: {
                System.out.println("Thang thu 5");
                break;
            }
            case 6: {
                System.out.println("Thang thu 6");
                break;
            }
            case 7: {
                System.out.println("Thang thu 7");
                break;
            }
            case 8: {
                System.out.println("Thang thu 8");
                break;
            }
            case 9: {
                System.out.println("Thang thu 9");
                break;
            }
            case 10: {
                System.out.println("Thang thu 10");
                break;
            }
            case 11: {
                System.out.println("Thang thu 11");
                break;
            }
            case 12: {
                System.out.println("Thang thu 12");
                break;
            }
            default: {
                System.out.println("Khong phai thang trong nam");
                break;
            }

        }
    }
}
