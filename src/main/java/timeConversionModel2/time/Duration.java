package timeConversionModel2.time;

import org.jetbrains.annotations.NotNull;

import timeConversionModel2.convertibleUnits.ConvertibleUnitValue;

//
public class Duration extends ConvertibleUnitValue<TimeUnit> {
    //
    public Duration(double value, @NotNull Class<? extends TimeUnit> unit) {
        super(value, unit);
    }
}