package timeUnits.units.planetSpecific.days;

import org.jetbrains.annotations.NotNull;

import timeUnits.units.planetSpecific.PlanetSpecificTimeUnitEnum;

//TODO: add javadocs
public final class VenusDay extends PlanetaryDay {
    //
    public VenusDay() {
        super("Venus");
    }

    //
    @Override
    public @NotNull PlanetSpecificTimeUnitEnum getClassEnum() {
        return PlanetSpecificTimeUnitEnum.VENUS_DAY;
    }
}