package timeUnits.units.si;

import org.jetbrains.annotations.NotNull;

//TODO: add javadocs
public final class Second extends SITimeUnit {
    //
    public Second() {
        super("Second", "s");
    }

    //
    @Override
    public @NotNull SITimeUnitEnum getClassEnum() {
        return SITimeUnitEnum.SECOND;
    }
}