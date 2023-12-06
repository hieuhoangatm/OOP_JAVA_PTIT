package ThucHanh;

import java.util.ArrayList;
import java.util.Scanner;

public class LatNguocCacTuTrongXau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while(t-->0){
            ArrayList<String> arr = new ArrayList<>();
            String s = sc.nextLine();
            String[] tach = s.split("\\s+");
            for(String x: tach) arr.add(x);
            for(int i = arr.size()-1; i>=0;i--){
                System.out.print(arr.get(i)+" ");
            }
            System.out.println("");
        }

    }
}
