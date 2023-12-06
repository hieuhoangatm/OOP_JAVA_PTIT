/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh.DanhSachLienLac;

/**
 *
 * @author Hoàng Đình Hiếu
 */
public class SinhVien {
    private String id,name,lop,email,phone;

    public SinhVien(String id, String name, String lop, String email, String phone) {
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.email = email;
        this.phone = "0"+phone;
    }

    public String getId() {
        return id;
    }

    public String getLop() {
        return lop;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + lop + " " + email + " " + phone;
    }
    
}
