/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buoi4;

import java.util.Scanner;

/**
 *
 * @author haove
 */
public class ReNhanh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so bat ky: ");
        int intNum = Integer.valueOf(scan.nextLine());

        /*   if (intNum % 2 == 0) {
            System.out.println(intNum + " la so chan");
        } else {
            System.out.println(intNum + " la so le");
        }*/
        if (intNum > 5) {
            System.out.println(intNum + " la so lon hon 5");
        } else if (intNum == 5) {
            System.out.println(intNum + " la so bang 5");
        } else {
            System.out.println(intNum + " la so nho hon 5");
        }
    }
    //b1: nhap so, kiem tra chan - le
    //b2: nhap 1 so, ktra >5, =5, <5?
}
