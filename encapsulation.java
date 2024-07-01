
class Human{
     
    private int age = 23;
    private String name = "Aditi";


    public void setAge(int a){
        age = a;
        // this.age=a;
    }

    public int getAge(){
        return age;
    }

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }
    
}

public class encapsulation {
    public static void main(String[] args) {
        
        Human obj1 = new Human();
        Human obj2 = new Human();

        obj1.setAge(22);
        obj1.setName("Aditi");

        obj2.setAge(16);
        obj2.setName("Argho");

        System.out.println(obj1.getAge() + ":" + obj1.getName());
        System.out.println(obj2.getAge() + ":" + obj2.getName());
        System.out.println();
    }
}
