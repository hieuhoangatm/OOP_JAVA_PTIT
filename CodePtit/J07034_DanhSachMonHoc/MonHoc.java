/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit.J07034_DanhSachMonHoc;

/**
 *
 * @author Hoàng Đình Hiếu
 */
public class MonHoc {
    private String id,ten;
    private int tinChi;

    public MonHoc(String id, String ten, int tinChi) {
        this.id = id;
        this.ten = ten;
        this.tinChi = tinChi;
    }

    public String getTen() {
        return ten;
    }
    
    @Override
    public String toString() {
        return  id + " " + ten + " " + tinChi;
    }
    
}
