package ThucHanh;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class SoDep {
    public static boolean soDep(String n){
        if( n.length()<2) return false;
        for(int i=0;i<n.length()-1;i++){
            if(Integer.parseInt(n.charAt(i)+"") < (Integer.parseInt(n.charAt(i+1)+""))) return false;
        }
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr1 = (ArrayList<Integer>) ois1.readObject();
        ArrayList<Integer> arr2 = (ArrayList<Integer>) ois2.readObject();
        TreeMap<Integer,Integer> map1 = new TreeMap<>();
        TreeMap<Integer,Integer> map2 = new TreeMap<>();
        for(Integer x : arr1){
            if(soDep(x+"")){
                if(map1.containsKey(x)){
                    map1.put(x,map1.get(x)+1);
                }
                else{
                    map1.put(x,1);
                }
            }
        }
        for(Integer x : arr2){
            if(soDep(x+"")){
                if(map2.containsKey(x)){
                    map2.put(x,map2.get(x)+1);
                }
                else{
                    map2.put(x,1);
                }
            }
        }
        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            Integer key = entry.getKey();
            Integer val1 = entry.getValue();
            if(map2.containsKey(key)){
                System.out.print(key+" "+val1+" "+map2.get(key));
                System.out.println("");
            }
        }
    }
}
