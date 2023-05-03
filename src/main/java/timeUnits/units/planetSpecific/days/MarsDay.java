package timeUnits.units.planetSpecific.days;

import org.jetbrains.annotations.NotNull;

import timeUnits.units.planetSpecific.PlanetSpecificTimeUnitEnum;

//TODO: add javadocs
public final class MarsDay extends PlanetaryDay {
    //
    public MarsDay() {
        super("Mars", "SOL");
    }

    //
    @Override
    public @NotNull PlanetSpecificTimeUnitEnum getClassEnum() {
        return PlanetSpecificTimeUnitEnum.MARS_DAY;
    }
}