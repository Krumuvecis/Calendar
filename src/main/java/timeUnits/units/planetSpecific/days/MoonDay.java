package timeUnits.units.planetSpecific.days;

import org.jetbrains.annotations.NotNull;

import timeUnits.units.planetSpecific.PlanetSpecificTimeUnitEnum;

//TODO: add javadocs
public final class MoonDay extends PlanetaryDay {
    //
    public MoonDay() {
        super("Moon");
    }

    //
    @Override
    public @NotNull PlanetSpecificTimeUnitEnum getClassEnum() {
        return PlanetSpecificTimeUnitEnum.MOON_DAY;
    }
}