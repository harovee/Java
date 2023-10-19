/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luyentap2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author haove
 */
public class QLXeMay {

    public void motorInput(ArrayList<XeMay> listMotor) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Nhap ma xe may: ");
            int motorID = Integer.valueOf(scan.nextLine());
            System.out.println("Nhap hang xe: ");
            String brand = scan.nextLine();
            System.out.println("Nhap gia tien: ");
            double cost = Double.valueOf(scan.nextLine());
            XeMay xm = new XeMay(motorID, brand, cost);
            listMotor.add(xm);
            System.out.println("Ban co nhap tiep khong>(y/n)");
            if (scan.nextLine().equalsIgnoreCase("n")) {
                System.out.println("Nhap thong tin xong");
                break;
            }
        }
    }
    
    public void motorDisplay(ArrayList<XeMay>listMotor){
        for (XeMay xeMay : listMotor) {
            xeMay.infoPrint();
        }
    }
    
    public void getMotorByIDAmount(ArrayList<XeMay>listMotor, int idMin, int idMax){
        for (XeMay xeMay : listMotor) {
            if (xeMay.getMotorID()>=idMin && xeMay.getMotorID()<=idMax) {
                xeMay.infoPrint();
            }
        }
    }
    
    public void getMotorByCostAmount(ArrayList<XeMay>listMotor, double costMin, double costMax){
        for (XeMay xeMay : listMotor) {
            if (xeMay.getCost()>=costMin && xeMay.getCost()<=costMax) {
                xeMay.infoPrint();
            }
        }
    }
    
    public void costDescendingSort(ArrayList<XeMay>listMotor){
        listMotor.sort((o1, o2) -> {
            return Double.compare(o2.getCost(), o1.getCost());
        });
    }
   
    public void removeOgject(ArrayList<XeMay>listMotor, int index){
        for (int i = 0; i < listMotor.size(); i++) {
            if (i == index) {
                listMotor.remove(i);
            }
        }
    }
}
