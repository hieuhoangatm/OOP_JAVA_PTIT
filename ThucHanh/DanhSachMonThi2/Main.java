/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh.DanhSachMonThi2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Hoàng Đình Hiếu
 */
public class    Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        ArrayList<MonThi> arr = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        while(sc.hasNext()){
            MonThi x = new MonThi(sc.nextLine(),sc.nextLine(),sc.nextLine());
            if(!set.contains(x.getId())){
                set.add(x.getId());
                arr.add(x);
            }
        }
        Collections.sort(arr, new Comparator<MonThi>(){
            @Override
            public int compare(MonThi o1, MonThi o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });
        for(MonThi x : arr){
            System.out.println(x);
        }
    }
}
