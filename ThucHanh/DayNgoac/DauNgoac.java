package ThucHanh.DayNgoac;

import java.util.Stack;

public class DauNgoac {
    private String dayNgoac;
    public  DauNgoac(String dayNgoac){
        this.dayNgoac = dayNgoac;
    }

    private  boolean check(){
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<dayNgoac.length();i++){
            Character c = dayNgoac.charAt(i);
            if(c=='('){
                st.push(1);
            }
            else if(c=='[') st.push(2);
            else if(c=='{') st.push(3);

        }
        return false;
    }
}
