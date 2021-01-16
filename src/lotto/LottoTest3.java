package lotto;

import java.util.Arrays;
import java.util.Random;

class LottoTest3 {
    public static void main(String[] args) {
        int[] ball = new int[45];
        for (int i = 0; i < ball.length; i++)
            ball[i] = i + 1;
        Random r = new Random();
        for (int i = 0; i < 1000; i++) {
            int idx = r.nextInt(ball.length);
            int tmp = ball[0];
            ball[0] = ball[idx];
            ball[idx] = tmp;
        }
        System.out.println(Arrays.toString(Arrays.copyOfRange(ball, 0, 6)));
    }
}
