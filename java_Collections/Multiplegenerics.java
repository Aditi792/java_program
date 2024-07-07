class dgenerics < T, U>{
    T obj1; // references
    U obj2;

    dgenerics (T obj1 ,U obj2 ) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void display(){
        System.out.print(obj1);
        System.out.println(obj2);
    }
}


public class Multiplegenerics {
    public static void main(String[] args) {
        dgenerics < String ,Integer > obj = new dgenerics <String,Integer> ("My Roll is : ",12);
        obj.display();
    }
}
