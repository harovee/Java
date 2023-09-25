/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package btvn6;

import java.util.Scanner;

/**
 *
 * @author haove
 */
public class BTVN6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        do {
            System.out.println("---------MENU-----------");
            System.out.println("1. Tinh toan 2 so nguyen");
            System.out.println("2. Thong tin ca nhan");
            System.out.println("3. Tinh tong cac so nguyen duong");
            System.out.println("4. Tinh tich cac so le");
            System.out.println("5. Mang so nguyen");
            System.out.println("6. Tinh tich cac so chan o vi tri le");
            System.out.println("7. Liet ke vi tri so le dau tien trong mang");
            System.out.println("8. Vi tri cua so lon nhat");
            System.out.println("9. Liet ke vi tri so le cuoi cung trong mang");
            System.out.println("10. Tinh tong cac vi tri co gia tri nho nhat");
            System.out.println("0. Thoat");
            System.out.println("--------------------------");
            System.out.println("Moi ban chon chuc nang: ");
            select = Integer.valueOf(scan.nextLine());

            switch (select) {
                case 1: {
                    System.out.println("Tinh toan 2 so nguyen");
                    System.out.println("Nhap so thu nhat: ");
                    int number1 = Integer.valueOf(scan.nextLine());
                    System.out.println("Nhap so thu hai: ");
                    int number2 = Integer.valueOf(scan.nextLine());
                    int sum = number1 + number2;
                    System.out.println("Tong 2 so la: " + sum);
                    int product = number1 * number2;
                    System.out.println("Tich 2 so la: " + product);
                    double quotient = (double) number1 / number2;
                    System.out.println("Thuong cua 2 so la: " + quotient);
                    break;
                }
                case 2: {
                    System.out.println("Thong tin ca nhan");
                    System.out.println("Nhap ten: ");
                    String name = scan.nextLine();
                    System.out.println("Nhap tuoi: ");
                    int age = Integer.valueOf(scan.nextLine());
                    System.out.println("Nhap dia chi: ");
                    String address = scan.nextLine();
                    System.out.println("Nhap ky hoc: ");
                    int grade = Integer.valueOf(scan.nextLine());
                    System.out.println("--------In thong tin-----------");
                    System.out.println("Ten: " + name);
                    System.out.println("Tuoi: " + age);
                    System.out.println("Dia chi: " + address);
                    System.out.println("Ky hoc: " + grade);
                    break;
                }
                case 3: {
                    System.out.println("Tinh tong cac so nguyen duong");
                    System.out.println("Nhap so nguyen duong bat ky: ");
                    int number = Integer.valueOf(scan.nextLine());
                    int sum = 0;
                    for (int i = 0; i < number + 1; i++) {
                        sum += i;
                    }
                    System.out.println("Tong cac so nguyen duong la: " + sum);
                    break;
                }
                case 4: {
                    System.out.println("Tinh tich cac so le");
                    System.out.println("Nhap so nguyen duong bat ky: ");
                    int number = Integer.valueOf(scan.nextLine());
                    int product = 1;
                    for (int i = 0; i < number + 1; i++) {
                        if (i % 2 != 0) {
                            product *= i;
                        }
                    }
                    System.out.println("Tich cac so le la: " + product);
                    break;
                }
                case 5: {
                    System.out.println("Mang so nguyen");
                    System.out.println("Nhap so phan tu cua mang: ");
                    int amount = Integer.valueOf(scan.nextLine());
                    int arr[] = new int[amount];
                    System.out.println("Nhap gia tri cac phan tu: ");
                    for (int i = 0; i < amount; i++) {
                        arr[i] = Integer.valueOf(scan.nextLine());
                    }
                    System.out.println("----In mang----");
                    for (int i = amount - 1; i >= 0; i--) {
                        System.out.println(arr[i]);
                    }
                    break;
                }
                case 6: {
                    System.out.println("Tinh tich cac so chan o vi tri le");
                    System.out.println("Nhap so phan tu cua mang: ");
                    int amount = Integer.valueOf(scan.nextLine());
                    int arr[] = new int[amount];
                    System.out.println("Nhap gia tri cac phan tu: ");
                    for (int i = 0; i < amount; i++) {
                        arr[i] = Integer.valueOf(scan.nextLine());
                    }
                    int product = 1;
                    for (int i = 0; i < amount; i++) {
                        if (i % 2 != 0 && arr[i] % 2 == 0) {
                            product *= arr[i];
                        }
                    }
                    System.out.println("Tich cac so chan vi tri le: " + product);
                    break;
                }
                case 7: {
                    System.out.println("Liet ke vi tri so le dau tien trong mang");
                    System.out.println("Nhap so phan tu cua mang: ");
                    int amount = Integer.valueOf(scan.nextLine());
                    int arr[] = new int[amount];
                    System.out.println("Nhap gia tri cac phan tu: ");
                    for (int i = 0; i < amount; i++) {
                        arr[i] = Integer.valueOf(scan.nextLine());
                    }
                    System.out.println("Vi tri: ");
                    for (int i = 0; i < amount; i++) {
                        if (arr[i] % 2 != 0) {
                            System.out.println("La so thu " + (i + 1));
                            break;
                        }
                    }
                    break;
                }
                case 8: {
                    System.out.println("Vi tri so lon nhat");
                    System.out.println("Nhap so phan tu cua mang: ");
                    int amount = Integer.valueOf(scan.nextLine());
                    int arr[] = new int[amount];
                    System.out.println("Nhap gia tri cac phan tu: ");
                    for (int i = 0; i < amount; i++) {
                        arr[i] = Integer.valueOf(scan.nextLine());
                    }
                    int max = arr[0];
                    for (int i = 0; i < amount; i++) {
                        if (max < arr[i]) {
                            max = arr[i];
                        }
                    }
                    for (int i = 0; i < amount; i++) {
                        if (max == arr[i]) {
                            System.out.println("Vi tri so lon nhat: " + (i + 1));
                        }
                    }
                    break;
                }

                case 9: {
                    System.out.println("Liet ke vi tri so le cuoi cung trong mang");
                    System.out.println("Nhap so phan tu cua mang: ");
                    int amount = Integer.valueOf(scan.nextLine());
                    int arr[] = new int[amount];
                    System.out.println("Nhap gia tri cac phan tu: ");
                    for (int i = 0; i < amount; i++) {
                        arr[i] = Integer.valueOf(scan.nextLine());
                    }
                    System.out.println("Vi tri: ");
                    for (int i = amount - 1; i >= 0; i--) {
                        if (arr[i] % 2 != 0) {
                            System.out.println("La so thu " + (i + 1));
                            break;
                        }
                    }
                    break;
                }
                case 10: {
                    System.out.println("Tinh tong cac vi tri co gia tri nho nhat");
                    System.out.println("Nhap so phan tu cua mang: ");
                    int amount = Integer.valueOf(scan.nextLine());
                    int arr[] = new int[amount];
                    System.out.println("Nhap gia tri cac phan tu: ");
                    for (int i = 0; i < amount; i++) {
                        arr[i] = Integer.valueOf(scan.nextLine());
                    }
                    int min = arr[0];
                    int sumOfValues = 0;
                    int sumOfIndex = 0;
                    for (int i = 0; i < amount; i++) {
                        if (min > arr[i]) {
                            min = arr[i];
                        }
                    }
                    for (int i = 0; i < amount; i++) {
                        if (min == arr[i]) {
                            sumOfValues += arr[i];
                            sumOfIndex += i;
                        }
                    }
                    System.out.println("Tong gia tri cua cac so nho nhat: " + sumOfValues);
                    System.out.println("Tong vi tri cua cac so nho nhat: " + sumOfIndex);
                    break;
                }
                case 0: {
                    System.out.println("Thoat");
                    break;
                }
                default: {
                    System.out.println("Khong co chuc nang nay");
                }
            }
        } while (select != 0);
    }

}
