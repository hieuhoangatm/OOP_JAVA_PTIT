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
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Hoàng Đình Hiếu
 */
public class J07006_SoKhacNhauTrongFile3 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ob = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> arr = (ArrayList<Integer>) ob.readObject();
        TreeMap<Integer,Integer> mp = new TreeMap<>();
        for(Integer x : arr){
            if(mp.containsKey(x)){
                mp.put(x, mp.get(x)+1);
            }
            else{
                mp.put(x, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            Integer key = entry.getKey();
            Integer val = entry.getValue();
            System.out.println(key+" "+val);
        }
    }
}
