/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit.J05028_DanhSachDoanhNghiepNhanSinhVienThucTap1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Hoàng Đình Hiếu
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //sc.nextLine();
        ArrayList<DoanhNghiep> arr = new ArrayList<>();
        for(int i=1;i<=n;i++){
            sc.nextLine();
            arr.add(new DoanhNghiep(sc.nextLine(),sc.nextLine(),sc.nextInt()));
        }
        Collections.sort(arr, new Comparator<DoanhNghiep>(){
            @Override
            public int compare(DoanhNghiep o1, DoanhNghiep o2) {
                if(o1.getSoSinhVien() != o2.getSoSinhVien()){
                    return o2.getSoSinhVien()-o1.getSoSinhVien();
                }
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        for(DoanhNghiep x : arr){
            System.out.println(x);
        }
    }
}
