package calendar;

import java.util.Scanner;

public class Prompt {
    public void printMenu() {
        System.out.println("+-------------+");
        System.out.println("| 1. 일정 등록");
        System.out.println("| 2. 일정 검색");
        System.out.println("| 3. 달력 보기");
        System.out.println("| h. 도움말");
        System.out.println("| q. 종료");
        System.out.println("+------------+");
    }

    public void runPrompt() {
        printMenu();
        Scanner sc = new Scanner(System.in);
        Calendar cal = new Calendar();
        boolean isLoop = true;
        while (isLoop) {
            System.out.println("명령: 1, 2, 3, h, q");
            String cmd = sc.next();
            switch (cmd) {
                case "1":
                    cmdRegister(sc, cal);
                    break;
                case "2":
                    cmdSearch(sc, cal);
                    break;
                case "3":
                    cmdCal(sc, cal);
                    break;
                case "h":
                    printMenu();
                    break;
                case "q":
                    break;
                default:
                    isLoop = false;
                    System.out.println("잘못된 입력입니다");
            }
        }
        System.out.println("Thank you. Bye~");
        sc.close();
    }

    private void cmdCal(Scanner sc, Calendar c) { //call by reference
        int year;
        int month;
        System.out.println("년도를 입력하세요");
        System.out.print("YEAR> ");
        year = sc.nextInt();
        System.out.println("달을 입력하세요");
        System.out.print("MONTH> ");
        month = sc.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("잘못된 입력입니다");
            return;
        }
        c.printCalendar(year, month);
    }

    private void cmdSearch(Scanner sc, Calendar cal) {
        System.out.println("[일정 검색]");
        System.out.println("날짜를 입력해 주세요 (yyyy-MM-dd)");
        String date = sc.next();
        String plan = cal.searchPlan(date);
        System.out.println(plan);
    }

    private void cmdRegister(Scanner sc, Calendar cal) {
        System.out.println("[새 일정 등록]");
        System.out.println("날짜를 입력해 주세요 (yyyy-MM-dd)");
        String date = sc.next();
        System.out.println("일정을 입력해 주세요");
        sc.nextLine(); //엔터 버퍼 제거
        String txt = sc.nextLine();
        System.out.println(txt);
        cal.registerPlan(date, txt);
    }

    public static void main(String[] args) {
        //셸 실행
        Prompt p = new Prompt();
        p.runPrompt();
    }
}


