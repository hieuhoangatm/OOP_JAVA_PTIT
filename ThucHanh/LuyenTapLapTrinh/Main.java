/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh.LuyenTapLapTrinh;

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
        Scanner sc = new Scanner(new File("soint.txt"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(new SinhVien(sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(arr, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if(o1.getSoBaiLamDung() != o2.getSoBaiLamDung()){
                    return 1;
                }
                else{
                    if(o1.getSoBaiLamDung()== o2.getSoBaiLamDung()){
                        return -1;
                    }
                    else{
                        return o1.getName().compareTo(o2.getName());
                    }
                }
            }
        });
        
        for(SinhVien x : arr){
            System.out.println(x);
        }
    }
}
