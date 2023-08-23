import first.second.Human;
// import java.lang.String;
class Test extends Human {

    // void getInfo(){
    //    // System.out.println(a);
    //     System.out.println(b);
    //    // System.out.println(c);
    //     System.out.println(d);

    // }
    // void getMoreInfo(){
    //   getInfo();
    // }
    //visibility of a particaular data member or member function cannot be reduced
    private void getInfo(){
      System.out.println("this is getInfo of TEst");
    }
    public static void main(String[] args) {
       Test t =new Test();
       t.getInfo();

      //  Human h1= new Human();
      //   System.out.println(h1.a);
      //   System.out.println(h1.b);
      //   System.out.println(h1.c);
      //   System.out.println(h1.d);
    }
}