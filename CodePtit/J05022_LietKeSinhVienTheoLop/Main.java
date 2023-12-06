/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit.J05022_LietKeSinhVienTheoLop;

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
        ArrayList<SinhVien> arr = new ArrayList<>();
        sc.nextLine();
        for(int i=1;i<=n;i++){
            SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(),sc.nextLine(),sc.nextLine());
            arr.add(x);
        }
        int q = sc.nextInt();
        for(int i=1;i<=q;i++){
            String lopp  = sc.next();
            System.out.println("DANH SACH SINH VIEN LOP "+ lopp+":");
            for(SinhVien x : arr){
                if( x.getLop().equals(lopp)){
                    System.out.println(x.getId()+" "+x.getName()+ " "+x.getLop()+" "+ x.getEmail());
                }
            }
        }
    }
}
