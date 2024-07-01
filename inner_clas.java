class A{

    public int marks;

    public void show(){
        System.out.println("In show");
    }

    class B{                                        // inner class of A 
        public void config(){
            System.out.println("In B config");
        }
    }

    static class C{                                 // inner static class of A 
        public void config1(){
            System.out.println("In C config ");
        }
    }
}

public class inner_clas {
    public static void main(String[] args) {
        
        A obj3 = new A();                   // normal object of A class
        obj3.show();

        A obj = new A(){                      // this is inner annoymous class , which didn't call the actual method of A class . it will override it.
            public void show(){
                System.out.println("THis is inner annonymous class");
            }
        };
        obj.show();

        A.B obj1 = obj.new B();         // for creating object of inner class we have to use outer class object. for reference we use (outer class.inner claass)
        obj1.config();

        A.C obj2 = new A.C();           // for creating object and take refenrence of static inner class we use (outer class . inner class)
        obj2.config1();
    }
}
