package ThucHanh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class LocTu {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        Set<String> unique = new HashSet<>();
        List<String> words = new ArrayList<>();
        while(sc.hasNext()){
            String word = sc.next();
            if(word.matches(".*\\d+.*") && !word.matches(".*[.!?:,].*")){
                unique.add(word);
            }
        }
        words.addAll(unique);
        Collections.sort(words);
        for (String i : words){
            System.out.println(i);
        }
    }
}
