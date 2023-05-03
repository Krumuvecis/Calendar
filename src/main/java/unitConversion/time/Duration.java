package unitConversion.time;

import org.jetbrains.annotations.NotNull;

import unitConversion.convertibleUnits.ConvertibleUnitValue;

//TODO: add javadocs
public class Duration extends ConvertibleUnitValue<TimeUnit> {
    //
    public Duration(double value, @NotNull Class<? extends TimeUnit> unit) {
        super(value, unit);
    }
}