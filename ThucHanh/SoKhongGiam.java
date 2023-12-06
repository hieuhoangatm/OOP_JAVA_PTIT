/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;


/**
 *
 * @author Hoàng Đình Hiếu
 */
public class SoKhongGiam {
    public static boolean khongGiam(int n){
       String s = n+"";
       if(s.length()<2) return false;
       for(int i=1;i<s.length();i++){
           if(s.charAt(i) < s.charAt(i-1)) return false;
       }
       return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ob = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ob2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr1 = (ArrayList<Integer>) ob.readObject();
        ArrayList<Integer> arr2 = (ArrayList<Integer>) ob2.readObject();
        int[] a = new int[100000];
        for(Integer i : arr1){
            if(khongGiam(i)) a[i]++;
        }
        int[] b = new int[100000];
        for(Integer i : arr2){
            if(khongGiam(i)) b[i]++;
        }
        for(int i=10;i<100000;i++){
            if(a[i] > 0 && b[i] > 0){
                System.out.println(i+ " "+a[i]+" "+b[i]);
            }
        }
    }
}
