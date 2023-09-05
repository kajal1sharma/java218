public class MultiThreadedApp extends Thread{

    MultiThreadedApp(String name){
        super(name);
    }
    public void run(){
        for(int i=0;i<50;i++){

            try {
                sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("hi iam thread class"+Thread.currentThread().getName());
        }
    }
 public static void main(String[] args) {

    MultiThreadedApp mt = new MultiThreadedApp("thread-1");
    mt.start(); 
    MultiThreadedApp mt2=new MultiThreadedApp("thread-2");
    mt2.start();
    // mt.run();
    for(int j=0;j<50;j++){
       
        System.out.println("main thread is working");
    }

 }   
}
