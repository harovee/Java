/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

/**
 *
 * @author haove
 */
public class Main {

    /**
     * Cac ham hay dung String
     */
    public static void main(String[] args) {
        String str = "    Haopq46895    ";
        //Do dai cua chuoi
        System.out.println(str.length());
        //1. So sanh 2 chuoi: compareTo -> tra ve so int
        System.out.println(str.compareTo("Hieubm197"));
        // neu <0: chuoi1 < chuoi2
        //neu =0: chuoi1 = chuoi2
        // neu >0: chuoi1 > chuoi2
        // dua vao bang ma ascii
        //2. compareToIgnoreCase: ko phan biet chu hoa chu thuong
        System.out.println(str.compareToIgnoreCase("Haopq46895"));
        //3. equals -> Tra ve True - False
        System.out.println(str.equals("haopq46895"));
        //4. equalsIgnoreCase ko pb chu Hoa - chu thuong
        System.out.println(str.equalsIgnoreCase("haopq46895"));
        //5. Viet HOA
        System.out.println(str.toUpperCase());
        //6. Viet thuong
        System.out.println(str.toLowerCase());
        //7. Xoa khoang cach dau va cuoi
        System.out.println(str.trim());
        //8. Xoa khoang cach o giua
        // -> regex trong Java -> matches
        //str.matches("Truyen doan regex vao day")
        
        //9.Kiem tra su xuat hien cua chuoi khac trong chuoi ban dau
        System.out.println(str.contains("H"));
        //kiem tra ko phan phiet chu Hoa- chu thuong
        System.out.println(str.toLowerCase().contains("h".toLowerCase()));
        //Kiem tra chuoi bat dau bang 1 ky tu - chuoi nao do: 
        System.out.println(str.startsWith("H"));
        //Kiem tra chuoi ket thuc bang:
        System.out.println(str.endsWith("5"));
    }
}
