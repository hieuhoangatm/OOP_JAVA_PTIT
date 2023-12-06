package CodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07076_SapXepMaTran {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int[][] a = new int[n][m];
            ArrayList<Integer> arr= new ArrayList<>();
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    a[i][j] = sc.nextInt();
                    if(j==k-1){
                        arr.add(a[i][j]);
                    }
                }
            }
            Collections.sort(arr);
            for(int i=0;i<n;i++) a[i][k-1] = arr.get(i);
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
