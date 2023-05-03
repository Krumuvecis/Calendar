package calendar;

import java.util.Map;
import java.util.HashMap;

import org.jetbrains.annotations.NotNull;

public class Months {

    static final @NotNull Year
            STANDARD_YEAR = new Year(false),
            LEAP_YEAR = new Year(true);

    static class Year {
        private static final int FIRST_MONTH_INDEX = 1;

        Map<Integer, Month> months;

        Year(int number) {
            this(LeapYearCalculator.isLeapYear(number));
        }

        Year(boolean leapYear) {
            months = new HashMap<>() {{
                put(1, new January());
                put(2, new February(leapYear));
                put(3, new March());
                put(4, new April());
                put(5, new May());
                put(6, new June());
                put(7, new July());
                put(8, new August());
                put(9, new September());
                put(10, new October());
                put(11, new November());
                put(12, new December());
            }};
        }

        private int getMonthCount() {
            return months.keySet().size();
        }

        private void monthNumberCheck(int monthNumber) throws IndexOutOfBoundsException {
            if (monthNumber < FIRST_MONTH_INDEX || monthNumber > getMonthCount() + FIRST_MONTH_INDEX) {
                throw new IndexOutOfBoundsException();
            }
        }

        private @NotNull Month getMonth(int monthNumber) throws IndexOutOfBoundsException {
            monthNumberCheck(monthNumber);
            return months.get(monthNumber);
        }

        public @NotNull String getMonthName(int monthNumber) throws IndexOutOfBoundsException {
            return getMonth(monthNumber).getName();
        }

        public int getMonthLength(int monthNumber) throws IndexOutOfBoundsException {
            return getMonth(monthNumber).getLength();
        }
    }

    static class Month {
        private final @NotNull String name;
        private final int length;

        Month(@NotNull String name, int length) {
            this.name = name;
            this.length = length;
        }

        public @NotNull String getName() {
            return name;
        }

        public int getLength() {
            return length;
        }
    }

    static class January extends Month {
        January() {
            super("January", 31);
        }
    }

    static class February extends Month {
        private final boolean leapYear;

        February(boolean leapYear) {
            super("February", 28);
            this.leapYear = leapYear;
        }

        @Override
        public int getLength() {
            int leapYearDifference = 0;
            if (leapYear) {
                leapYearDifference++;
            }
            return super.getLength() + leapYearDifference;
        }
    }

    static class March extends Month {
        March() {
            super("March", 31);
        }
    }

    static class April extends Month {
        April() {
            super("April", 30);
        }
    }

    static class May extends Month {
        May() {
            super("May", 31);
        }
    }

    static class June extends Month {
        June() {
            super("June", 30);
        }
    }

    static class July extends Month {
        July() {
            super("July", 31);
        }
    }

    static class August extends Month {
        August() {
            super("August", 31);
        }
    }

    static class September extends Month {
        September() {
            super("September", 30);
        }
    }

    static class October extends Month {
        October() {
            super("October", 31);
        }
    }

    static class November extends Month {
        November() {
            super("November", 30);
        }
    }

    static class December extends Month {
        December() {
            super("December", 31);
        }
    }
}