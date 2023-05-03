package timeUnits.units.planetSpecific.years;

import org.jetbrains.annotations.NotNull;
import timeUnits.units.planetSpecific.PlanetSpecificTimeUnitEnum;

//TODO: add javadocs
public final class MarsYear extends PlanetaryYear {
    //
    public MarsYear() {
        super("Mars tropical years", "Mars years");
    }

    //
    @Override
    public @NotNull PlanetSpecificTimeUnitEnum getClassEnum() {
        return PlanetSpecificTimeUnitEnum.MARS_YEAR;
    }
}