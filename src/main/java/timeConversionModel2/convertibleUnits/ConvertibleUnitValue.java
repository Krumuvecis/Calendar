package timeConversionModel2.convertibleUnits;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import timeConversionModel2.mathOperations.SingleCoefficientOperation;

//TODO: add javadocs
public class ConvertibleUnitValue<T extends ConvertibleUnit> {
    double value;
    @NotNull Class<? extends T> unit;

    public ConvertibleUnitValue(double value, @NotNull Class<? extends T> unit) {
        this.value = value;
        this.unit = unit;
    }

    public final double getValue() {
        return value;
    }

    public final @NotNull Class<? extends T> getUnit() {
        return unit;
    }

    public final double convert(@NotNull Class<? extends T> unit,
                                @NotNull UnitConversionTable<T> conversionTable)
            throws NullUnitConversionException {
        @Nullable SingleCoefficientOperation conversion = conversionTable.getConversion(this.unit, unit);
        if (conversion == null) {
            throw new NullUnitConversionException();
        } else {
            return conversion.calculate(value);
        }
    }
}
