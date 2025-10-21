/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab7;

/**
 *
 * @author ICT
 */
abstract class SinhVienPoly {
    protected String hoTen;
    protected String nganh;

    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public abstract double getDiem();

    public String getHocLuc() {
        double diem = getDiem();
        if (diem < 5) return "Yeu";
        if (diem < 6.5) return "Trung binh";
        if (diem < 7.5) return "Kha";
        if (diem < 9) return "Gioi";
        return "Xuat sac";
    }

    public void xuat() {
        System.out.printf("%-20s | %-10s | Diem: %-5.2f | Hoc luc: %-10s\n",
                hoTen, nganh, getDiem(), getHocLuc());
    }
}
