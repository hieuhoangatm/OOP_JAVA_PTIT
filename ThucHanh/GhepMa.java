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
public class GhepMa {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ob = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ob2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<String> arr1 = (ArrayList<String>) ob.readObject();
        ArrayList<Integer> arr2 = (ArrayList<Integer>) ob2.readObject();
        TreeSet<String> set1    = new TreeSet<>();
        TreeSet<Integer> set2 = new TreeSet<>();
        for(String x : arr1){
            set1.add(x);
        }
        for(Integer x : arr2){
            set2.add(x);
        }
        for(String x: set1){
            for(Integer y : set2){
                System.out.println(x+y);
            }
        }
    }
}
