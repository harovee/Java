/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package btvn_buoi8;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author haove
 */
public class BTVN_Buoi8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        do {
            System.out.println("------------MENU-----------");
            System.out.println("1. Kiem tra so nguyen duong");
            System.out.println("2. Kiem tra so chan - le");
            System.out.println("3. Tinh toan 2 so");
            System.out.println("4. Kiem tra nam sinh");
            System.out.println("5. Kiem tra so ngay trong thang");
            System.out.println("6. Kiem tra so tuoi phu hop nhan qua Trung thu");
            System.out.println("7. So lon nhat");
            System.out.println("8. Doanh thu va hoa hong");
            System.out.println("9. Giai PT bac 2");
            System.out.println("10. Nhap va in thong tin ca nhan");
            System.out.println("11. Tinh tong tu 0 toi n");
            System.out.println("12. Tinh tich cac so le");
            System.out.println("13. In thong tin mang");
            System.out.println("14. Tich cac phan tu vi tri le");
            System.out.println("15. Liet ke vi tri le dau tien");
            System.out.println("16. Liet ke vi tri le cuoi cung");
            System.out.println("17. Thoat");
            System.out.println("----------------------------");
            System.out.println("Moi chon chuc nang: ");
            select = Integer.valueOf(scan.nextLine());
            switch (select) {
                case 1: {
                    System.out.println("KIEM TRA SO NGUYEN DUONG");
                    System.out.println("Nhap so bat ky: ");
                    float number = Float.valueOf(scan.nextLine());
                    if (number > 0 && number == (int) number) {
                        System.out.println("So do la so nguyen duong");
                    } else {
                        System.out.println("Day khong phai so nguyen duong");
                    }
                    break;
                }
                case 2: {
                    System.out.println("KIEM TRA SO CHAN - LE");
                    System.out.println("Nhap so nguyen: ");
                    int number = Integer.valueOf(scan.nextLine());
                    if (number % 2 == 0) {
                        System.out.println("Day la so chan");
                    } else {
                        System.out.println("Day la so le");
                    }
                    break;
                }
                case 3: {
                    System.out.println("TINH TOAN 2 SO");
                    System.out.println("Nhap so thu nhat: ");
                    int number1 = Integer.valueOf(scan.nextLine());
                    System.out.println("Nhap so thu 2: ");
                    int number2 = Integer.valueOf(scan.nextLine());
                    int sum = number1 + number2;
                    System.out.println("Tong 2 so: " + sum);
                    int product = number1 * number2;
                    System.out.println("Tich 2 so: " + product);
                    float quotient = (float) number1 / number2;
                    System.out.println("Thuong 2 so: " + quotient);
                    break;
                }
                case 4: {
                    System.out.println("KIEM TRA NAM SINH");
                    System.out.println("Nhap tuoi: ");
                    int age = Integer.valueOf(scan.nextLine());
                    int yearOfBirth = 2023 - age;
                    System.out.println("Nam sinh: " + yearOfBirth);
                    break;
                }
                case 5: {
                    System.out.println("KIEM TRA SO NGAY TRONG THANG");
                    System.out.println("Nhap thang: ");
                    int month = Integer.valueOf(scan.nextLine());
                    if (month == 1 || month == 3 || month == 5 || month == 7
                            || month == 8 || month == 10 || month == 12) {
                        System.out.println("Day la thang co 31 ngay");
                    } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                        System.out.println("Day la thang co 30 ngay");
                    } else {
                        System.out.println("Thang khong hop le");
                    }
                    break;
                }
                case 6: {
                    System.out.println("KIEM TRA SO TUOI PHU HOP NHAN QUA TRUNG THU");
                    System.out.println("Nhap tuoi");
                    int age = Integer.valueOf(scan.nextLine());
                    if (age < 16) {
                        System.out.println("Do tuoi phu hop");
                    } else {
                        System.out.println("Do tuoi khong phu hop");
                    }
                    break;
                }
                case 7: {
                    System.out.println("SO LON NHAT");
                    int arr[] = new int[4];
                    System.out.println("Nhap 4 so nguyen duong: ");
                    for (int i = 0; i < 4; i++) {
                        arr[i] = Integer.valueOf(scan.nextLine());
                    }
                    int max = arr[0];
                    for (int i = 0; i < 4; i++) {
                        if (max < arr[i]) {
                            max = arr[i];
                        }
                    }
                    System.out.println("Gia tri lon nhat trong 4 so: ");
                    for (int i = 0; i < 4; i++) {
                        if (max == arr[i]) {
                            System.out.println(max);
                        }
                    }
                    break;
                }
                case 8: {
                    System.out.println("DOANH THU VA HOA HONG");
                    System.out.println("Nhap doanh thu: ");
                    int turnOver = Integer.valueOf(scan.nextLine());
                    float percentage;
                    if (turnOver <= 100) {
                        percentage = (float) (turnOver * 0.05);
                        System.out.println("Tien hoa hong nhan dc: " + percentage);
                    } else {
                        if (turnOver <= 300) {
                            percentage = (float) (turnOver * 0.1);
                            System.out.println("Tien hoa hong nhan duoc: " + percentage);
                        } else {
                            percentage = (float) (turnOver * 0.2);
                            System.out.println("Tien hoa hong nhan dc: " + percentage);
                        }
                    }
                    break;
                }
                case 9: {
                    System.out.println("GIAI PT BAC 2");
                    System.out.println("Nhap so a: ");
                    int aNumber = Integer.valueOf(scan.nextLine());
                    System.out.println("Nhap so b: ");
                    int bNumber = Integer.valueOf(scan.nextLine());
                    System.out.println("Nhap so c: ");
                    int cNumber = Integer.valueOf(scan.nextLine());
                    if (aNumber == 0) {
                        if (bNumber == 0) {
                            if (cNumber == 0) {
                                System.out.println("Phuong trinh co vo so nghiem");
                            } else {
                                System.out.println("Phuong trinh vo nghiem");
                            }
                        } else {
                            System.out.println("Phuong trinh co nghiem kep la " + (-cNumber) / bNumber);
                        }
                    } else {
                        float delta = (bNumber) ^ 2 - 4 * aNumber * cNumber;
                        if (delta == 0) {
                            System.out.println("Phuong trinh co nghiem kep la "
                                    + (-bNumber) / (2 * aNumber));
                        } else if (delta < 0) {
                            System.out.println("Phuong trinh vo nghiem");
                        } else {
                            float x1 = (float) ((-bNumber) + Math.sqrt(delta) / (2 * aNumber));
                            float x2 = (float) ((-bNumber) - Math.sqrt(delta) / (2 * aNumber));
                            System.out.println("Phuong trinh co 2 nghiem: " + x1 + " va " + x2);
                        }
                    }
                    break;
                }
                case 10: {
                    System.out.println("THONG TIN CA NHAN");
                    System.out.println("Nhap ten: ");
                    String name = scan.nextLine();
                    System.out.println("Nhap tuoi: ");
                    int age = Integer.valueOf(scan.nextLine());
                    System.out.println("Nhap dia chi: ");
                    String address = scan.nextLine();
                    System.out.println("Nhap ky hoc: ");
                    int grade = Integer.valueOf(scan.nextLine());
                    System.out.println("-------------------------");
                    System.out.println("Ten: " + name);
                    System.out.println("Tuoi: " + age);
                    System.out.println("Dia chi: " + address);
                    System.out.println("Ky hoc: " + grade);
                    break;
                }
                case 11: {
                    System.out.println("TINH TONG 0 - N");
                    System.out.println("Nhap so n: ");
                    int number = Integer.valueOf(scan.nextLine());
                    int sum = 0;
                    for (int i = 0; i < number; i++) {
                        sum += i;
                    }
                    System.out.println("Tong cac so tu 0 den n: " + sum);
                    break;
                }
                case 12: {
                    System.out.println("TICH CAC SO LE");
                    System.out.println("Nhap so n: ");
                    int number = Integer.valueOf(scan.nextLine());
                    int product = 1;
                    for (int i = 0; i < number; i++) {
                        if (i % 2 != 0) {
                            product *= i;
                        }
                    }
                    System.out.println("Tich cac so le: " + product);
                    break;
                }
                case 13: {
                    System.out.println("IN THONG TIN MANG");
                    System.out.println("Nhap so phan tu mang: ");
                    int amount = Integer.valueOf(scan.nextLine());
                    int arr[] = new int[amount];
                    System.out.println("Nhap gia tri cac phan tu: ");
                    for (int i = 0; i < amount; i++) {
                        arr[i] = Integer.valueOf(scan.nextLine());
                    }
                    System.out.println("-----------------------");
                    for (int i = 0; i < amount; i++) {
                        System.out.println(arr[i]);
                    }
                    System.out.println("Tong vi tri cac phan tu chia het 5: ");
                    int sum = 0;
                    for (int i = 0; i < amount; i++) {
                        if (arr[i] % 5 == 0) {
                            sum += i;
                        }
                    }
                    System.out.println(sum);
                    break;
                }
                case 14: {
                    System.out.println("TICH CAC SO CHAN O VI TRI LE");
                    System.out.println("Nhap so phan tu mang: ");
                    int amount = Integer.valueOf(scan.nextLine());
                    int arr[] = new int[amount];
                    System.out.println("Nhap gia tri cac phan tu: ");
                    for (int i = 0; i < amount; i++) {
                        arr[i] = Integer.valueOf(scan.nextLine());
                    }
                    System.out.println("-----------------------");
                    System.out.println("Tich cac so chan o vi tri le: ");
                    int product = 1;
                    for (int i = 0; i < amount; i++) {
                        if (arr[i] % 2 == 0 && i % 2 != 0) {
                            product *= arr[i];
                        }
                    }
                    System.out.println(product);
                    break;
                }
                case 15: {
                    System.out.println("LIET KE VI TRI SO LE DAU TIEN");
                    System.out.println("Nhap so phan tu mang: ");
                    int amount = Integer.valueOf(scan.nextLine());
                    int arr[] = new int[amount];
                    System.out.println("Nhap gia tri cac phan tu: ");
                    for (int i = 0; i < amount; i++) {
                        arr[i] = Integer.valueOf(scan.nextLine());
                    }
                    System.out.println("-----------------------");
                    System.out.println("Vi tri so le dau tien: ");
                    for (int i = 0; i < amount; i++) {
                        if (arr[i] % 2 != 0) {
                            System.out.println(i);
                            break;
                        }
                    }
                    break;
                }
                case 16: {
                    System.out.println("LIET KE VI TRI SO LE CUOI CUNG");
                    System.out.println("Nhap so phan tu mang: ");
                    int amount = Integer.valueOf(scan.nextLine());
                    int arr[] = new int[amount];
                    System.out.println("Nhap gia tri cac phan tu: ");
                    for (int i = 0; i < amount; i++) {
                        arr[i] = Integer.valueOf(scan.nextLine());
                    }
                    System.out.println("-----------------------");
                    System.out.println("Vi tri so le cuoi cung: ");
                    for (int i = amount - 1; i > 1; i--) {
                        if (arr[i] % 2 != 0) {
                            System.out.println(i);
                            break;
                        }
                    }
                    break;
                }
                case 17: {
                    System.out.println("THOAT");
                    break;
                }
                default: {
                    System.out.println("KHONG CO CHUC NANG NAY");
                }
            }
        } while (select != 17);
    }
}
