//Byte 단위 입출력 심화
//파일을 512byte씩 읽어들여 파일에 512byte씩 저장하는 프로그램
package javaIO.exam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteIOExam2 {
    public static void main(String[] args) {
        //메소드가 시작된 시간을 구하기 위함
        long startTime = System.currentTimeMillis(); //수행시간 확인
        FileInputStream fis = null; //파일로부터 읽어오기 위한 객체
        FileOutputStream fos = null; //파일에 쓸 수 있게 해주는 객체
        try {
            fis = new FileInputStream("src/javaIO/exam/ByteIOExam1.java");
            fos = new FileOutputStream("byte.txt"); //프로젝트 밑에 생성

            int readCount = -1; //읽어들인 수를 저장하기 위한 변수
            byte[] buffer = new byte[512]; //512byte만큼 읽어 들이기 위해 byte배열을 사용
            while ((readCount = fis.read(buffer)) != -1) //파일이 끝날 때까지 최대 512byte씩 readCount에 넣음
                fos.write(buffer, 0, readCount);
        } catch (Exception e) {
            e.printStackTrace();
        } finally { //반드시 닫아주기
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //메소드가 끝났을 때 시간을 구하기 위함
        long endTime = System.currentTimeMillis();
        //메소드를 수행하는데 걸리 시간을 구할 수 있음
        System.out.println(endTime - startTime); //실행시간
    }
}
