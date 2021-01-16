package lotto;

import java.util.Arrays;
import java.util.Random;

class LottoTest3 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] lotto = new int[6];
        boolean[] check = new boolean[45 + 1]; // 나온 숫자인지 체크
        lotto[0] = r.nextInt(45) + 1;
        check[lotto[0]] = true;
        for (int i = 0; i < 6; i++) {
            while (true) {
                int num = r.nextInt(45) + 1;
                if (check[num]) continue;
                check[num] = true;

                // 중복된 숫자 방지
                lotto[i] = num;
                break;
            }
        }
        System.out.println(Arrays.toString(lotto));
    }
}
