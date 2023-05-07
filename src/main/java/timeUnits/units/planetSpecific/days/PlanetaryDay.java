package timeUnits.units.planetSpecific.days;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import timeUnits.units.planetSpecific.PlanetSpecificTimeUnit;

//TODO: add javadocs
public abstract class PlanetaryDay extends PlanetSpecificTimeUnit {
    private static final @NotNull String NAME_SUFFIX = " day", ABBREVIATION_SUFFIX = NAME_SUFFIX + "s";

    //
    protected PlanetaryDay(@NotNull String planetName) {
        this(null, planetName);
    }

    //
    protected PlanetaryDay(@Nullable String abbreviation, @NotNull String planetName) {
        super(abbreviation, ABBREVIATION_SUFFIX, planetName, NAME_SUFFIX);
    }
}