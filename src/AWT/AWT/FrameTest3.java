package AWT;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameTest3 {
    public static void main(String[] args) {
        Frame f = new Frame("Login"); // Frame 객체를 생성한다
        f.setSize(300, 200); // Frame 크기를 설정한다

        //EventHandler 클래스 객체를 생성해서 Frame의 WindowListener로 등록한다
        f.addWindowListener(new EventHanler());
        f.setVisible(true); // 생성한 Frame을 화면에 보이도록 한다
    }
}

class EventHanler implements WindowListener{
    public void windowOpened(WindowEvent e){} //윈도우가 열렸을 때
    public void windowClosing(WindowEvent e){ //닫기 버튼을 눌렀을 때
        e.getWindow().setVisible(false); //Frame을 화면에서 보이지 않도록 하고
        e.getWindow().dispose(); //메모리에서 제거한다
        System.exit(0); //프로그램을 종료한다
    }
    // EventHandler 클래스는 WindowListener 인터페이스를 구현해야하므로
    // WindowListener 인터페이스에 정의되어 있는 모든 추상 메서드의 몸통(body) 부분을 만들어 주어야 한다

    // 따라서 아무 내용 없는 메서드 구현
    public void windowClosed(WindowEvent e){} // 윈도우가 닫혔을 때(dispose()가 호출되었을 때
    public void windowIconified(WindowEvent e){} //윈도우가 최소화(아이콘화)되었을 때
    public void windowDeiconified(WindowEvent e){} // 윈도우가 최소화 상태에서 다시 원래 크기로 되었을 때
    public void windowActivated(WindowEvent e){} // 윈도우가 활성화 되었을 때
    public void windowDeactivated(WindowEvent e){} //윈동우가 비활성화 되었을 때
}