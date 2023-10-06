/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn2;

import java.util.Scanner;

/**
 *
 * @author haove
 */
public class MainOfXeMay {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap thong tin xe may: ");
        System.out.println("Nhap ma: ");
        String motorID = scan.nextLine();
        System.out.println("Nhap ten: ");
        String name = scan.nextLine();
        System.out.println("Nhap dong may: ");
        String kindOfMotor = scan.nextLine();
        System.out.println("Nhap gia: ");
        float cost = Float.valueOf(scan.nextLine());
        System.out.println("Nhap mau sac: ");
        String color = scan.nextLine();
        XeMay motor = new XeMay(motorID, name, kindOfMotor, cost, color);
        motor.infoPrint();
    }
}
