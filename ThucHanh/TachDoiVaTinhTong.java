/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Hoàng Đình Hiếu
 */
public class TachDoiVaTinhTong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.length()==1){
            System.out.println(s);
            return;
        }
        while(s.length()>1){
            BigInteger a = new BigInteger(s.substring(0,s.length()/2));
            BigInteger b = new BigInteger(s.substring(s.length()/2));
            s = a.add(b).toString();
            System.out.println(s);
            
        }
    }
}
