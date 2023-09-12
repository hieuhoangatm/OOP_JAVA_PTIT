/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit.J05025_SapXepDanhSachGiangVien;

/**
 *
 * @author Hoàng Đình Hiếu
 */
public class GiangVien {
    private String id,hoTen,boMon;

    public GiangVien(int id, String hoTen, String boMon) {
        this.id = "GV"+String.format("%02d", id);
        this.hoTen = hoTen;
        this.boMon = boMon;
    }

    @Override
    public String toString() {
        return id + " " + hoTen + " " + boMon;
    }

    public String getId() {
        return id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getBoMon() {
        return boMon;
    }
    
    
    
}
