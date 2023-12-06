/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Hoàng Đình Hiếu
 */
public class TinhTongCacChuSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            int sum =0;
            ArrayList<Character> arr = new ArrayList<>();
            for(int i=0;i<s.length();i++){
                if(Character.isDigit(s.charAt(i))){
                    sum+= s.charAt(i)-'0';
                }
                else{
                    arr.add(s.charAt(i));
                }
            }
            Collections.sort(arr);
            for(Character x : arr){
                System.out.print(x);
            }
            System.out.print(sum);
            System.out.println("");
        }
    }
    
}
