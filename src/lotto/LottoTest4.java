package lotto;

import java.util.Arrays;
import java.util.Random;

public class LottoTest4 {
    public static void main(String[] args) {
        final int MAX_NUMBER = 45;
        int[] numbers = new int[MAX_NUMBER];

        // 1 ~ 45의 숫자를 생성한 수 배열에 입력
        for (int i = 0; i < MAX_NUMBER; i++)
            numbers[i] = i + 1;

        Random r = new Random();
        int[] lottoNums = new int[6];
        for (int i = 0; i < 6; i++) {
            int seq = r.nextInt(MAX_NUMBER - i);
            // 생성된 숫자를 결과 배열에 저장
            lottoNums[i] = numbers[seq];
            // 배열에 저장된 숫자 위치 변경
            numbers[seq] = numbers[MAX_NUMBER - i - 1];
        }
        System.out.println(Arrays.toString(lottoNums));
    }
}
