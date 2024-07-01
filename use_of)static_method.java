

class Mobile{
    String name;
    int price;
    static String type;
    
    public static void data(Mobile obj){
        System.out.println( obj.name + ":" + obj.price + ":" + type);
    }
    
}
class HelloWorld {
    public static void main(String[] args) {
         Mobile obj1 = new Mobile();
         obj1.name = "Samsung";
         obj1.price = 14000;
         Mobile.type = "phone";
         
         Mobile obj2 = new Mobile();
         obj2.name = "Apple";
         obj2.price = 20000;
         Mobile.type = "phone";
         
         Mobile.data(obj1);
         Mobile.data(obj2);
    }
}