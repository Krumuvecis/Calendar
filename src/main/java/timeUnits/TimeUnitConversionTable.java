package timeUnits;

import org.jetbrains.annotations.NotNull;

import unitConversion.mathOperations.particularOperations.Multiplication;
import unitConversion.convertibleUnits.UnitConversionTable;
import timeUnits.units.*;

//TODO: add javadocs
public class TimeUnitConversionTable extends UnitConversionTable<TimeUnit> {
    //
    public static final @NotNull TimeUnitConversionTable STATIC_TABLE = new TimeUnitConversionTable();

    private TimeUnitConversionTable() {
        super();
        addConversion(
                Minute.class, Second.class,
                new Multiplication(60));
        addConversion(
                Hour.class, Minute.class,
                new Multiplication(60));
    }
}