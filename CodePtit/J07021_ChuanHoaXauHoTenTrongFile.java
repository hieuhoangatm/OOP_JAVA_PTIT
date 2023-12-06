/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Hoàng Đình Hiếu
 */
public class J07021_ChuanHoaXauHoTenTrongFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while(true){
            String s = sc.nextLine();
            String[] arr = s.trim().split("\\s+");
            if(arr[0].equals("END")) break;
            String chuanHoa = "";
            for(String x : arr){
                chuanHoa += Character.toUpperCase(x.charAt(0));
                for(int j = 1;j<x.length();j++){
                    chuanHoa += Character.toLowerCase(x.charAt(j));
                }
                chuanHoa += " ";
            }
            System.out.println(chuanHoa.trim());
        }
    }
}
