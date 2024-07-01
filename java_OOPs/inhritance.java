
class A{

    public A(){
        System.out.println("In A");
    }

    public A(int n){
        this();
        System.out.println("In A int");
    }
}
class B extends A{
    public B(){
        super(9); // super , call or execute the constructor of the super/parent class
        System.out.println("In B");
    }

    public B(int n){
        this();  // this , call or execute the constructor of the same class
        System.out.println("In B int");
    }
}

public class inhritance {
    public static void main(String[] args) {
         
        new B(5);
    }
}
