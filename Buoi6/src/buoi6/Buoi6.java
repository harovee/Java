/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buoi6;

import java.util.Scanner;

/**
 *
 * @author haove
 */
public class Buoi6 {

    /**
     * mang la tap hop chua tat ca cac phan tu cung kieu DL Co 2 loai mang:
     * -Mang co dinh ( co dinh size n phan tu. chi dc phep trong pham vi n ptu)
     * -Mang dong: Size la dong, ko can quan tam hay nhap vao size 
     * vD: -3, 9, 6, 7 
     * => Gia tri cua cac ptu trong mang:
     * -Vtri: 0, 1, 2, 3 (vtri luoon luon bd bang 0 va ket thuc n-1) 
     * Mang: 
     * -gia tri 
     * -vi tri 
     * Gia tri cua vi tri dau tien la arr[0], cuoi cung la arr[n-1] 
     * Gia tri o vi tri bat ky: arr[i] BT:
     * Nhap mang so nguyen gom n ptu, in ra mh
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so luong ptu: ");
        int n = Integer.valueOf(scan.nextLine());
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Gia tri ptu thu " + (i + 1) + " la: ");
            arr[i] = Integer.valueOf(scan.nextLine());
        }
        System.out.println("In ptu cua mang: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

}
