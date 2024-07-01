
abstract class Car{   // abstarct method can only be defined in the abstract class . 

    public abstract void drive();  // a method which didn't have any body right now, may be it will implenet later ,then this method is called abstarct method
    public abstract void fly();

    public void play_music(){
        System.out.println("playing music...");
    }
}

class suzuki extends Car{

    public void drive() {           // inherited class from a abstract class must contain abstract method.
        System.out.println("start driving....");
    }
    
    public void fly(){
        System.out.println("car Flying...");
    }
}    




public class abstract_class {
    public static void main(String[] args) {
        
        //suzuki obj = new suzuki();  // it will run as it is not a abstract class
        //Car obj = new Car();  // we cannot creat any object of a abstract class
        Car obj = new suzuki(); // here object created by suzuki class , and refrence store in Car class, so we have to declare all the methods which are called by object.
        obj.drive();
        obj.play_music();
        obj.fly();
    }
}
