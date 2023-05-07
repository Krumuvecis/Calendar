package timeUnits.units.householdUnits;

import org.jetbrains.annotations.NotNull;

//TODO: add javadocs
public final class Year extends HouseholdTimeUnit {
    //
    public Year() {
        super("y", "year", 'Y');
    }

    //
    @Override
    public @NotNull HouseholdTimeUnitEnum getClassEnum() {
        return HouseholdTimeUnitEnum.YEAR;
    }
}