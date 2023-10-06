/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT11_1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author haove
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Nguoi> person = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        String name = scan.nextLine();
        System.out.println("Nhap tuoi: ");
        int age = Integer.valueOf(scan.nextLine());
        System.out.println("Nhap dia chi: ");
        String address = scan.nextLine();
        Nguoi body = new Nguoi(name, age, address);
        person.add(body);
        for (Nguoi nguoi : person) {
            nguoi.infoPrint();
        }
//        person.forEach(s -> s.infoPrint());
//        person.forEach(Nguoi::infoPrint);
    }
}
