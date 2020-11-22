package calendar;

public class Calendar {
    private final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private final int[] LEAP_MAX_DAYS = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public int getMaxDaysofMonth(int year, int month) {
        if (isLeapYear(year))
            return LEAP_MAX_DAYS[month - 1];
        else
            return MAX_DAYS[month - 1];
    }

    public void printCalendar(int year, int month, int weekday) {
        System.out.printf("    <<%4d년 %2d월>>\n", year, month);
        System.out.println(" SU MO TU WE TH FR SA");
        System.out.println("----------------------");
        //print blank space
        for (int i = 0; i < weekday; i++)
            System.out.print("   ");
        int maxDay = getMaxDaysofMonth(year, month);
        int cnt = 7 - weekday;
        int dlm = (cnt < 7) ? cnt : 0;
        //print first line
        for (int i = 1; i <= cnt; i++)
            System.out.printf("%3d", i);
        System.out.println();
        //print from second line to last
        cnt++;
        for (int i = cnt; i <= maxDay; i++) {
            System.out.printf("%3d", i);
            if (i % 7 == dlm)
                System.out.println();
        }
        System.out.println();
        System.out.println();
    }
}
