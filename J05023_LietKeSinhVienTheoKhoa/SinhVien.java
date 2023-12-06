/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit.J05023_LietKeSinhVienTheoKhoa;

/**
 *
 * @author Hoàng Đình Hiếu
 */
public class SinhVien {
    private String id,name,lop,email;

    public SinhVien(String id, String name, String lop, String email) {
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getLop() {
        return lop;
    }

    @Override
    public String toString() {
        return  id + " " + name + " " + lop + " " + email;
    }
    
}
