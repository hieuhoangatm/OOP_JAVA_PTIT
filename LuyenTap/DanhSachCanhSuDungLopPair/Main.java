/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuyenTap.DanhSachCanhSuDungLopPair;

import java.util.Scanner;

/**
 *
 * @author Hoàng Đình Hiếu
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int[][] a = new int[n][n];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                int x = sc.nextInt();
                if(x==1 && i<j){
                    PairCanh<Integer, Integer> p = new PairCanh<>(i, j);
                    System.out.println(p);
                }
            }   
        }
    }
}
