
class Stack{
    int arr[];
    int top;

    Stack(int size){
        if(size==0){
            arr=new int[10];
        }
        else{
            arr=new int[size];
        }
        top=-1;
    }

    void push(int data) throws Exception{
        if(top==arr.length-1){
            System.out.println("Stack overflow");
            throw new Exception("Stack OVerflow");
        }
        else{
            top++;
            arr[top]=data;
        }
    }


    int pop() throws Exception{
        if(top==-1){
            System.out.println("Stack Underflow");
            throw new Exception("Stack underflow");
        }
        else{
            int ele=arr[top];
            top=top-1;
            return ele;
        }
    }
    int getSize(){
        return arr.length;
    }
}

public class MultiThreading3  extends Thread{
    Stack st;
    MultiThreading3(String name, Stack st){
        super(name);
        this.st = st;
    }
    public void run(){
        String name= Thread.currentThread().getName();
        if(name=="push thread"){
            for(int i=0;i<100;i++){

                try {
                    st.push(i);
                    System.out.println(Thread.currentThread().getName()+" "+st.top);
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        else if(name=="pop thread"){
            for(int i=0;i<100;i++){

                            try {
                                int data =st.pop();
                                System.out.println(Thread.currentThread().getName()+" "+st.top);
                            } catch (Exception e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                            }
                        }
                    }
    }
    public static void main(String[] args) {
        Stack st = new Stack(5);
        MultiThreading3 thread1 = new MultiThreading3("push thread", st);
        MultiThreading3 thread2 = new MultiThreading3("pop thread",st);
        thread1.start();
        thread2.start();
    }    
}
