package ThucHanh.BaiThucHanhSo3;

import java.util.*;

public class BaiTap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n =sc.nextInt();
            TreeSet<Integer> se = new TreeSet<>();
            for(int i=0;i<n;i++){
                int x = sc.nextInt();
                se.add(x);
            }
            ArrayList<Integer> a1 = new ArrayList<>();
            for(int i : se){
                if(i%2==0) System.out.print(i+" ");
                else a1.add(i);
            }
            System.out.println();
            a1.sort(Comparator.reverseOrder());
            for(int x : a1){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
