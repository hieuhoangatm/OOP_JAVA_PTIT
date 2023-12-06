package CodePtit.J04020_LopPair;

public class Pair <S,T>{
    private T a;
    private S b;

    public Pair(T a, S b) {
        this.a = a;
        this.b = b;
    }
    public boolean ngTo(int n){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public boolean isPrime(){
        return ngTo((Integer)this.a) && ngTo((Integer)this.b);
    }

    @Override
    public String toString() {
        return  a +
                " " + b
                ;
    }
}
