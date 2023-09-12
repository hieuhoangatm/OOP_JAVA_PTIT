/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit.J05024_LietKeSinhVienTheoNganh;

import java.util.ArrayList;
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
        ArrayList<SinhVien> arr = new ArrayList<>();
        for(int i=1;i<=n;i++){
            arr.add(new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        int q = sc.nextInt();
        sc.nextLine();
        while(q-->0){
            String nganh = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN NGANH "+nganh.toUpperCase()+":");
            if(nganh.equals("Ke toan")){
                for(SinhVien x : arr){
                    String ma = x.getId().substring(3, 7);
                    if(ma.equals("DCKT")){
                        System.out.println(x);
                    }
                }
            }
            else if(nganh.equals("Vien thong")){
                for(SinhVien x : arr){
                    String ma = x.getId().substring(3, 7);
                    if(ma.equals("DCVT")){
                        System.out.println(x);
                    }
                }
            }
            else if(nganh.equals("Dien tu")){
                for(SinhVien x : arr){
                    String ma = x.getId().substring(3, 7);
                    if(ma.equals("DCDT")){
                        System.out.println(x);
                    }
                }
            }
            else if(nganh.equals("Cong nghe thong tin")){
                for(SinhVien x : arr){
                    String ma = x.getId().substring(3, 7);                   
                    if( !x.getLop().startsWith("E")  && ma.equals("DCCN")){
                        System.out.println(x);
                    }
                }
            }
            else if(nganh.equals("An toan thong tin")){
                for(SinhVien x : arr){
                    String ma = x.getId().substring(3, 7);                   
                    if(!x.getLop().startsWith("E")  && ma.equals("DCAT")){
                        System.out.println(x);
                    }
                }
            }
        }
    }
}
