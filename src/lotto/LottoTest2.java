package lotto;

import java.util.Arrays;
import java.util.Random;

class LottoTest2 {
    public static void main(String[] args) {
        final int MAX_NUMBER = 45;
        int[] lotto = new int[6];
        Random r = new Random();
        lotto[0] = r.nextInt(MAX_NUMBER) + 1;

        outer:
        for (int i = 1; i < 6; i++) {
            int num = r.nextInt(MAX_NUMBER) + 1;
            for (int k = 0; k < i; k++) {
                // 중복된 숫자 방지
                if (lotto[k] == num) {
                    i--;
                    continue outer;
                }
            }
            lotto[i] = num;
        }
        System.out.println(Arrays.toString(lotto));
    }
}
