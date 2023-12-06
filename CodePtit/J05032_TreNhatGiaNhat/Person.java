/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit.J05032_TreNhatGiaNhat;

/**
 *
 * @author Hoàng Đình Hiếu
 */
public class Person {
    private String nameDate;

    public Person(String nameDate) {
        this.nameDate = nameDate;
        
    }

    public String getNameDate() {
        return nameDate;
    }

    @Override
    public String toString() {
        String[] s = nameDate.split("\\s+");
        return  s[0] ;
    }

 
    
    
}
