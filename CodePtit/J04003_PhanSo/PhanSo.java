/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit.J04003_PhanSo;

/**
 *
 * @author Hoàng Đình Hiếu
 */
public class PhanSo {
    private long tuSo;
    private long mauSo;
    // hello
    public PhanSo(){
        tuSo =0;
        mauSo =1;
    }

    public PhanSo(long tuSo, long mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    
    private long gcd(long a, long b){
        if(a%b==0){
            return b;
        }
        return gcd(b,a%b);
    }

    @Override
    public String toString() {
        long msc = gcd(this.tuSo, this.mauSo);
        return tuSo/msc + "/"+ mauSo/msc;
    }
    
    
}
