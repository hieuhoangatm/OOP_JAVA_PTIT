/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

/**
 *
 * @author Hoàng Đình Hiếu
 */
public class J07030_CapSoNguyenToTrongFile1 {
    public static boolean ngTo(int n){
        if( n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr1 = (ArrayList<Integer>) ois1.readObject();
        ArrayList<Integer> arr2 = (ArrayList<Integer>) ois2.readObject();
        
        TreeSet<Integer> set1 = new TreeSet<>();
        for(Integer x : arr1){
           if(ngTo(x)) set1.add(x);
        }
        HashSet<Integer> set2 = new HashSet<>();
        for(Integer x : arr2){
            if(ngTo(x)) set2.add(x);
        }
        for(Integer x : set1){
            if(set2.contains(1000000-x) && x < (1000000-x)){
                System.out.println(x+" "+(1000000-x));
            }
        }
    }
}
