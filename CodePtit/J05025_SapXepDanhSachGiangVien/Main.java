/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit.J05025_SapXepDanhSachGiangVien;

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
        Collections.sort(arr, new Comparator<GiangVien>(){
            @Override
            public int compare(GiangVien o1, GiangVien o2) {
                 String[] a1 = o1.getHoTen().split("\\s+");
                 String[] a2 = o2.getHoTen().split("\\s+");
                 String lastName1 = a1[a1.length - 1];
                 String lastName2 = a2[a2.length - 1];
                 if(!lastName1.equals(lastName2)){
                     return lastName1.compareTo(lastName2);
                 }
                 else{
                     return o1.getId().compareTo(o2.getId());
                 }
            }
        });
        for(GiangVien x : arr){
            String[] list = x.getBoMon().split("\\s+");
            String out = "";
            for(String k : list){
                out += Character.toUpperCase(k.charAt(0));
            }
            System.out.println(x.getId()+ " "+ x.getHoTen()+ " "+out);
        }
       
    }
}
