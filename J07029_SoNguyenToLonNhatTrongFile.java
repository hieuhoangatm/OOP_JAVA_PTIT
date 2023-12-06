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
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;


/**
 *
 * @author Hoàng Đình Hiếu
 */
public class J07029_SoNguyenToLonNhatTrongFile {
    public static boolean ngTo(int n){
        if( n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream os = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> arr = (ArrayList<Integer>) os.readObject();
        TreeMap<Integer, Integer> mp = new TreeMap<>(Collections.reverseOrder());
        for(Integer x :arr){
            if(mp.containsKey(x)){
                mp.put(x, mp.get(x)+1);
            }
            else mp.put(x, 1);
        }
        int cnt = 0;
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            Integer key = entry.getKey();
            Integer val = entry.getValue();
            if(ngTo(key)){
                cnt++;
                System.out.println(key+" "+val);
                if(cnt == 10) break;
            }
        }
        
    }
}
