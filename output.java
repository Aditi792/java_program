import java.io.FileOutputStream;

public class output {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("F:\\java_program\\testout.txt");
            String s = "My name is Aditi";
            byte b[] = s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("Success...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
