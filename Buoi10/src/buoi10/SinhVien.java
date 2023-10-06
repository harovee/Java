/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi10;

/**
 *
 * @author haove
 */
public class SinhVien {

    private String studentID;
    private String name;
    private int age;
    private boolean gender;
    private int grade;
    private String address;
    private String facebookPass;

    //cach1: RightMouse - InsertCode - Constructor
//    public SinhVien() {
//    }
//
//    public SinhVien(String studentID, String name, int age, boolean gender, int grade, String address, String facebookPass) {
//        this.studentID = studentID;
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
//        this.grade = grade;
//        this.address = address;
//        this.facebookPass = facebookPass;
//    }
    //Cach2: Ctrl + space 2lan
/**
 * Constructor
 * dau hieu nhan biet: 
 * - ten constructor phai trung voi ten class
 * - Constructor ko co kieu DL tra ve(khong co Return)
 * Dung de khoi tao 1 doi tuong
 * co 2 loai Constructor: 
 * - co tham so
 * - khong tham so
 * Default cua 1 class la loai Constructor ko tham so
 */
    public SinhVien() {
    }

    public SinhVien(String studentID, String name, int age, boolean gender, int grade, String address, String facebookPass) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.grade = grade;
        this.address = address;
        this.facebookPass = facebookPass;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFacebookPass() {
        return facebookPass;
    }

    public void setFacebookPass(String facebookPass) {
        this.facebookPass = facebookPass;
    }
// Voi Ham => public
    // Hien tai:
    // Bien: private
    // Ham: public
    // In tat ca thong tin cua SV ra man hinh
    public void infoPrint(){
        System.out.println("Ma so SV: "+studentID);
        System.out.println("Ten: "+name);
        System.out.println("Tuoi: "+age);
        System.out.println("Gioi tinh: "+gender);
        System.out.println("Ky hoc: "+grade);
        System.out.println("Dia chi: "+address);
        System.out.println("Mat khau FB: "+facebookPass);
    }
    
}
