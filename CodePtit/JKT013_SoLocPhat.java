package CodePtit;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class JKT013_SoLocPhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            ArrayList<String> arr = new ArrayList<>();
            Queue<String> q = new LinkedList<>();
            q.add("6");
            q.add("8");
//            arr.add("6");
//            arr.add("8");
            while(true){
                String tmp1 = q.poll();

//                String tmp2 = q.poll();
                if(tmp1.length()>n) break;
                arr.add(tmp1);
                q.add(tmp1+"6");
                q.add(tmp1+"8");
            }
            System.out.println(arr.size());
            for(int i= arr.size()-1;i>=0;i--){
                System.out.print(arr.get(i)+" ");
            }
            System.out.println();
        }
    }
}
