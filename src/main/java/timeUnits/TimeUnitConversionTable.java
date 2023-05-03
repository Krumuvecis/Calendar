package timeUnits;

import org.jetbrains.annotations.NotNull;

import unitConversion.mathOperations.particularOperations.Multiplication;
import unitConversion.convertibleUnits.UnitConversionTable;
import timeUnits.units.si.*;

//TODO: finish this and add javadocs
public class TimeUnitConversionTable extends UnitConversionTable<TimeUnit<? extends TimeUnitEnumInterface>> {
    //
    public static final @NotNull TimeUnitConversionTable STATIC_TABLE = new TimeUnitConversionTable();

    private TimeUnitConversionTable() {
        super();
        addSIUnits();
        addPlanetSpecificUnits();
        addHouseholdUnits();
    }

    private void addSIUnits() {
        addConversion(
                Minute.class, Second.class,
                new Multiplication(60));
        addConversion(
                Hour.class, Minute.class,
                new Multiplication(60));
    }

    private void addPlanetSpecificUnits() {
        //TODO: add planet-specific unit conversions here
    }

    private void addHouseholdUnits() {
        //TODO: add household unit conversions here
    }
}