class thread_join_Example extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            try {
                Thread.sleep(500);
                System.out.println("current thread name is : " + Thread.currentThread().getName());

            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}

public class thread_join {
    public static void main(String[] args) {
        
        thread_join_Example th1 = new thread_join_Example();
        thread_join_Example th2 = new thread_join_Example();
        thread_join_Example th3 = new thread_join_Example();

        th1.start();
        try {
            System.out.println("current thread name is : " + Thread.currentThread().getName());
            th1.join(); 
        } catch (Exception e) {
            System.out.println("The exception has been caught " + e);  
        }

        th2.start();
        try {
            System.out.println("current thread name is : " + Thread.currentThread().getName());
            th1.join(); 
        } catch (Exception e) {
            System.out.println("The exception has been caught " + e);  
        }

        th3.start();
        try {
            System.out.println("current thread name is : " + Thread.currentThread().getName());
            th1.join(); 
        } catch (Exception e) {
            System.out.println("The exception has been caught " + e);  
        }


    }
}


