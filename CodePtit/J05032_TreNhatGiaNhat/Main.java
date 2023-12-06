/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit.J05032_TreNhatGiaNhat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Hoàng Đình Hiếu
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Person> arr = new ArrayList<>();
        sc.nextLine();
        for(int i=0;i<n;i++){
            arr.add(new Person(sc.nextLine()));
        }
        Collections.sort(arr, new Comparator<Person>(){
            @Override
            public int compare(Person o1, Person o2) {
                String[] s1 = o1.getNameDate().split("\\s+");
                String[] s2 = o2.getNameDate().split("\\s+");
                int ngay1 = Integer.parseInt(s1[s1.length-1].substring(0,2));
                int thang1 = Integer.parseInt(s1[s1.length-1].substring(3,5));
                int nam1 = Integer.parseInt(s1[s1.length-1].substring(6));
                int day1 = nam1*365+ thang1*30+ngay1;
                
                int ngay2 = Integer.parseInt(s2[s2.length-1].substring(0,2));
                int thang2 = Integer.parseInt(s2[s2.length-1].substring(3,5));
                int nam2 = Integer.parseInt(s2[s2.length-1].substring(6));
                int day2 = nam2*365+ thang2*30+ngay2;
                
                return day2 - day1;
            }
        });
        System.out.println(arr.get(0));
        System.out.println(arr.get(arr.size()-1));
                
        
    }
}
