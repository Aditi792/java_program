class A{
    public void show(){
        System.out.println("I am in A");
    }
}
class B extends A{
    public void show(){
        System.out.println("I am in B");
    }
}
class C extends A{
    public void show(){
        System.out.println("I am in C");
    }
}


public class polymorphism {
    public static void main(String[] args) {

        A obj = new A();
        obj.show();

        obj = new B();      // polymorohism.... same object act differently in different class
        obj.show();

        obj = new C();
        obj.show();

    }
}
