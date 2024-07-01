import java.io.Console;

public class password {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.println("password : ");
        char[] n = c.readPassword();
        String sr = String.valueOf(n);
        System.out.println("pasword is : "+ sr);
    }
}
