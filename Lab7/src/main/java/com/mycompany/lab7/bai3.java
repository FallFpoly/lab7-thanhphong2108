/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab7;

/**
 *
 * @author ICT
 */
class SinhVienIT extends SinhVienPoly {
    private double diemJava, diemHtml, diemCss;

    public SinhVienIT(String hoTen, double diemJava, double diemHtml, double diemCss) {
        super(hoTen, "IT");
        this.diemJava = diemJava;
        this.diemHtml = diemHtml;
        this.diemCss = diemCss;
    }

    @Override
    public double getDiem() {
        return (2 * diemJava + diemHtml + diemCss) / 4;
    }
}

class SinhVienBiz extends SinhVienPoly {
    private double diemMarketing, diemSales;

    public SinhVienBiz(String hoTen, double diemMarketing, double diemSales) {
        super(hoTen, "Biz");
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    @Override
    public double getDiem() {
        return (2 * diemMarketing + diemSales) / 3;
    }
}
