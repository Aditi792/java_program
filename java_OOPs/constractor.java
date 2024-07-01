
class Sum{

    int num1,num2,result;

    public Sum() {
        num1 = 12;
        num2 = 15;
    }

    public Sum(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
 
    
}

public class constractor {
    public static void main(String[] args) {
        Sum obj = new Sum();
        Sum obj1 = new Sum(23,26);
        System.out.println("This is defult constructor call " + obj.num1 + " and " + obj.num2);
        System.out.println("This is parametarized constructor call " +obj1.num1 + " and " + obj1.num2);
    }
}
