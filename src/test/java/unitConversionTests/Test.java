package unitConversionTests;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static consoleUtils.SimplePrinting.printLine;
import consoleUtils.stringTools.SeparatorString;

import unitConversion.convertibleUnits.NullUnitConversionException;
import timeUnits.*;
import timeUnits.units.*;

//TODO: finish this
public class Test {
    private static final @NotNull Duration @NotNull [] TESTABLE_DURATIONS = new Duration[] {
            new Duration(12, Minute.class),
            new Duration(36, Second.class),
            new Duration(0.5, Hour.class)
    };

    public static void main(String[] args) {
        for (@NotNull Duration duration : TESTABLE_DURATIONS) {
            new Test(duration);
        }
    }

    private Test(@NotNull Duration duration) {
        printLine(null);
        printLine("duration: " + duration.getValue() + " " + getUnitAbbreviation(duration.getUnit()));
        printLine(new SeparatorString().getString());
        printConverted(duration, Second.class);
        printConverted(duration, Minute.class);
        printConverted(duration, Hour.class);
        printLine(null);
    }

    private @Nullable TimeUnit getUnitInstance(@NotNull Class<? extends TimeUnit> unit) {
        return TimeUnitReferenceTable.STATIC_TABLE.getReference(unit);
    }

    private @NotNull String getUnitName(@NotNull Class<? extends TimeUnit> unit) {
        @Nullable TimeUnit unitInstance = getUnitInstance(unit);
        if (unitInstance == null) {
            return "null";
        } else {
            return unitInstance.getName();
        }
    }

    private @NotNull String getUnitAbbreviation(@NotNull Class<? extends TimeUnit> unit) {
        @Nullable TimeUnit unitInstance = getUnitInstance(unit);
        if (unitInstance == null) {
            return "null";
        } else {
            return unitInstance.getAbbreviation();
        }
    }

    private void printConverted(@NotNull Duration duration, @NotNull Class<? extends TimeUnit> unit) {
        @NotNull String commonString = getUnitName(unit) + ": ";
        try {
            double convertedValue = duration.convert(unit, TimeUnitConversionTable.STATIC_TABLE);
            printLine(commonString + convertedValue + " " + getUnitAbbreviation(unit));
        } catch (NullUnitConversionException e) {
            printLine(commonString + e.getMessage());
        }
    }
}