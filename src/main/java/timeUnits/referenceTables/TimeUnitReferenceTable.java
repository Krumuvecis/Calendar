package timeUnits.referenceTables;

import org.jetbrains.annotations.NotNull;

import unitConversion.referancableUnits.UnitReferenceTable;

import timeUnits.TimeUnitEnumInterface;
import timeUnits.TimeUnit;

//For referencing time unit instances
//TODO: add javadocs
public abstract class TimeUnitReferenceTable<K extends TimeUnitEnumInterface, T extends TimeUnit<K>>
        extends UnitReferenceTable<K, T> {
    //
    protected TimeUnitReferenceTable() {
        super();
    }

    //
    @Override
    public @NotNull Class<? extends T> getClassByEnum(@NotNull K e) {
        return super.getClassByEnum(e);
    }
}