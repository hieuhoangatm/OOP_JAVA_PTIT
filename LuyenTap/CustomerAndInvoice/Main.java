package LuyenTap.CustomerAndInvoice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Invoice> arr = new ArrayList<>();
        for(int i=1;i<=n;i++){
            sc.nextLine();
            String cusID[] = sc.nextLine().split("\\s+");
            String name[] = sc.nextLine().split("\\s+");
            String dis[] = sc.nextLine().split("\\s+");
            String invoiID[] = sc.nextLine().split("\\s+");
            String amount[] = sc.nextLine().split("\\s+");

            String fullName = "";
            for(int j=3;j<name.length;j++){
                fullName += name[j]+" ";
            }
            fullName = fullName.substring(0,fullName.length()-1);
            Customer tmp = new Customer(Integer.parseInt(cusID[cusID.length-1]),fullName,Integer.parseInt(dis[dis.length-1]));

            Invoice ans = new Invoice(Integer.parseInt(invoiID[invoiID.length-1]),tmp,Double.parseDouble(amount[amount.length-2]));
            ans.setAmount();
            arr.add(ans);
        }
        Collections.sort(arr,new Comparator<Invoice>(){
            @Override
            public int compare(Invoice o1, Invoice o2) {
                if(o1.getAmount()==o2.getAmount()){
                    if(o1.getCustomer().getId()<o2.getCustomer().getId())
                        return -1;
                    else
                        return 1;
                }
                else if(o1.getAmount()>o2.getAmount())
                    return -1;
                else
                    return 1;
            }

        });
        for(Invoice tmp:arr){
            System.out.println(tmp);
        }


    }

}
