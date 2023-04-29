package leapYearTest;

import org.jetbrains.annotations.NotNull;

import static consoleUtils.SimplePrinting.printLine;

import calendar.LeapYears;

//
public class LeapYearTest {
    private static final int @NotNull [] TEST_YEARS = new int[] {1996, 2000, 2001, 2100};

    //
    @SuppressWarnings("InstantiationOfUtilityClass")
    public static void main(String[] args) {
        for (int year : TEST_YEARS) {
            new LeapYearTest(year);
        }
    }

    private LeapYearTest(int year) {
        printLine("Year: " + year);
        if (LeapYears.isLeapYear(year)) {
            printLine("A leap year!");
        } else {
            printLine("Not a leap year.");
        }
        printLine(null);
    }
}