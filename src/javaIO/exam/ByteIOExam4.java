//다양한 타입의 입력
//data.txt로부터 값을 읽어들여 화면에 출력
package javaIO.exam;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class ByteIOExam4 {
    public static void main(String[] args) {
        try(DataInputStream in = new DataInputStream(new FileInputStream("data.txt"));) {
            int i = in.readInt();
            boolean b = in.readBoolean();
            double d = in.readDouble();

            System.out.println(i);
            System.out.println(b);
            System.out.println(d);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
