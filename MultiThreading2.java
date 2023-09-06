import java.util.Scanner;

public class MultiThreading2 implements Runnable{
    
    int num1;
    int num2;
    char operation;

    MultiThreading2(int num1, int num2, char operation){
    
        this.num1=num1;
        this.num2=num2;
        this.operation=operation;
    }

    public void run(){
        
        if(this.operation=='+'){
          
            System.out.println("solved by "+Thread.currentThread().getName()+"addition"+(num1+num2));
        }
        else if(operation=='-'){
        
            System.out.println("solved by "+Thread.currentThread().getName()+"sub"+(num1-num2));
        }
        else if(operation == '*'){
           
            System.out.println("solved by "+Thread.currentThread().getName()+"multiplication"+(num1*num2));
        }
    }
    public static void main(String[] args) {
        //System.out.println("Enter the operation +,-,*");
        Scanner sc= new Scanner(System.in);
       // char ch=sc.next().charAt(0);
       System.out.println("enter num 1");
        int num1=sc.nextInt();
        System.out.println("Enter num 2");
        int num2= sc.nextInt();
        MultiThreading2 m1= new MultiThreading2(num1, num2, '+');
         MultiThreading2 m2= new MultiThreading2(num1, num2, '-');
          MultiThreading2 m3= new MultiThreading2(num1, num2, '*');
        Thread t1= new Thread(m1,"thread -1");
        Thread t2= new Thread(m2,"thread -2");
        Thread t3= new Thread(m3,"thread -3");
        t1.start();
        t2.start();
        t3.start();
        
    }
}



// class MyThread implements Runnable{
//     public void run(){
//         for(int i=0;i<10;i++){
//                 System.out.println(Thread.currentThread().getName());
//             }
//     }
// }
// public class MultiThreading2 extends Thread {
//     public void run(){
//         for(int i=0;i<10;i++){
//             System.out.println(Thread.currentThread().getName());
//         }
//     }
//     MultiThreading2(String name){
//         super(name);
//     }
//     public static void main(String[] args) {
//         MultiThreading2 thread =new MultiThreading2("thread-1");
//         thread.start();
        
//         //runnable interface
//         MyThread m= new MyThread();
//         Thread thread2 = new Thread(m,"thread-interface");
//         thread2.start();

        
//         for(int i=0;i<10;i++){
//             System.out.println(Thread.currentThread().getName());
//         }
//     }
// }
