package timeUnits.units.planetSpecific;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import unitConversion.namedUnits.SimpleUnitNameInfo;

//TODO: finish this and add javadocs
public class PlanetSpecificTimeUnitNameInfo extends SimpleUnitNameInfo {
    private final @NotNull String abbreviation, name;
    private final char firstLetterCaps;

    //
    public PlanetSpecificTimeUnitNameInfo(@Nullable String abbreviation, @NotNull String abbreviationSuffix,
                                          @NotNull String planetName, @NotNull String nameSuffix) {
        super();
        this.abbreviation = prepareAbbreviation(abbreviation, planetName, abbreviationSuffix);
        name = prepareName(planetName, nameSuffix);
        firstLetterCaps = (planetName.toCharArray())[0];
    }

    private static @NotNull String prepareAbbreviation(@Nullable String abbreviation,
                                                       @NotNull String planetName, @NotNull String abbreviationSuffix) {
        return abbreviation == null ? prepareName(planetName, abbreviationSuffix) : abbreviation;
    }

    private static @NotNull String prepareName(@NotNull String planetName, @NotNull String nameSuffix) {
        return planetName + nameSuffix;
    }

    //
    @Override
    public final @NotNull String getAbbreviation() {
        return abbreviation;
    }

    /**
     * return in singular form
     *
     * @return
     */
    @Override
    public final @NotNull String getName() {
        return name;
    }

    //
    @Override
    public final char getFirstLetterCaps() {
        return firstLetterCaps;
    }
}