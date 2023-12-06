/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuyenTap;

/**
 *
 * @author Hoàng Đình Hiếu
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;


class Point{
    private double x;
    private double y;
    
    public Point(){
        this(0f, 0f);
    }
    
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }
    
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
    
    public double distance(Point p){
        return sqrt(pow(this.x - p.x, 2) + pow(this.y - p.y, 2));
    }
    
    public double distance(Point p1, Point p2){
        return sqrt(pow(p1.x - p2.x, 2) + pow(p1.y - p2.y, 2));
        
    }

    @Override
    public String toString() {
        return x + " " + y;
    }
}
    
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Point[] arr = new Point[3];
            for(int i = 0; i < 3; i++){
                double x = sc.nextDouble();
                double y = sc.nextDouble();
                arr[i] = new Point(x, y);
            }
            
            double a = arr[0].distance(arr[1]);
            double b = arr[1].distance(arr[2]);
            double c = arr[2].distance(arr[0]);
            if(a + b > c && a + c > b && b + c > a){
                System.out.printf("%.3f\n", a + b + c);
            }
            else{
                System.out.println("INVALID");
            }
        }
    }
}

