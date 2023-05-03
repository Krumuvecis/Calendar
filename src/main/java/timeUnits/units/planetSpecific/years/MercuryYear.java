package timeUnits.units.planetSpecific.years;

import org.jetbrains.annotations.NotNull;
import timeUnits.units.planetSpecific.PlanetSpecificTimeUnitEnum;

//TODO: add javadocs
public final class MercuryYear extends PlanetaryYear {
    //
    public MercuryYear() {
        super("Mercury tropical years", "Mercury years");
    }

    //
    @Override
    public @NotNull PlanetSpecificTimeUnitEnum getClassEnum() {
        return PlanetSpecificTimeUnitEnum.MERCURY_YEAR;
    }
}