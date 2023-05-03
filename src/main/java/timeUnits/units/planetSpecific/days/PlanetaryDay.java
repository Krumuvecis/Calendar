package timeUnits.units.planetSpecific.days;

import java.util.Objects;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import timeUnits.units.planetSpecific.PlanetSpecificTimeUnit;

//TODO: add javadocs
public abstract class PlanetaryDay extends PlanetSpecificTimeUnit {
    private static final @NotNull String COMMON_SUFFIX = " days";

    //
    public PlanetaryDay(@NotNull String planetName) {
        this(planetName, null);
    }

    //
    public PlanetaryDay(@NotNull String planetName, @Nullable String abbreviation) {
        super(prepareName(planetName), Objects.requireNonNullElse(abbreviation, prepareAbbreviation(planetName)));
    }

    private static @NotNull String prepareName(@NotNull String planetName) {
        return planetName + COMMON_SUFFIX;
    }

    private static @NotNull String prepareAbbreviation(@NotNull String planetName) {
        return prepareName(planetName);
    }
}