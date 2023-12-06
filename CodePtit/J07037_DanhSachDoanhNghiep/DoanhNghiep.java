/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit.J07037_DanhSachDoanhNghiep;

/**
 *
 * @author Hoàng Đình Hiếu
 */
public class DoanhNghiep {
    private String id,ten;
    private int soSinhVien;

    public DoanhNghiep(String id, String ten, int soSinhVien) {
        this.id = id;
        this.ten = ten;
        this.soSinhVien = soSinhVien;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + soSinhVien;
    }
    
    
}
