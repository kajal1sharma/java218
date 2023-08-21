
package first.second;
//if classes are in the package then you dont have to import anything
public class Animal extends Human {
    private int x;
    protected int y;
    public int z;
    int w;


    Animal(){

    }
    Animal(int x, int y){
        this.x=x;
        this.y=y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    void getInfo(){
        //System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(w);
    }
    public static void main(String[] args) {
        // Human h= new Human(10, 10);
        // //System.out.println(h.a);  
        // System.out.println(h.b);
        // System.out.println(h.c);
        // System.out.println(h.d);      
    }    

}
