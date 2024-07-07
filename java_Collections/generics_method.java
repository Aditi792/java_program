
class gendisplay{
    public <T> void genDisplay( T obj1){  //generic methood without generic class
        System.out.println(obj1);
    }
}


public class generics_method {

    static <T> void genMethod(T obj){   // genericmethod
        System.out.println(obj);
    }
    public static void main(String[] args) {
        genMethod(11);
        genMethod("hi Aditi");

        gendisplay gm = new gendisplay(); // as class is not generic type so, we create object as normal way
        gm.genDisplay(23);
    }
}
