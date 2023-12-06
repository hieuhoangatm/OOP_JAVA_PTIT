/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit.J05031_BangDiemThanhPhan2;

/**
 *
 * @author Hoàng Đình Hiếu
 */
public class SinhVien {
    private String id,name,lop;
    private double diem1,diem2,diem3;

    public SinhVien(String id, String name, String lop, double diem1, double diem2, double diem3) {
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    

    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return id + " " + name + " " + lop + " " + String.format("%.1f", diem1) + " " + 
                String.format("%.1f", diem2) + " " + String.format("%.1f", diem3);
    }
}
