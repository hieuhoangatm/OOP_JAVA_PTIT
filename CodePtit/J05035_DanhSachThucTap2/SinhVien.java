/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit.J05035_DanhSachThucTap2;

/**
 *
 * @author Hoàng Đình Hiếu
 */
public class SinhVien {
    private int stt;
    private String ma,name,lop,email, dnghiep;

    public SinhVien(int stt,String ma, String name, String lop, String email, String dnghiep) {
        this.stt = stt;
        this.ma = ma;
        this.name = name;
        this.lop = lop;
        this.email = email;
        this.dnghiep = dnghiep;
    }

    

    public String getDnghiep() {
        return dnghiep;
    }

    public String getMa() {
        return ma;
    }

    @Override
    public String toString() {
        return  stt + " " + ma + " " + name + " " + lop + " " + email + " " + dnghiep;
    }
}
