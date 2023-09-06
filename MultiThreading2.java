
class MyThread implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
                System.out.println(Thread.currentThread().getName());
            }
    }
}
public class MultiThreading2 extends Thread {
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
    MultiThreading2(String name){
        super(name);
    }
    public static void main(String[] args) {
        MultiThreading2 thread =new MultiThreading2("thread-1");
        thread.start();
        
        //runnable interface
        MyThread m= new MyThread();
        Thread thread2 = new Thread(m,"thread-interface");
        thread2.start();

        
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
