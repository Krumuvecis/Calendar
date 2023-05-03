package timeUnits.referenceTables;

import java.util.List;
import java.util.ArrayList;

import org.jetbrains.annotations.NotNull;

import timeUnits.units.planetSpecific.*;
import timeUnits.units.planetSpecific.days.*;
import timeUnits.units.planetSpecific.years.*;

//TODO: add javadocs
public final class PlanetSpecificTimeUnitReferenceTable
        extends TimeUnitReferenceTable<PlanetSpecificTimeUnitEnum, PlanetSpecificTimeUnit> {
    //
    public PlanetSpecificTimeUnitReferenceTable() {
        super();
    }

    //
    @Override
    public @NotNull List<@NotNull Class<? extends PlanetSpecificTimeUnit>> getInitialReferences() {
        return new ArrayList<>() {
            {
                addYearReferences();
                addDayReferences();
            }

            private void addYearReferences() {
                add(MercuryYear.class);
                add(VenusYear.class);
                add(EarthYear.class);
                add(MarsYear.class);
            }

            private void addDayReferences() {
                add(MercuryDay.class);
                add(VenusDay.class);
                add(EarthDay.class);
                add(MoonDay.class);
                add(MarsDay.class);
            }
        };
    }
}