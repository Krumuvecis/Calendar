package timeUnits.units.planetSpecific.years;

import org.jetbrains.annotations.NotNull;
import timeUnits.units.planetSpecific.PlanetSpecificTimeUnitEnum;

//TODO: add javadocs
public final class VenusYear extends PlanetaryYear {
    //
    public VenusYear() {
        super("Venus tropical years", "Venus years");
    }

    //
    @Override
    public @NotNull PlanetSpecificTimeUnitEnum getClassEnum() {
        return PlanetSpecificTimeUnitEnum.VENUS_YEAR;
    }
}