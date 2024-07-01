public class try_catch {
    public static void main(String[] args) {
        try{
            //code 
            try {
                int n = 5;
                int n1 = n/0;
                System.out.println(n1);
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic exception occure : not divide by 0");
            }

            try {
                int a[]=new int[5];
                a[10]=60;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array out of bound exception occure");
            }
            System.out.println("other statement");    
    }
    catch (Exception e){
        System.out.println("Exception occure.");
    }
    finally{
        System.out.println("This is finally block......always run");
    }

    System.out.println("Normal flow.....");
  }
}
