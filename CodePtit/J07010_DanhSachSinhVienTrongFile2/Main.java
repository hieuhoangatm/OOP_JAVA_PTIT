/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit.J07010_DanhSachSinhVienTrongFile2;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

/**
 *
 * @author Hoàng Đình Hiếu
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SV.in"));
        int n = Integer.parseInt(sc.nextLine());
        
        for(int i=1;i<=n;i++){
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String dob = sc.nextLine();
            double gpa = Double.parseDouble(sc.nextLine());
           // gpa = Double.parseDouble(dob)
            SinhVien x = new SinhVien(i,name, lop, dob, gpa);
            System.out.println(x);
        }
        
    }
}
