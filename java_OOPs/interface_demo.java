

interface A{                 // interface is actually a abstract class

    int age=22;             // In interface al the instance variable are FInal and static variable by default
    String name = "Aditi";

    void show();           // all the method in interface are by default abstract method
    void config();
}

interface B extends A{      // like class inheritance concept accept in interface also.
    void data();
}

class C implements B{        // from class to interface we use implements keywords to take their methods 

    public void show() {
        System.out.println("In show");
    }

    public void config() {
        System.out.println("In Config");
        
    }
    public void data() {
        System.out.println("In data");
        
    }
    
}


public class interface_demo{
    public static void main(String[] args) {
        
        A obj = new C();
        obj.show();
        obj.config();
        // obj.data();     it gives error because data method didn't declare in A 

        B obj1 = new C();
        obj1.data();
        obj1.config();    // we can use config here becasue B interface inherited from A , it go to upword.
    }
}
