class Table{
    static synchronized public void printTable(int n){
        for(int i =1 ; i<=5 ;i++){
            System.out.println(n*i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class MyThread1 extends Thread{
    public void run(){  
        Table.printTable(5);  
    }   

}

class MyThread2 extends Thread{
    public void run(){  
        Table.printTable(10);  
    }   


}

public class static_synchronization {
    public static void main(String[] args) {    
        MyThread1 t1=new MyThread1();  
        MyThread2 t2=new MyThread2();  
        t1.start();  
        t2.start();  
    }
}
