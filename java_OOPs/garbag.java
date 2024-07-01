public class garbag {
    public void finalize(){
        System.out.println("Object is grabage collected");
    }
    public static void main(String[] args) {
        garbag g1 = new garbag();
        garbag g2 = new garbag();

        g1 = null;
        g2 = null;

        System.gc();
    }
}
