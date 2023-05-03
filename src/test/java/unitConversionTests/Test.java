package unitConversionTests;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static consoleUtils.SimplePrinting.printLine;
import consoleUtils.stringTools.SeparatorString;

import unitConversion.convertibleUnits.NullUnitConversionException;
import timeUnits.*;
import timeUnits.units.si.*;

//TODO: finish this
public class Test {
    private static final @NotNull Duration @NotNull [] TESTABLE_DURATIONS = new Duration[] {
            new Duration(12, Minute.class),
            new Duration(12, SITimeUnitEnum.MINUTE),
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

    @SuppressWarnings({"DataFlowIssue", "unchecked"})
    private @Nullable TimeUnit<? extends TimeUnitEnumInterface> getUnitInstanceByClass(@NotNull Class<? extends TimeUnit<? extends TimeUnitEnumInterface>> unit) {
        return TimeUnitReferences.SI.getInstanceByClass((Class<? extends SITimeUnit>) unit);
    }

    /*private @Nullable TimeUnit<? extends TimeUnitEnumInterface> getUnitInstanceByEnum(@NotNull TimeUnitEnumInterface e) {
        return TimeUnitReferences.findClassByEnum(e);
    }*/


    private @NotNull String getUnitName(@NotNull Class<? extends TimeUnit<? extends TimeUnitEnumInterface>> unit) {
        @Nullable TimeUnit<? extends TimeUnitEnumInterface> instance = getUnitInstanceByClass(unit);
        if (instance == null) {
            return "null";
        } else {
            return instance.getName();
        }
    }

    private @NotNull String getUnitAbbreviation(@NotNull Class<? extends TimeUnit<? extends TimeUnitEnumInterface>> unit) {
        @Nullable TimeUnit<? extends TimeUnitEnumInterface> instance = getUnitInstanceByClass(unit);
        if (instance == null) {
            return "null";
        } else {
            return instance.getAbbreviation();
        }
    }

    private void printConverted(@NotNull Duration duration, @NotNull Class<? extends TimeUnit<? extends TimeUnitEnumInterface>> unit) {
        @NotNull String commonString = getUnitName(unit) + ": ";
        try {
            double convertedValue = duration.convert(unit, TimeUnitConversionTable.STATIC_TABLE);
            printLine(commonString + convertedValue + " " + getUnitAbbreviation(unit));
        } catch (NullUnitConversionException e) {
            printLine(commonString + e.getMessage());
        }
    }
}