package unitConversion.time;

import org.jetbrains.annotations.NotNull;

import unitConversion.referancableUnits.UnitReferenceTable;

//
public class TimeUnitReferenceTable extends UnitReferenceTable<TimeUnit> {
    public static final @NotNull TimeUnitReferenceTable STATIC_TABLE = new TimeUnitReferenceTable();

    //
    private TimeUnitReferenceTable() {
        super();
        addReference(TimeUnit.Second.class);
        addReference(TimeUnit.Minute.class);
        addReference(TimeUnit.Hour.class);
    }
}