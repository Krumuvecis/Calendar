package timeUnits.units.planetSpecific.years;

import org.jetbrains.annotations.NotNull;

import timeUnits.units.planetSpecific.PlanetSpecificTimeUnit;

//TODO: add javadocs
public abstract class PlanetaryYear extends PlanetSpecificTimeUnit {
    //
    public PlanetaryYear(@NotNull String name, @NotNull String abbreviation) {
        super(name, abbreviation);
    }
}