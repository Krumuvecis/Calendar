package timeUnitTests;

import static consoleUtils.SimplePrinting.printLine;
import consoleUtils.stringTools.SeparatorString;

import org.jetbrains.annotations.NotNull;

import convertibleUnits.ConvertibleUnit;
import convertibleUnits.unitConversion.NullUnitConversionException;

import duration.Duration;
import duration.TimeUnits;

//
public class DurationTest {
    private static final @NotNull String SEPARATOR = (new SeparatorString()).getString();

    //
    public static void main(String[] args) {
        new DurationTest(new Duration(1, TimeUnits.EarthTropicalYear.class));
    }

    private final @NotNull Duration duration;

    private DurationTest(@NotNull Duration duration) {
        this.duration = duration;
        printHeader();
        testUnit(TimeUnits.EarthTropicalYear.class);
        testUnit(TimeUnits.AverageMonth.class);
        testUnit(TimeUnits.Week.class);
        testUnit(TimeUnits.Day.class);
        testUnit(TimeUnits.Hour.class);
        testUnit(TimeUnits.Minute.class);
        testUnit(TimeUnits.Second.class);
    }

    private void printHeader() {
        printLine("Test duration: " + duration.getValue() + " " + duration.getUnitName());
        printLine(SEPARATOR);
    }

    private void testUnit(Class<? extends ConvertibleUnit> unit) {
        @NotNull ConvertibleUnit testUnitInstance = ConvertibleUnit.getNewInstance(unit);
        @NotNull String
                unitName = testUnitInstance.getName(),
                commonString = unitName + ": ";
        try {
            double convertedValue = duration.getUnitInstance().convert(duration.getValue(), unit);
            @NotNull String unitAbbreviation = testUnitInstance.getAbbreviation();
            printLine(commonString + convertedValue + " " + unitAbbreviation);
        } catch (NullUnitConversionException e) {
            printLine(commonString + e.getMessage());
        }
    }
}