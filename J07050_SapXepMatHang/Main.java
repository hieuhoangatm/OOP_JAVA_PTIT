/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit.J07050_SapXepMatHang;

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
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(new MatHang(i+1, sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(arr, new Comparator<MatHang>(){
            @Override
            public int compare(MatHang o1, MatHang o2) {
                return -o1.getLoiNhuan().compareTo(o2.getLoiNhuan());
            }
        });
        
        for(MatHang x : arr){
            System.out.println(x);
        }
    }
}
