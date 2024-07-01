@FunctionalInterface            // annonation

// interface A{
//     void add();
// }

interface B{
    void add(int i , int j);
}

public class functional_interface {
    public static void main(String[] args) {
        
        // A obj = new A(){
        //     public void add(){
        //         System.out.println("in add");     this is the normal way to declare annyonomous class of an interface
        //     }
        // };

        // A obj = () -> System.out.println("in add");    // this is lambda function 
        // obj.add();

        // B obj1 = new B(){
        //     public void add(int i,int j){
        //         System.out.println("Sum is " + (i+j));  // this the normal way of parameter 
        //     }
        // };
        // obj1.add(5,4);

        B obj1 = (i,j) -> System.out.println("Sum is " + (i+j));  // this is the lambda function og parameter interface methods
        obj1.add(5,4);

    }
}


// interface which have more than one method then it's called normal interface.
// interface which have only one method then it's called functional interface(SAM - Single Abstarct Method).
// interface which have no method then it's called marcer interface.
