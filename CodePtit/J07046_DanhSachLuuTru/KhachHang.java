/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit.J07046_DanhSachLuuTru;

/**
 *
 * @author Hoàng Đình Hiếu
 */
public class KhachHang implements Comparable<KhachHang>{
    private String id,name,maPhong,ngayDen,ngayDi;

    public KhachHang(int id, String name, String maPhong, String ngayDen, String ngayDi) {
        this.id = "KH"+String.format("%02d",id);
        this.name = name;
        this.maPhong = maPhong;
        this.ngayDen = ngayDen;
        this.ngayDi = ngayDi;
    }
    
    public int ngay(String s){
        String[] arr = s.split("/");
        int ngay = Integer.parseInt(arr[0]);
        int thang = Integer.parseInt(arr[1]);
        int nam = Integer.parseInt(arr[2]);
        return ngay+thang*30+nam*365;
    }
    public int ngayLuuTru(){
        return ngay(this.ngayDi)-ngay(this.ngayDen);
    }
    @Override
    public int compareTo(KhachHang o) {
        return o.ngayLuuTru() - this.ngayLuuTru();      
    }

    @Override
    public String toString() {
        return  id + " " + name + " " + maPhong + " "+ngayLuuTru();
    }
    
    
}
