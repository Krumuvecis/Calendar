package timeUnits.units.si;

import org.jetbrains.annotations.NotNull;

//TODO: add javadocs
public final class Minute extends SITimeUnit {
    //
    public Minute() {
        super("min", "minute", 'M');
    }

    //
    @Override
    public @NotNull SITimeUnitEnum getClassEnum() {
        return SITimeUnitEnum.MINUTE;
    }
}