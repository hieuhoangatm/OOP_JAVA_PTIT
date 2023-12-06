package KiemTraGiuaKy;

import java.math.BigInteger;
import java.util.Scanner;

public class baiTap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
           BigInteger num = sc.nextBigInteger();
           while(!num.remainder(new BigInteger("13")).equals(BigInteger.ZERO)){
               String tmp = new StringBuilder(num.toString()).reverse().toString();
               BigInteger cnt = new BigInteger(tmp);
               num = num.add(cnt);
           }
            System.out.println(num);
        }
    }
}
