//Byte 단위 입출력
//파일을 1byte씩 읽어들여 파일에 1byte씩 저장하는 프로그램
package javaIO.exam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteIOExam1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis(); //수행시간 확인
        FileInputStream fis = null; //파일로부터 읽어오기 위한 객체
        FileOutputStream fos = null; //파일에 쓸 수 있게 해주는 객체
        try {
            fis = new FileInputStream("src/javaIO/exam/ByteIOExam1.java");
            fos = new FileOutputStream("byte.txt"); //프로젝트 밑에 생성

            int readData = -1; //읽어들였을 때 값을 담기 위한 변수
            while ((readData = fis.read()) != -1) //파일이 끝날 때까지 한 바이트씩 readData에 넣음
                fos.write(readData);
        } catch (Exception e) {
            e.printStackTrace();
        } finally { //반드시 닫아주기
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime); //실행시간
    }
}
