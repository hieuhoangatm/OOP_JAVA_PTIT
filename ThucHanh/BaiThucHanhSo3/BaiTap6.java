package ThucHanh.BaiThucHanhSo3;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BaiTap6 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<BigInteger> arr = new ArrayList<>();
        BigInteger sum = BigInteger.ZERO;
        while(sc.hasNext()){
            String tmp = sc.nextLine();
            BigInteger x = new BigInteger(tmp);
            sum = sum.add(x);
            arr.add(x);

        }
        Collections.sort(arr);
        System.out.println(arr.get(0));
        System.out.println(arr.get(arr.size()-1));
        System.out.println(sum);

    }
}
