package calendar;

public class YearLength {
    private static final int STANDARD_YEAR_LENGTH = 365;
    static int getLength(int year) {
        if (LeapYearCalculator.isLeapYear(year)) {
            return STANDARD_YEAR_LENGTH + 1;
        } else {
            return STANDARD_YEAR_LENGTH;
        }
    }
}