//char 단위 입출력(file)
//파일에서 한 줄씩 입력 받아서 파일에 출력
package javaIO.exam;

import java.io.*;

public class CharIOExam2 {
    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter pw = null;
        try {
            //파일에서 한 줄씩 읽어들이기
            br = new BufferedReader(new FileReader("src/javaIO/exam/CharIOExam2.java"));
            //파일에 쓴 거 편리하게 출력하기
            pw = new PrintWriter(new FileWriter("test.txt"));
            String line = null;
            while ((line = br.readLine()) != null) { //한 줄씩 읽을 게 없을 때 까지
                pw.println(line); //편리하게 출력
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally { //반드시 닫아주기
            pw.close();
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
