package ThucHanh.SapXep;

public class Number implements Comparable<Number>{
    private int f;
    private int idx;

    public Number(int f, int idx) {
        this.f = f;
        this.idx = idx;
    }

    public int getF() {
        return f;
    }

    public int getIdx() {
        return idx;
    }

    @Override
    public int compareTo(Number o) {
        if(this.f!=o.f){
            return o.f - this.f;
        }
        return  this.idx - o.idx;
    }


}
