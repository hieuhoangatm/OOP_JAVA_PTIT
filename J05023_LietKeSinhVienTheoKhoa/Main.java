/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit.J05023_LietKeSinhVienTheoKhoa;

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
            SinhVien x = new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            arr.add(x);
        }
        int q = sc.nextInt();
        sc.nextLine();
        while(q-->0){
            String year = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN KHOA "+year+":");
            for(SinhVien x : arr){
                String nam = "20"+x.getLop().substring(1,3);
                if(year.equals(nam)){
                    System.out.println(x);
                }
            }
        }
    }
}
