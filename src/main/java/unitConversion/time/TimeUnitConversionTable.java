package unitConversion.time;

import org.jetbrains.annotations.NotNull;

import unitConversion.mathOperations.particularOperations.Multiplication;
import unitConversion.convertibleUnits.UnitConversionTable;

//TODO: add javadocs
public class TimeUnitConversionTable extends UnitConversionTable<TimeUnit> {
    public static final @NotNull TimeUnitConversionTable STATIC_TABLE = new TimeUnitConversionTable();

    //
    private TimeUnitConversionTable() {
        super();
        addConversion(
                TimeUnit.Minute.class, TimeUnit.Second.class,
                new Multiplication(60));
        addConversion(
                TimeUnit.Hour.class, TimeUnit.Minute.class,
                new Multiplication(60));
    }
}