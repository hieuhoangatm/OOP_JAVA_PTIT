/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit.J07045_LoaiPhong;

/**
 *
 * @author Hoàng Đình Hiếu
 */
public class LoaiPhong implements Comparable<LoaiPhong>{
    private String thongTinPhong;

    public LoaiPhong(String thongTinPhong) {
        this.thongTinPhong = thongTinPhong;
    }
    
    public String getTenPhong(){
        String[] arr = this.thongTinPhong.split("\\s+");
        return arr[1];
    }
    
    @Override
    public int compareTo(LoaiPhong o) {
        return this.getTenPhong().compareTo(o.getTenPhong()); 
    }


    @Override
    public String toString() {
        return thongTinPhong ;
    }
    
}
