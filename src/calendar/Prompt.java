package calendar;

import java.util.Scanner;

public class Prompt {
    /**
     * @param week
     * @return 0 ~ 6 (0 = Sunday, 6 = Saturday)
     */
    public int parseDay(String week) {
        return switch (week) {
            case "일" -> 0;
            case "월" -> 1;
            case "화" -> 2;
            case "수" -> 3;
            case "목" -> 4;
            case "금" -> 5;
            case "토" -> 6;
            default -> 0;
        };
    }

    public void runPrompt() {
        //숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
        Scanner sc = new Scanner(System.in);
        Calendar c = new Calendar();
        int year;
        int month;
        int weekday;
        while (true) {
            System.out.println("년도를 입력하세요 (exit: -1)");
            System.out.print("YEAR> ");
            year = sc.nextInt();
            if (year == -1) break;
            System.out.println("달을 입력하세요");
            System.out.print("MONTH> ");
            month = sc.nextInt();
            System.out.println("첫째 날의 요일을 입력하세요(일, 월, 화, 수, 목, 금, 토)");
            String str_weekday = sc.next();
            weekday = parseDay(str_weekday);
            if (month < 1 || month > 12){
                System.out.println("잘못된 입력입니다");
                continue;
            }
            c.printCalendar(year, month, weekday);
        }
        System.out.println("Bye~");
        sc.close();
    }

    public static void main(String[] args) {
        //셸 실행
        Prompt p = new Prompt();
        p.runPrompt();
    }
}
