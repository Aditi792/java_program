
import java.lang.Thread;

public class thread_sleep{
    public static void main(String[] args) {

        for(int i=0;i<5;i++){
            try {
                Thread.sleep(-1000);
                System.out.println(i);
            } catch (InterruptedException e) {
                System.out.println("This is exception : " + e );
            }
        }
    }
}
