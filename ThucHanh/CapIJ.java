package ThucHanh;

import java.util.Scanner;

public class CapIJ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) a[i] =sc.nextInt();
        int count =0;
        for(int i=0;i<n;i++){
            int maxLeft = a[i];
            for(int j=i;j<n;j++){
                maxLeft = Math.max(maxLeft,a[j]);
                if(maxLeft<=a[i] && maxLeft<=a[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
