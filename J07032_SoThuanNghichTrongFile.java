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
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Hoàng Đình Hiếu
 */
public class J07032_SoThuanNghichTrongFile {
    public static boolean Check(int n){
        String s = Integer.toString(n);
        if(s.length()% 2 == 0 || s.length() <2) return false;
        for(int i =0;i<s.length();i++){
            if((s.charAt(i)-'0') % 2 ==0) return false;
        }
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)) return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ob1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ob2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        
        ArrayList<Integer> arr1 = (ArrayList<Integer>) ob1.readObject();
        ArrayList<Integer> arr2 = (ArrayList<Integer>) ob2.readObject();
        
        TreeMap<Integer, Integer> mp1 = new TreeMap<>();
        HashMap<Integer, Integer> mp2 = new HashMap<>();
        
        for(Integer x : arr1){
            if(Check(x)){
                if(mp1.containsKey(x)){
                    mp1.put(x, mp1.get(x)+1);
                }
                else mp1.put(x, 1);
            }
        }
        for(Integer x : arr2){
            if(Check(x)){
                if(mp2.containsKey(x)){
                    mp2.put(x, mp2.get(x)+1);
                }
                else mp2.put(x, 1);
            }
        }
        int cnt =0;
        for (Map.Entry<Integer, Integer> entry : mp1.entrySet()) {
            Integer key = entry.getKey();
            Integer val1 = entry.getValue();
            Integer val2 = mp2.getOrDefault(key, 0);
            int total = val1 + val2;

            if (val2 > 0) {
                cnt++;
                System.out.println(key + " " + total);
                if (cnt == 10) break;
            }
        }
    }
}