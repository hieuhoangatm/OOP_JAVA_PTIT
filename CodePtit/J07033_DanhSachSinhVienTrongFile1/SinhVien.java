/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit.J07033_DanhSachSinhVienTrongFile1;

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
    public String chuanHoa(String name){
        String ten = "";
        String[] arr = name.trim().split("\\s+");
        for(String x : arr){
            ten += Character.toUpperCase(x.charAt(0));
            for(int i = 1;i<x.length();i++){
                ten += Character.toLowerCase(x.charAt(i));
            }
            ten += " ";
        }
        return ten.trim();
    }
    @Override
    public String toString() {
        return id + " " + chuanHoa(name) + " " + lop + " " + email;
    }
    
    
}
