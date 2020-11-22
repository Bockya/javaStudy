package calendar;

import java.util.Scanner;

public class Prompt {
    private final static String PROMPT = "cal> ";

    public void runPrompt() {
        //숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
        Scanner sc = new Scanner(System.in);
        Calendar c = new Calendar();
        int month = 1;
        while (true) {
            System.out.println("달을 입력하세요");
            System.out.print(PROMPT);
            month = sc.nextInt();
            if (month == -1) break;
            if (month > 12) continue;
            c.printCalendar(2020, month);
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
