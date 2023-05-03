package timeUnits;

import org.jetbrains.annotations.NotNull;

import unitConversion.referancableUnits.UndefinedEnumReferenceException;
import timeUnits.units.si.SITimeUnitEnum;
import timeUnits.units.si.SITimeUnit;
import timeUnits.units.planetSpecific.*;
import timeUnits.units.householdUnits.HouseholdTimeUnitEnum;
import timeUnits.units.householdUnits.HouseholdTimeUnit;
import timeUnits.referenceTables.*;

//TODO: add javadocs
public class TimeUnitReferences {
    //
    public static final @NotNull TimeUnitReferenceTable<@NotNull SITimeUnitEnum, @NotNull SITimeUnit>
            SI = new SITimeUnitReferenceTable();

    //
    public static final @NotNull TimeUnitReferenceTable<@NotNull PlanetSpecificTimeUnitEnum, @NotNull PlanetSpecificTimeUnit>
            PLANET_SPECIFIC = new PlanetSpecificTimeUnitReferenceTable();

    //
    public static final @NotNull TimeUnitReferenceTable<@NotNull HouseholdTimeUnitEnum, @NotNull HouseholdTimeUnit>
            HOUSEHOLD = new HouseholdTimeUnitReferenceTable();

    //
    public static @NotNull Class<? extends TimeUnit<? extends TimeUnitEnumInterface>> findClassByEnum(@NotNull TimeUnitEnumInterface e) {
            //throws UndefinedEnumTypeException, UndefinedEnumReferenceException {
        if (e instanceof SITimeUnitEnum) {
            return SI.getClassByEnum((SITimeUnitEnum) e);
        } else if (e instanceof PlanetSpecificTimeUnitEnum) {
            return PLANET_SPECIFIC.getClassByEnum((PlanetSpecificTimeUnitEnum) e);
        } else if (e instanceof HouseholdTimeUnitEnum) {
            return HOUSEHOLD.getClassByEnum((HouseholdTimeUnitEnum) e);
        } else {
            throw new RuntimeException(new UndefinedEnumTypeException());
        }
        /*
        TableLookupInfo tableInfo = getReferenceTableByEnum(e);

        Class<? extends TimeUnitEnumInterface> c = tableInfo.c;
        return tableInfo.table.getClassByEnum(e);
         */
    }

    /*public static TimeUnit<? extends TimeUnitEnumInterface> findInstanceByEnum() {
        return null;
    }

    private static <K extends TimeUnitEnumInterface> TableLookupInfo getReferenceTableByEnum(@NotNull K e) {
        if (e instanceof SITimeUnitEnum) {
            return new TableLookupInfo(SI, SITimeUnitEnum.class);
        } else if (e instanceof PlanetSpecificTimeUnitEnum) {
            return new TableLookupInfo(PLANET_SPECIFIC, PlanetSpecificTimeUnitEnum.class);
        } else if (e instanceof HouseholdTimeUnitEnum) {
            return new TableLookupInfo(HOUSEHOLD, HouseholdTimeUnitEnum.class);
        } else {
            throw new RuntimeException(new UndefinedEnumTypeException());
        }
    }

    private static class TableLookupInfo {
        TimeUnitReferenceTable<
                ? extends TimeUnitEnumInterface,
                ? extends TimeUnit<? extends TimeUnitEnumInterface>> table;
        Class<? extends TimeUnitEnumInterface> c;

        TableLookupInfo(TimeUnitReferenceTable<
                                ? extends TimeUnitEnumInterface,
                                ? extends TimeUnit<? extends TimeUnitEnumInterface>> table,
                        Class<? extends TimeUnitEnumInterface> c) {
            this.table = table;
            this.c = c;
        }
    }*/
}