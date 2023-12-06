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
public class J02008_BoiSoNhoNhatCuaNSoNguyenDuongDauTien {
    public static long gcd(long a, long b){
        if(a%b==0) return b;
        return gcd(b,a%b);
    }
    public static long lcm(long a,long b){
        return (a*b)/ gcd(a,b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long minn = 1;
            for(int i =2;i<=n;i++){
                minn = lcm(minn,i);
            }
            System.out.println(minn);
        }
    }
}
