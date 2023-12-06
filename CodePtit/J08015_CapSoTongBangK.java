package CodePtit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class J08015_CapSoTongBangK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++) a[i] = sc.nextInt();
            HashMap<Integer,Integer> arr = new HashMap<>();
            for(int i=0;i<n;i++){
                if(!arr.containsKey(a[i])){
                    arr.put(a[i],0);
                }
                arr.put(a[i],arr.get(a[i])+1);
            }
            long cnt =0;
            for(int i=0;i<n;i++){
                if(arr.get(k-a[i]) != null){
                    cnt+= arr.get(k-a[i]);
                }
                if(k-a[i] == a[i]){
                    cnt--;
                }
            }
            System.out.println(cnt/2);
        }
    }
}
