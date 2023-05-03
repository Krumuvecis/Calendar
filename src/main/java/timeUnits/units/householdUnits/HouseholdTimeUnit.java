package timeUnits.units.householdUnits;

import org.jetbrains.annotations.NotNull;

import timeUnits.TimeUnit;

//TODO: add javadocs
public abstract class HouseholdTimeUnit extends TimeUnit<HouseholdTimeUnitEnum> {
    //
    public HouseholdTimeUnit(@NotNull String name, @NotNull String abbreviation) {
        super(name, abbreviation);
    }
}