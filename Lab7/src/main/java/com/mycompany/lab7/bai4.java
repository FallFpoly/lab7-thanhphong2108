/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab7;

/**
 *
 * @author ICT
 */
import java.util.*;

public class bai4 {
    static Scanner sc = new Scanner(System.in);
    static List<SinhVienPoly> list = new ArrayList<>();

    public static void main(String[] args) {
        int chon;
        do {
            menu();
            System.out.print("Chon chuc nang: ");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1 -> nhap();
                case 2 -> xuat();
                case 3 -> xuatSVGioi();
                case 4 -> sapXepTheoDiem();
                case 5 -> System.out.println("Ket thuc chuong trinh!");
                default -> System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 5);
    }

    static void menu() {
        System.out.println("\n===== MENU QUAN LY SINH VIEN =====");
        System.out.println("1. Nhap danh sach sinh vien");
        System.out.println("2. Xuat danh sach sinh vien");
        System.out.println("3. Xuat sinh vien co hoc luc GIOI");
        System.out.println("4. Sap xep danh sach theo diem");
        System.out.println("5. Ket thuc");
    }

    static void nhap() {
        while (true) {
            System.out.print("Nhap nganh (IT/Biz, de trong de thoat): ");
            String nganh = sc.nextLine();
            if (nganh.isEmpty()) break;

            System.out.print("Nhap ho ten: ");
            String hoTen = sc.nextLine();

            if (nganh.equalsIgnoreCase("IT")) {
                System.out.print("Nhap diem Java: ");
                double java = Double.parseDouble(sc.nextLine());
                System.out.print("Nhap diem HTML: ");
                double html = Double.parseDouble(sc.nextLine());
                System.out.print("Nhap diem CSS: ");
                double css = Double.parseDouble(sc.nextLine());
                list.add(new SinhVienIT(hoTen, java, html, css));
            } else if (nganh.equalsIgnoreCase("Biz")) {
                System.out.print("Nhap diem Marketing: ");
                double mar = Double.parseDouble(sc.nextLine());
                System.out.print("Nhap diem Sales: ");
                double sale = Double.parseDouble(sc.nextLine());
                list.add(new SinhVienBiz(hoTen, mar, sale));
            } else {
                System.out.println("Nganh khong hop le!");
            }
        }
    }

    static void xuat() {
        System.out.println("\n=== DANH SACH SINH VIEN ===");
        for (SinhVienPoly sv : list) {
            sv.xuat();
        }
    }

    static void xuatSVGioi() {
        System.out.println("\n=== SINH VIEN CO HOC LUC GIOI ===");
        for (SinhVienPoly sv : list) {
            if (sv.getHocLuc().equalsIgnoreCase("Gioi")) sv.xuat();
        }
    }

    static void sapXepTheoDiem() {
        Collections.sort(list, Comparator.comparingDouble(SinhVienPoly::getDiem).reversed());
        System.out.println("\n=== DANH SACH SAU KHI SAP XEP ===");
        xuat();
    }
}
