package CodePtit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07085_TongChuSo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ob = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> arr = (ArrayList<String>) ob.readObject();
        for(String x : arr){
            String tmp = "";
            int sum =0;
            for(int i=0;i<x.length();i++){
                if(Character.isDigit(x.charAt(i))){
                    tmp += x.charAt(i);
                    sum += x.charAt(i)-48;
                }
            }
            while(tmp.length() > 0 && tmp.charAt(0) == '0') tmp = tmp.substring(1);
            System.out.printf("%s %d\n", tmp, sum);
        }

    }
}
