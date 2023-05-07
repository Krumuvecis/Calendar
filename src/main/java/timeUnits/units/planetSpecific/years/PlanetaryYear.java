package timeUnits.units.planetSpecific.years;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import timeUnits.units.planetSpecific.PlanetSpecificTimeUnit;

//TODO: add javadocs
public abstract class PlanetaryYear extends PlanetSpecificTimeUnit {
    private static final @NotNull String
            ABBREVIATION_SUFFIX = " years",
            NAME_SUFFIX = " tropical year";

    //
    protected PlanetaryYear(@NotNull String planetName) {
        this(null, planetName);
    }

    //
    protected PlanetaryYear(@Nullable String abbreviation, @NotNull String planetName) {
        super(abbreviation, ABBREVIATION_SUFFIX, planetName, NAME_SUFFIX);
    }
}