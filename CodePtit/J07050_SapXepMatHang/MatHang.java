/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit.J07050_SapXepMatHang;

/**
 *
 * @author Hoàng Đình Hiếu
 */
public class MatHang {
    private String id,name,nhomHang;
    private Double giaMua,giaBan;

    public MatHang(int id, String name, String nhomHang, Double giaMua, Double giaBan) {
        this.id = "MH"+ String.format("%02d", id);
        this.name = name;
        this.nhomHang = nhomHang;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }
    
    public Double getLoiNhuan(){
        return this.giaBan - this.giaMua;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + nhomHang + " "+String.format("%.2f", getLoiNhuan());
    }
    
    
}
