//char 단위 입출력(console)
//키보드로부터 한 줄 입력 받아서 콘솔에 출력
package javaIO.exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharIOExam1 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //키보드로 입력받은 문자열을 저장하기 위해 line변수를 선언
        String line = null;
        try {
            line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //콘솔에 출력
        System.out.println(line);
    }
}
