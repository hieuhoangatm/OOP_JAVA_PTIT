/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit.J07034_DanhSachMonHoc;

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
        Scanner sc = new Scanner(new File("MONHOC.in"));
        ArrayList<MonHoc> arr = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            sc.nextLine();
            arr.add(new MonHoc(sc.nextLine(),sc.nextLine(),sc.nextInt()));
        }
        Collections.sort(arr,new Comparator<MonHoc>(){
            @Override
            public int compare(MonHoc o1, MonHoc o2) {
                return o1.getTen().compareTo(o2.getTen());
            }
        });
        for(MonHoc x : arr){
            System.out.println(x);
        }
    }
}
