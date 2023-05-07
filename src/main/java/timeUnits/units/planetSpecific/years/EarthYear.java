package timeUnits.units.planetSpecific.years;

import org.jetbrains.annotations.NotNull;

import timeUnits.units.planetSpecific.PlanetSpecificTimeUnitEnum;

//TODO: add javadocs
public final class EarthYear extends PlanetaryYear {
    //
    public EarthYear() {
        super("Earth");
    }

    //
    @Override
    public @NotNull PlanetSpecificTimeUnitEnum getClassEnum() {
        return PlanetSpecificTimeUnitEnum.EARTH_YEAR;
    }
}