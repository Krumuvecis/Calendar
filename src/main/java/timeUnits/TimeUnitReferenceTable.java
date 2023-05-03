package timeUnits;

import org.jetbrains.annotations.NotNull;

import unitConversion.referancableUnits.UnitReferenceTable;
import timeUnits.units.*;

//For referencing time unit instances
//TODO: add javadocs
public class TimeUnitReferenceTable extends UnitReferenceTable<TimeUnit> {
    //
    public static final @NotNull TimeUnitReferenceTable STATIC_TABLE = new TimeUnitReferenceTable();

    private TimeUnitReferenceTable() {
        super();
        addReference(Second.class);
        addReference(Minute.class);
        addReference(Hour.class);
    }
}