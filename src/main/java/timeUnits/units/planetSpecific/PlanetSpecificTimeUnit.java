package timeUnits.units.planetSpecific;

import org.jetbrains.annotations.NotNull;

import timeUnits.TimeUnit;

//TODO: add javadocs
public abstract class PlanetSpecificTimeUnit extends TimeUnit<PlanetSpecificTimeUnitEnum> {
    //
    public PlanetSpecificTimeUnit(@NotNull String name, @NotNull String abbreviation) {
        super(name, abbreviation);
    }
}