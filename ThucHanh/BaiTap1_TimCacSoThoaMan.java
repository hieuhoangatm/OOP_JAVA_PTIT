package ThucHanh;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class BaiTap1_TimCacSoThoaMan {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
//        ArrayList<Integer> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        BigInteger minn = null;
        BigInteger maxx = null;
        BigInteger sum = BigInteger.ZERO;
        for(int i=1;i<=n;i++){
            BigInteger a = new BigInteger(sc.next());
            sum = sum.add(a);
            if(minn == null || a.compareTo(minn)<0){
                minn = a;
            }
            if(maxx == null || a.compareTo(maxx)>0){
                maxx = a;
            }
        }
        System.out.println(minn);
        System.out.println(maxx);
        System.out.println(sum);
    }
}
