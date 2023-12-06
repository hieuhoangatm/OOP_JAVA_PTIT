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
public class J02034_BoSungDaySo {
    public static int[] cnt = new int[202];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        //int[] cnt = new int[101];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            cnt[a[i]] = 1;
        }
        int ok =1;
        for(int i=1;i<=a[n-1];i++){
            if(cnt[i] != 1){
                System.out.println(i);
                ok = 0;
            }
        }
        if(ok == 1) System.out.println("Excellent!");
        
    }
}