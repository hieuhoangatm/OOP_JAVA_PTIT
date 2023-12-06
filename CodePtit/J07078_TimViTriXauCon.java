package CodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07078_TimViTriXauCon {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("STRING.in"));
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0) {
            String s1 = sc.next();
            String s2 = sc.next();
            for (int i = 0; i <= s1.length() - s2.length(); i++) {
                int cnt = 0;
                while (cnt < s2.length() && s1.charAt(i + cnt) == s2.charAt(cnt)) cnt++;
                if (cnt == s2.length()) System.out.print((i + 1) + " ");
            }
            System.out.println();
        }
    }
}
