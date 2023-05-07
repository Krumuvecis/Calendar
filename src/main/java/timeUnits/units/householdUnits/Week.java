package timeUnits.units.householdUnits;

import org.jetbrains.annotations.NotNull;

//TODO: add javadocs
public final class Week extends HouseholdTimeUnit {
    //
    public Week() {
        super("w", "week", 'w');
    }

    //
    @Override
    public @NotNull HouseholdTimeUnitEnum getClassEnum() {
        return HouseholdTimeUnitEnum.WEEK;
    }
}