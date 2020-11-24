import java.awt.*;

class FileDialogTest {
    public static void main(String[] args) {
        Frame f = new Frame("Parent");
        f.setSize(300, 200);

        FileDialog fileOpen = new FileDialog(f, "파일열기", FileDialog.LOAD);

        f.setVisible(true);
        fileOpen.setDirectory("C:\\Users\\HEE GYEONG\\IdeaProjects");
        fileOpen.setVisible(true);

        //파일을 선택한 다음, FileDialog의 열기 버튼을 누르면,
        //getFile()과 getDirectory()를 이용해서 파일이름과 위치한 디렉토리를 얻을 수 있음
        System.out.println(fileOpen.getDirectory() + fileOpen.getFile());
    }
}
