package CodePtit.J04009_DienTichTamGiac;

public class Point {
    private double x;
    private  double y;
    public Point() {
    }

    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Point a){
        return Math.sqrt(Math.pow(this.x-a.x,2)+ Math.pow(this.y-a.y,2));
    }

    public double distance(Point a, Point b){
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }
}
