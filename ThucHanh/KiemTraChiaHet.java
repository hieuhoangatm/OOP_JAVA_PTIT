/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Hoàng Đình Hiếu
 */
public class KiemTraChiaHet {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SONGUYEN.IN"));
        int n = Integer.parseInt(sc.nextLine());
        BigInteger a = new BigInteger("7");
        BigInteger b = new BigInteger("13");
        for(int i=0;i<n;i++){
            BigInteger x = new BigInteger(sc.next());
            if(x.mod(a).toString().equals("0") && x.mod(b).toString().equals("0")){
                System.out.println("Both");
            }
            else if(x.mod(a).toString().equals("0")){
                System.out.println("Div 7");
            }
            else if(x.mod(b).toString().equals("0")){
                System.out.println("Div 13");
            }
            else{
                System.out.println("None");
            }
        }
    }
}
