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
import java.util.TreeSet;

/**
 *
 * @author Hoàng Đình Hiếu
 */
public class DocFileNhiPhan1 {
    public static boolean ngTo(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ob = new ObjectInputStream(new FileInputStream("DAYSO.DAT"));
        ArrayList<Integer> arr = (ArrayList<Integer>) ob.readObject();
        TreeSet<Integer> set = new TreeSet<>();
        for(Integer x : arr){
            String k = x.toString();
            if(k.length()>2 && ngTo(x)){
                set.add(x);
            }
        }
        for(Integer x : set){
            System.out.println(x);
        }
    }
}
