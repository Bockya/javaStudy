import java.util.Random;

class season {
    public static void main(String[] args) {
        Random r = new Random();
        int month = r.nextInt(12) + 1;
        switch (month) {
            case 3, 4, 5 -> System.out.println("봄입니다");
            case 6, 7, 8 -> System.out.println("여름입니다");
            case 9, 10, 11 -> System.out.println("가을입니다");
            case 12, 1, 2 -> System.out.println("겨울입니다");
        }
    }
}
