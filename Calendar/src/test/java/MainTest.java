import calendar.LeapYears;

import static consoleUtils.SimplePrinting.printLine;

public class MainTest {
    public static void main(String[] args) {
        leapYearTest(1996);
        leapYearTest(2000);
        leapYearTest(2001);
        leapYearTest(2100);
    }

    private static void leapYearTest(int year) {
        printLine("Year: " + year);
        if (LeapYears.isLeapYear(year)) {
            printLine("A leap year!");
        } else {
            printLine("Not a leap year.");
        }
        printLine(null);
    }
}