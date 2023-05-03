package timeUnits.referenceTables;

import java.util.List;
import java.util.ArrayList;

import org.jetbrains.annotations.NotNull;

import timeUnits.units.householdUnits.*;

//TODO: add javadocs
public final class HouseholdTimeUnitReferenceTable
        extends TimeUnitReferenceTable<HouseholdTimeUnitEnum, HouseholdTimeUnit> {
    //
    public HouseholdTimeUnitReferenceTable() {
        super();
    }

    //
    @Override
    public @NotNull List<@NotNull Class<? extends HouseholdTimeUnit>> getInitialReferences() {
        return new ArrayList<>() {{
            add(Day.class);
            add(Week.class);
            add(Month.class);
            add(Year.class);
        }};
    }
}