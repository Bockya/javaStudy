//다양한 타입의 출력
//try-with-resources: 사용한 자원을 자동으로 종료시켜주는 기능
package javaIO.exam;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class ByteIOExam3 {
    public static void main(String[] args) {
        //io객체 선언
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream("data.txt"));) {
            out.writeInt(100);
            out.writeBoolean(true);
            out.writeDouble(50.5);
            //io 객체 사용
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
