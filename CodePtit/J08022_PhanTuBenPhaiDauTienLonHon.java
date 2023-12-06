/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hoàng Đình Hiếu
 */
public class J08022_PhanTuBenPhaiDauTienLonHon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>(n);
            for(int i=0;i<n;i++){
                arr.add(sc.nextInt());
            }
            for(int i=0;i<n;i++){
                int j = i+1;
                while(j<n){
                    if(arr.get(i) < arr.get(j)){
                        System.out.print(arr.get(j)+" ");
                        break;
                    }
                    else j++;
                }
                if(j==n) System.out.print("-1 ");
            }
            System.out.println("");
        }
    }
}
