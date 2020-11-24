import java.awt.*;
import java.io.BufferedReader;

class BorderLayoutTest {
    public static void main(String[] args) {
        Frame f = new Frame("BorderLayoutTest");
        f.setSize(200,200);
        //Frame은 기본적으로 BorderLayout로 설정되어 있으므로 따로 설정하지 않아도 됨
        f.setLayout(new BorderLayout());
        Panel p = new Panel();
        Label south = new Label("South");
        f.add(p);
        f.add(south,"South");
        f.setVisible(true);
    }
}
