/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit.J07048_DanhSachSanPham2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Hoàng Đình Hiếu
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SanPham> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            //sc.nextLine();
            arr.add(new SanPham(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
            
        }
        Collections.sort(arr, new Comparator<SanPham>(){
            @Override
            public int compare(SanPham o1, SanPham o2) {
                if(o1.getGiaBan()!=o2.getGiaBan()){
                    return o2.getGiaBan()-o1.getGiaBan();
                }
                else return o1.getId().compareTo(o2.getId());
            }
        });
        for(SanPham x : arr){
            System.out.println(x);
        }
    }
}
