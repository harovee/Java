/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buoi5;

import java.util.Scanner;

/**
 *
 * @author haove
 */
public class Buoi5_VongLap {

    /**
     * Vong lap dung de lap di lap lai 1 cong viec
     * 1.While
     * while(dieukien){
     *  //code
     * }
     * 2.do...while
     * do{
     *  //code
     * }while(dieukien)
     * 3.for
     * for(gia tri khoi tao ; dieu kien ; buoc nhay){
     *  //code
     * }
     * VD:
     * 1.Nhap so nguyen n. IN cac so t 0 -n;
     * 2.Nhap 1 so nguyen n. Tinh tong cac so nguyen tu 0 - n;
     * 3.Nhap 1 so nguyen n. TInh tich cac so nguyen tu 1 - n;
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so nguyen n: ");
        int intNum = Integer.valueOf(scan.nextLine());
        //for(int i = 0 ; i < intNum +1 ; i++){
        //    System.out.println(""+i);
        //}
        int sum = 0;
        for (int i = 0; i < intNum + 1; i++) {
            sum += i;
        }
        System.out.println("Tong bang: "+sum);
        
        int product = 1;
        for (int i = 1; i < intNum +1; i++) {
            product *= i;
        }
        System.out.println("Tich bang "+product);
    }
    
}
