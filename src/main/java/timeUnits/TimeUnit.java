package timeUnits;

import org.jetbrains.annotations.NotNull;

import unitConversion.convertibleUnits.ConvertibleUnit;

//TODO: add javadocs
public abstract class TimeUnit<T extends TimeUnitEnumInterface> extends ConvertibleUnit<T> {
    //
    public TimeUnit(@NotNull String name, @NotNull String abbreviation) {
        super(name, abbreviation);
    }
}