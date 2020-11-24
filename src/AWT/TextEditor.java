import java.awt.*;

class TextEditor extends Frame {
    MenuBar mb;
    Menu mFile, mEdit;

    TextEditor(String title) {
        super(title);
        mb = new MenuBar();
        mFile = new Menu("File");
        mEdit = new Menu("Edit");

        mb.add(mFile);
        setMenuBar(mb);

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        TextEditor mainWin = new TextEditor("Text Editor");
    }

}
