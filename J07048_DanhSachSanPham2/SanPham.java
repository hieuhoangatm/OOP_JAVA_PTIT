/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit.J07048_DanhSachSanPham2;

/**
 *
 * @author Hoàng Đình Hiếu
 */
public class SanPham {
    private String id, name;
    private int giaBan,baoHanh;

    public SanPham(String id, String name, int giaBan, int baoHanh) {
        this.id = id;
        this.name = name;
        this.giaBan = giaBan;
        this.baoHanh = baoHanh;
    }

    public String getId() {
        return id;
    }

    public int getGiaBan() {
        return giaBan;
    }

    @Override
    public String toString() {
        return  id + " " + name + " " + giaBan + " " + baoHanh;
    }
    
}
