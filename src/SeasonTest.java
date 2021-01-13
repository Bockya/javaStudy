import java.util.Random;

class SeasonTest {
    public static void main(String[] args) {
        Random r = new Random();
        int month = r.nextInt(12) + 1; // 1 ~ 12 랜덤
        String season = "";
        switch (month) {
            case 3, 4, 5 -> season = "봄";
            case 6, 7, 8 -> season = "여름";
            case 9, 10, 11 -> season = "가을";
            case 12, 1, 2 -> season = "겨울";
        }
        System.out.println(month + "월은 " + season + "입니다");
    }
}
