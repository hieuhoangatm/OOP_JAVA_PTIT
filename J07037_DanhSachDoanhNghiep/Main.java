/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit.J07037_DanhSachDoanhNghiep;

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
        Scanner sc = new Scanner(new File("DN.in"));
        ArrayList<DoanhNghiep> arr = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            sc.nextLine();
            arr.add(new DoanhNghiep(sc.nextLine(),sc.nextLine(),sc.nextInt()));
        }
        Collections.sort(arr,new Comparator<DoanhNghiep>(){
            @Override
            public int compare(DoanhNghiep o1, DoanhNghiep o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });
        for(DoanhNghiep x : arr){
            System.out.println(x);
        }
    }
}
