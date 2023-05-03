package timeUnits.units.planetSpecific.days;

import org.jetbrains.annotations.NotNull;

import timeUnits.units.planetSpecific.PlanetSpecificTimeUnitEnum;

//TODO: add javadocs
public final class MercuryDay extends PlanetaryDay {
    //
    public MercuryDay() {
        super("Mercury");
    }

    //
    @Override
    public @NotNull PlanetSpecificTimeUnitEnum getClassEnum() {
        return PlanetSpecificTimeUnitEnum.MERCURY_DAY;
    }
}