package calendar;

/**
 * Leap year is when:
 *  * divisible by 4
 *  * except when divisible by 100
 *      * doesn't hold when divisible by 400
 */
public class LeapYears {
    public static boolean isLeapYear(int year) {
        return (isDivisibleBy4(year) && (!isDivisibleBy100(year) || isDivisibleBy400(year)));
    }

    private static boolean isDivisibleBy4(int number) {
        return isDivisible(number, 4);
    }

    private static boolean isDivisibleBy100(int number) {
        return isDivisible(number, 100);
    }

    private static boolean isDivisibleBy400(int number) {
        return isDivisible(number, 400);
    }

    private static boolean isDivisible(int dividend, int divisor) {
        return dividend % divisor == 0;
    }
}