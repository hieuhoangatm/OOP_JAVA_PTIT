/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuyenTap.DanhSachCanhSuDungLopPair;

/**
 *
 * @author Hoàng Đình Hiếu
 */
public class PairCanh<T,U> {
    private T  a;
    private U b;

    public PairCanh(T a, U b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "(" + a + "," + b + ")";
    }
    
}
