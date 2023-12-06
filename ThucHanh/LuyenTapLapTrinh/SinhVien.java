/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh.LuyenTapLapTrinh;

/**
 *
 * @author Hoàng Đình Hiếu
 */
public class SinhVien {
    private String name;
    private String soBai;
    private int soBaiLamDung,soSubmit;
    public SinhVien(String name, String soBai) {
        this.name = name;
        this.soBai = soBai;      
    }
    
    public int getSoBaiLamDung(){
        String[] arr = this.soBai.split("\\s+");
        this.soBaiLamDung=  Integer.parseInt(arr[0]);
        return Integer.parseInt(arr[0]);
    }
    public int getSubmit(){
        String[] arr = this.soBai.split("\\s+");
        this.soSubmit= Integer.parseInt(arr[1]);
        return Integer.parseInt(arr[1]);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " " + this.soBaiLamDung+" "+ this.soSubmit;
    }
    
}
