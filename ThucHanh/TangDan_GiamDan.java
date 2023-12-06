/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Hoàng Đình Hiếu
 */
public class TangDan_GiamDan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            TreeSet<Integer> set1 = new TreeSet<>();
            TreeSet<Integer> set2 = new TreeSet<>();
            
            ArrayList<Integer> arr = new ArrayList<>();
            int n = sc.nextInt();
            for(int i = 0;i<n;i++){
                int x = sc.nextInt();
                if(x%2==0){
                    set1.add(x);
                }
                else{
                    set2.add(x);
                }
            }
            for(Integer x : set2){
                arr.add(x);
            }
            for(Integer x : set1){
                System.out.print(x+" ");
            }
            System.out.println("");
            Collections.sort(arr, Collections.reverseOrder());
            for(Integer x : arr){
                System.out.print(x+" ");
            }
            System.out.println("");
        }
    }
}
