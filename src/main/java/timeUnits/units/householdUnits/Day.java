package timeUnits.units.householdUnits;

import org.jetbrains.annotations.NotNull;

//TODO: add javadocs
public final class Day extends HouseholdTimeUnit {
    //
    public Day() {
        super("d", "day", 'D');
    }

    //
    @Override
    public @NotNull HouseholdTimeUnitEnum getClassEnum() {
        return HouseholdTimeUnitEnum.DAY;
    }
}