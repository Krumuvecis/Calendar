package timeUnits.units.householdUnits;

import org.jetbrains.annotations.NotNull;

import unitConversion.namedUnits.SimpleUnitNameInfo;
import timeUnits.TimeUnit;

//TODO: add javadocs
public abstract class HouseholdTimeUnit extends TimeUnit<HouseholdTimeUnitEnum> {
    //
    public HouseholdTimeUnit(@NotNull String abbreviation, @NotNull String name, char firstLetterCaps) {
        super(new SimpleUnitNameInfo() {
            //
            @Override
            public @NotNull String getAbbreviation() {
                return abbreviation;
            }

            //
            @Override
            public @NotNull String getName() {
                return name;
            }

            //
            @Override
            public char getFirstLetterCaps() {
                return firstLetterCaps;
            }
        });
    }
}