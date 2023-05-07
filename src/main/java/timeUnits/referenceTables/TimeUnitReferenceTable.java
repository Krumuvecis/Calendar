package timeUnits.referenceTables;

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
}