package first.second;

 public class Human {
    private int a;
    protected int b;
    int c;
    public int d;

    public Human(){

    }

    Human(int a , int b){
        this.a=a;
        this.b=b;
    }

    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    public void setA(int a) {
        this.a = a;
    }
    public void setB(int b) {
        this.b = b;
    }

    
}
