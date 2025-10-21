/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab7;

/**
 *
 * @author ICT
 */
import java.util.Scanner;

class ChuNhat {
    protected double rong;
    protected double dai;

    public ChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public double getChuVi() {
        return (dai + rong) * 2;
    }

    public double getDienTich() {
        return dai * rong;
    }

    public void xuat() {
        System.out.printf("Chieu dai: %.2f, Chieu rong: %.2f, Dien tich: %.2f, Chu vi: %.2f\n",
                dai, rong, getDienTich(), getChuVi());
    }
}

class Vuong extends ChuNhat {
    public Vuong(double canh) {
        super(canh, canh);
    }

    @Override
    public void xuat() {
        System.out.printf("Hinh vuong canh: %.2f, Dien tich: %.2f, Chu vi: %.2f\n",
                dai, getDienTich(), getChuVi());
    }
}

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin 2 hinh chu nhat:");
        for (int i = 1; i <= 2; i++) {
            System.out.printf("Hinh CN thu %d:\n", i);
            System.out.print("Chieu dai: ");
            double dai = sc.nextDouble();
            System.out.print("Chieu rong: ");
            double rong = sc.nextDouble();
            ChuNhat cn = new ChuNhat(dai, rong);
            cn.xuat();
        }

        System.out.print("\nNhap canh hinh vuong: ");
        double canh = sc.nextDouble();
        Vuong v = new Vuong(canh);
        v.xuat();
    }
}
