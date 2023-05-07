package timeUnits.units.householdUnits;

import org.jetbrains.annotations.NotNull;

//TODO: add javadocs
public final class Month extends HouseholdTimeUnit {
    //
    public Month() {
        super("M", "month", 'M');
    }

    //
    @Override
    public @NotNull HouseholdTimeUnitEnum getClassEnum() {
        return HouseholdTimeUnitEnum.MONTH;
    }
}