package ThucHanh;

import java.math.BigInteger;
import java.util.Scanner;

public class BaiTap2_TinhTongTachChuSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String n = sc.next();
        BigInteger number = new BigInteger(sc.next());
        while(number.toString().length()>1){
            int length = number.toString().length();
            int halfLength = length/2;
            BigInteger a = new BigInteger(number.toString().substring(0,halfLength));
            BigInteger b = new BigInteger(number.toString().substring(halfLength));

            BigInteger sum = a.add(b);
            System.out.println(sum);
            number = sum;
        }
    }
}
