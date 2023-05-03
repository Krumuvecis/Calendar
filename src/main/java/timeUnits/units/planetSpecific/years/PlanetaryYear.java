package timeUnits.units.planetSpecific.years;

import java.util.Objects;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import timeUnits.units.planetSpecific.PlanetSpecificTimeUnit;

//TODO: add javadocs
public abstract class PlanetaryYear extends PlanetSpecificTimeUnit {
    private static final @NotNull String
            COMMON_NAME_SUFFIX = " tropical years",
            COMMON_ABBREVIATION_SUFFIX = " years";

    //
    protected PlanetaryYear(@NotNull String planetName) {
        this(planetName, null);
    }

    //
    protected PlanetaryYear(@NotNull String planetName, @Nullable String abbreviation) {
        super(prepareName(planetName), Objects.requireNonNullElse(abbreviation, prepareAbbreviation(planetName)));
    }

    private static @NotNull String prepareName(@NotNull String planetName) {
        return planetName + COMMON_NAME_SUFFIX;
    }

    private static @NotNull String prepareAbbreviation(@NotNull String planetName) {
        return planetName + COMMON_ABBREVIATION_SUFFIX;
    }
}