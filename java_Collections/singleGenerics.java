
class Generics<T> {
    T obj1;
    Generics(T obj1){
        this.obj1 = obj1;
    }
    public T display(T obj1){
        return this.obj1;
    }
}

public class singleGenerics <t> {
    public static void main(String[] args) {
        Generics <Integer> obj = new Generics<Integer>(10);
        System.out.println(obj.display(null));
        Generics <String> obj2 = new Generics<String>("Aditi");
        System.out.println(obj2.display(null));
    }
}
