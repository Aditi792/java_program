import java.io.FileInputStream;

public class input{
    public static void main(String[] args) {
        try{
        FileInputStream fin = new FileInputStream("F:\\java_program\\testout.txt");
        int i =0;
        if ((i = fin.read()) != -1){
            System.out.println((char)i);
        }
        
        fin.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}