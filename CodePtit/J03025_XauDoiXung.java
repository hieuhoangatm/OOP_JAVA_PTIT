/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.Scanner;

/**
 *
 * @author Hoàng Đình Hiếu
 */
public class J03025_XauDoiXung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            int cnt =0;
            for(int i=0;i<s.length()/2;i++){
                if(s.charAt(i) != s.charAt(s.length()-i-1)) cnt++;
            }
            if(cnt>1) System.out.println("NO");
            else if(cnt==0){
                if(s.length()%2==0) System.out.println("NO");
                else System.out.println("YES");
            }
            else System.out.println("YES");
        }
    }
}
