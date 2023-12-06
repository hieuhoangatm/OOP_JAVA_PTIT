/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit.J07017_LopPair;

/**
 *
 * @author Hoàng Đình Hiếu
 */
public class Pair<T,U> {
    private T a;
    private U b;

    public Pair(T a, U b) {
        this.a = a;
        this.b = b;
    }
    
    private boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public boolean isPrime() {
        return isPrime((Integer)a) && isPrime((Integer)b);
    }

    @Override
    public String toString() {
        return  a + " " + b;
    }
    
}
