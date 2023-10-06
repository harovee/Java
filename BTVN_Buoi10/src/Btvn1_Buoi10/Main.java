/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Btvn1_Buoi10;

/**
 *
 * @author haove
 */
public class Main {

    public static void main(String[] args) {
        Nguoi person = new Nguoi("Hao", 25, "Ba Dinh");
        person.infoPrint();
        System.out.println("-------------------------------------");
        DongVat animal = new DongVat("abc123", "Corgi", 5, 13.50);
        animal.infoPrint();
        System.out.println("-------------------------------------");
        ThucVat plants = new ThucVat("abc1", "hoa sua", 15, 30, "Ha Noi");
        plants.infoPrint();
        System.out.println("-------------------------------------");
        LopHoc classRoom = new LopHoc("SD19202", "Toa P", "Kieu Mai", 200);
        classRoom.infoPrint();
        System.out.println("-------------------------------------");
        MayTinh comp = new MayTinh("abc2", "MSI", "MSI", 20);
        comp.infoPrint();
        System.out.println("-------------------------------------");
        DienThoai phone = new DienThoai("abc3", "Iphone", "Apple", 19, 128, "green");
        phone.infoPrint();
        System.out.println("-------------------------------------");
        GiangVien teacher = new GiangVien("PH123", "Nguyen Van A", "Ha Noi", 50, 160, 10);
        teacher.infoPrint();
        System.out.println("-------------------------------------");
        CayCoi tree = new CayCoi("abc5", "Rau muong", "Ha Noi", 10);
        tree.infoPrint();
        System.out.println("-------------------------------------");
        XeMay motor = new XeMay("abc6", "SH", "Honda", 70, "Black");
        motor.infoPrint();
        System.out.println("-------------------------------------");
        ToaHoc building = new ToaHoc("abc7", "FPT", "Trinh Van Bo");
        building.infoPrint();

    }
}
