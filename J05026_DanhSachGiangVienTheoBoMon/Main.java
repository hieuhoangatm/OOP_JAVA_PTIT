/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit.J05026_DanhSachGiangVienTheoBoMon;

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
        sc.nextLine();
        ArrayList<GiangVien> arr = new ArrayList<>();
        for(int i=1;i<=n;i++){
           
           GiangVien x = new GiangVien(i,sc.nextLine(),sc.nextLine());
           arr.add(x);
                      
        }   
        
        
        int q = sc.nextInt();
        sc.nextLine();
        while(q-->0){
            String mon = sc.nextLine();
            String[] list = mon.split("\\s+");
            String out = "";
            for(String k : list){
                out += Character.toUpperCase(k.charAt(0));
            }
            System.out.println("DANH SACH GIANG VIEN BO MON "+out+":");
            for(GiangVien x : arr){
                if(x.getBoMon().equals(mon)){
                    System.out.println(x.getId()+ " "+ x.getHoTen()+ " "+out);
                }
            }
        }
    }
}
