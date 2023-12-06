/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Hoàng Đình Hiếu
 */
public class ThietLapDiaChiEmail2 {
    public static String getname(String[] word){
        String name ="";
        for(String x : word){
            name += x + " ";
        }
        return name;
    }
    
    public static String getmail(String[] word){
        String mail = word[word.length-1];
        for(int i =0;i<word.length-1;i++){
            mail += word[i].charAt(0);
        }
        return mail;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        HashMap<String,Integer> map1 = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();
        while(sc.hasNext()){
            String[] word = sc.nextLine().trim().toLowerCase().split("\\s+");
            String name = getname(word);
            String mail = getmail(word);
            if(!map1.containsKey(name)){
                map1.put(name, 1);
                int cnt = (map2.containsKey(mail) ? map2.get(mail):0)+1;
                map2.put(mail, cnt);
                System.out.println(mail+(cnt>1 ? cnt : "") + "@ptit.edu.vn");
            }
        }
    }
}
