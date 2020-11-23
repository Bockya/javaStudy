package AWT;

import java.awt.*;

public class ButtonTest2 {
    public static void main(String[] args) {
        Frame f = new Frame("Login");
        f.setSize(300, 200);
        f.setLayout(null); //레이아웃 매니저의 설정을 해제한다

        Button b = new Button("확 인"); //Button 위에 "확인"이라는 글자가 나타난다
        b.setSize(100, 50); //Button 크기를 설정한다
        b.setLocation(100,75);

        f.add(b); // 생성된 Button을 Frame에 포함시킨다
        f.setVisible(true);
    }
}
