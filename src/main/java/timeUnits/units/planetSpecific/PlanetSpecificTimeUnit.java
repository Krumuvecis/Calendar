package timeUnits.units.planetSpecific;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import timeUnits.TimeUnit;

//TODO: add javadocs
public abstract class PlanetSpecificTimeUnit extends TimeUnit<PlanetSpecificTimeUnitEnum> {
    //
    public PlanetSpecificTimeUnit(@Nullable String abbreviation, @NotNull String abbreviationSuffix,
                                  @NotNull String planetName, @NotNull String nameSuffix) {
        super(new PlanetSpecificTimeUnitNameInfo(abbreviation, abbreviationSuffix, planetName, nameSuffix));
    }
}