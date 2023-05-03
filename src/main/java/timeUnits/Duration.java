package timeUnits;

import org.jetbrains.annotations.NotNull;

import unitConversion.referancableUnits.UndefinedEnumReferenceException;
import unitConversion.convertibleUnits.ConvertibleUnitValue;
import timeUnits.referenceTables.UndefinedEnumTypeException;

//TODO: add javadocs
public class Duration extends ConvertibleUnitValue<TimeUnitEnumInterface, TimeUnit<? extends TimeUnitEnumInterface>> {

    public Duration(double value, @NotNull TimeUnitEnumInterface unit) {
        this(value, TimeUnitReferences.findClassByEnum(unit));
    }

    //
    public Duration(double value,
                    @NotNull Class<? extends TimeUnit<? extends TimeUnitEnumInterface>> unit) {
        super(value, unit);
    }
}