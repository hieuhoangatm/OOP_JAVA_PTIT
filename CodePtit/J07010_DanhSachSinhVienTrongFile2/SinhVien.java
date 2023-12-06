/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit.J07010_DanhSachSinhVienTrongFile2;

/**
 *
 * @author Hoàng Đình Hiếu
 */
public class SinhVien {
    private String id,name,lop,date;
    private double gpa;

    public SinhVien(int id, String name, String lop, String date, double gpa) {
        this.id = "B20DCCN"+String.format("%03d",id);
        this.name = name;
        this.lop = lop;
        this.date = date;
        this.gpa = gpa;
    }
    
    public String chuanHoa(String s){
        StringBuilder sb = new StringBuilder(s);    
        if(sb.charAt(1)=='/') sb.insert(0, '0');
        if(sb.charAt(4)=='/') sb.insert(3, '0');
        return sb.toString();
    }

    @Override
    public String toString() {
        return id + " " + name  + " " + lop + " " +chuanHoa(date)+" "+ String.format("%.2f", gpa);
    }
    
}
