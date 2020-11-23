package AWT;

import java.awt.*;

public class FrameTest {
    public static void main(String[] args) {
        Frame f = new Frame("Login"); //Frame 객체를 생성한다
        f.setSize(300, 200); //Frame 크기를 설정한다
        f.setVisible(true); //생성한 Frame 화면에 보이도록 한다
    }
}
