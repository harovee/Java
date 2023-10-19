/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi15;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author haove
 */
public class MayBayService {

    public void mayBayInput(ArrayList<MayBay> list) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Nhap ma may bay: ");
            String planeID = scan.nextLine();
            System.out.println("Nhap hang may bay: ");
            String brand = scan.nextLine();
            System.out.println("Nhap so ghe: ");
            int seatNumber = Integer.valueOf(scan.nextLine());
            MayBay plane = new MayBay(planeID, brand, seatNumber);
            list.add(plane);
            System.out.println("Ban co nhap tiep khong?(y/n)");
            if (scan.nextLine().equalsIgnoreCase("n")) {
                System.out.println("Nhap thong tin xong");
                break;
            }
        }
    }

    public void mayBayDisplay(ArrayList<MayBay> list) {
        for (MayBay mayBay : list) {
            mayBay.infoPrint();
        }
    }

    public void findingBySeatNumberAmount(ArrayList<MayBay> list, int seatMin, int seatMax) {
        for (MayBay mayBay : list) {
            if (mayBay.getSeatNumber() >= seatMin && mayBay.getSeatNumber() <= seatMax) {
                mayBay.infoPrint();
            }
        }
    }

    public void seatDescendingSort(ArrayList<MayBay> list) {
        list.sort((o1, o2) -> {
            return o2.getSeatNumber() - o1.getSeatNumber();
        });
    }

    public void removingByID(ArrayList<MayBay> list, String idInput) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPlaneID().equalsIgnoreCase(idInput)) {
                list.remove(i);
                break;
            }
        }
    }

    public void planeIDAscendingSort(ArrayList<MayBay> list) {
        list.sort((o1, o2) -> {
            return o1.getPlaneID().compareTo(o2.getPlaneID());
        });
    }

    public void findingPlaneBrandContainE(ArrayList<MayBay> list) {
        for (MayBay mayBay : list) {
            if (mayBay.getBrand().toLowerCase().contains("e")) {
                mayBay.infoPrint();
            }
        }
    }

    public void findingPlaneBrandStartsWithB(ArrayList<MayBay> list) {
        for (MayBay mayBay : list) {
            if (mayBay.getBrand().toLowerCase().startsWith("b")) {
                mayBay.infoPrint();
            }
        }
      
    }

    public void list3BoeingHavingSeatMax(ArrayList<MayBay> list) {
        list.sort((o1, o2) -> {
            return o2.getSeatNumber() - o1.getSeatNumber();
        });
        int count = 0;
        for (MayBay mayBay : list) {
            if (mayBay.getBrand().equalsIgnoreCase("Boeing")) {
                mayBay.infoPrint();
                count++;
                if (count == 3) {
                    break;
                }
            }
        }
    }
    
    public ArrayList<MayBay> getPlanesStartWith(ArrayList<MayBay> list){
        ArrayList<MayBay> resultList = new ArrayList<>();
        for (MayBay mayBay : list) {
            if (mayBay.getBrand() != null && mayBay.getBrand().toLowerCase().startsWith("b")) {
                resultList.add(mayBay);    
            }
        }
        return resultList;
    }
}
