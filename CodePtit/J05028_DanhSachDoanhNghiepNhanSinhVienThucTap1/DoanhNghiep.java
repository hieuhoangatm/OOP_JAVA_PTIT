/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit.J05028_DanhSachDoanhNghiepNhanSinhVienThucTap1;

/**
 *
 * @author Hoàng Đình Hiếu
 */
public class DoanhNghiep {
    private String ma,ten;
    private int soSinhVien;

    public DoanhNghiep(String ma, String ten, int soSinhVien) {
        this.ma = ma;
        this.ten = ten;
        this.soSinhVien = soSinhVien;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + soSinhVien;
    }

    public String getMa() {
        return ma;
    }

    public int getSoSinhVien() {
        return soSinhVien;
    }
    
    
    
}
