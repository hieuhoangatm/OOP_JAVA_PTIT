/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh.DanhSachMonThi2;

/**
 *
 * @author Hoàng Đình Hiếu
 */
public class MonThi {
    private String id,name,hinhThuc;

    public MonThi(String id, String name, String hinhThuc) {
        this.id = id;
        this.name = name;
        this.hinhThuc = hinhThuc;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + hinhThuc;
    }
    
}
