package timeUnits.units.si;

import org.jetbrains.annotations.NotNull;

import timeUnits.TimeUnit;

//TODO: add javadocs
public abstract class SITimeUnit extends TimeUnit<SITimeUnitEnum> {
    //
    SITimeUnit(@NotNull String name, @NotNull String abbreviation) {
        super(name, abbreviation);
    }
}