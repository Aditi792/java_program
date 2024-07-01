
public  class test_thread extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        test_thread t1 = new  test_thread();
        test_thread t2 = new test_thread();
        t1.start();
        t2.start();

        System.out.println("Priority of thread1 is : "+ t1.getPriority());
        System.out.println("Priority of thread2 is : "+ t2.getPriority());
    }
}
