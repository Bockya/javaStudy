import java.util.Arrays;
import java.util.Random;

class LottoTest {
    public static void main(String[] args) {
        Random r = new Random();
        int[] lotto = new int[6];
        outer:
        for (int i = 0; i < lotto.length; i++) {
            int num = r.nextInt(45) + 1; // 1 ~ 45
            // 중복된 숫자 방지
            for (int j = 0; j < i; j++) {
                if (lotto[j] == num) {
                    i--;
                    continue outer;
                }
            }
            lotto[i] = num;
        }
        System.out.println(Arrays.toString(lotto));
    }
}
