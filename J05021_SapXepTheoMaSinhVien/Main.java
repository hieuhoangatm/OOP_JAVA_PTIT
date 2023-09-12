/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit.J05021_SapXepTheoMaSinhVien;

/**
 *
 * @author Hoàng Đình Hiếu
 */
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
        ArrayList<SinhVien> arr = new ArrayList<>();
        //sc.nextLine();
        while(sc.hasNext()){           
            SinhVien x = new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            arr.add(x);           
        }
        Collections.sort(arr, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                //if(!o1.getId().equals(o2.getId()))
                    return o1.getId().compareTo(o2.getId());
                //}
                
            }
        });
        
        for(SinhVien x: arr){
            System.out.println(x);
        }
    }
}

