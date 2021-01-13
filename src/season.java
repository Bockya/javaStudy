import java.util.Random;

class season {
    public static void main(String[] args) {
        Random r = new Random();
        int month = r.nextInt(12) + 1;
        switch (month){
            case 3: case 4: case 5:
                System.out.println("봄입니다");
                break;
            case 6: case 7: case 8:
                System.out.println("여름입니다");
                break;
            case 9: case 10: case 11:
                System.out.println("가을입니다");
                break;
            case 12: case 1: case 2:
                System.out.println("겨울입니다");
        }
    }
}
