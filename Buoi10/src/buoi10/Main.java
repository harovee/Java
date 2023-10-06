/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi10;

/**
 *
 * @author haove
 */
public class Main {
    public static void main(String[] args) {
//        //Khoi tao 1 doi tuong  = new (Constructor)
//        SinhVien sv = new SinhVien();
//        //in sinh vien
//        sv.infoPrint();

// Co 2 cach in thong tin: 
//cach1: SD constructor ko tham so
////- b1: Khoi tao doi tuong = constructor ko tham so
//    SinhVien sv = new SinhVien();
//// - b2: Thay doi gia tri thuoc tinh cua doi tuong
//    sv.setName("Hao");
//    sv.setStudentID("ph46895");
//    sv.setAge(25);
//    sv.setGender(true);
//    sv.setGrade(2);
//    sv.setAddress("Ba Dinh");
//    sv.setFacebookPass("abc123");
//    sv.infoPrint();
    SinhVien sv = new SinhVien("Hao", "Hao", 25, true, 2, "Ba Dinh", "Abc");
    sv.infoPrint();
    }
}
