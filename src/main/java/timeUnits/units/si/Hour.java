package timeUnits.units.si;

import org.jetbrains.annotations.NotNull;

//TODO: add javadocs
public final class Hour extends SITimeUnit {
    //
    public Hour() {
        super("Hour", "h");
    }

    //
    @Override
    public @NotNull SITimeUnitEnum getClassEnum() {
        return SITimeUnitEnum.HOUR;
    }
}