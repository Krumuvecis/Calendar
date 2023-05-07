package timeUnits;

import org.jetbrains.annotations.NotNull;

import unitConversion.convertibleUnits.ConvertibleUnit;
import unitConversion.namedUnits.UnitNameInfo;

//TODO: add javadocs
public abstract class TimeUnit<T extends TimeUnitEnumInterface> extends ConvertibleUnit<T> {
    //
    public TimeUnit(@NotNull UnitNameInfo nameInfo) {
        super(nameInfo);
    }
}