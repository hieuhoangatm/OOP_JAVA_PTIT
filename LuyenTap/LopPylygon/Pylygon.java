/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuyenTap.LopPylygon;

import java.util.ArrayList;

/**
 *
 * @author Hoàng Đình Hiếu
 */
public class Pylygon {
    private double area;
    private ArrayList<Point> arr = new ArrayList<>();

    public Pylygon(double area) {
        this.area = area;
    }
    

    public Pylygon(Point[] p){
        for(int i=0;i<p.length;i++){
            this.arr.add(p[i]);
        }
        this.arr.add(arr.get(0));
    }
    
    public String getArea(){
        int sum =0;
        for(int i=0;i<arr.size()-1;i++){
            sum += arr.get(i).getA()*arr.get(i+1).getB()- arr.get(i).getB()*arr.get(i+1).getA();
        }
        double x = (double) Math.abs(sum)/2;
        return String.format("%.3f", x);
    }
    
}
