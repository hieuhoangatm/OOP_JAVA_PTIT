/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Hoàng Đình Hiếu
 */
public class SapXepTheoThuTuXuatHien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>(n);
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i =0 ;i<n;i++){
                int x = sc.nextInt();
                arr.add(x);
                if(map.containsKey(x)){
                    map.put(x, map.get(x)+1);
                }else{
                    map.put(x, 1);
                }
            }
            ArrayList<Integer> arr2 = new ArrayList<>(n);
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                Integer key = entry.getKey();
                Integer val = entry.getValue();
                arr2.add(val);
            }
            Collections.sort(arr2, Collections.reverseOrder());
            for(Integer x : arr2){
                for(Integer y : arr){
                    if(map.get(y)==x ){
                        System.out.print(y+" ");
                        
                        map.put(y, 0);
                    }
                }
            }
        }
    }
   
}
