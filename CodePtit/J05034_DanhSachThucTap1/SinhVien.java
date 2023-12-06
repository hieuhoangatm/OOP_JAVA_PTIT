/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit.J05034_DanhSachThucTap1;

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

    public String getName() {
        return name;
    }

    public String getDnghiep() {
        return dnghiep;
    }

    @Override
    public String toString() {
        return  stt + " " + ma + " " + name + " " + lop + " " + email + " " + dnghiep;
    }
    
}
