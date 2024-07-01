
import java.awt.*;

class HelloJava extends applet {
    public void paint(Graphics g) {
        g.drawString("Helllo java", 10, 100);
    }
}

public class applet {
    public static void main(String[] args) {
            HelloJava obj = new HelloJava();
            obj.paint(null);
    }
}
