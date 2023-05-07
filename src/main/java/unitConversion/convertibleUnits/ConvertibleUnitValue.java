package unitConversion.convertibleUnits;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import bijection.ArgumentOutOfDomainException;
import bijection.SingleCoefficientOperation;
import unitConversion.referancableUnits.ReferenceEnumInterface;

//TODO: add javadocs; what about setters?
public abstract class ConvertibleUnitValue<
        K extends ReferenceEnumInterface,
        T extends ConvertibleUnit<? extends K>> {
    @SuppressWarnings("FieldMayBeFinal")
    private double value;
    @SuppressWarnings("FieldMayBeFinal")
    private @NotNull Class<? extends T> unit;

    //
    public ConvertibleUnitValue(double value, @NotNull Class<? extends T> unit) {
        this.value = value;
        this.unit = unit;
    }

    //
    public final double getValue() {
        return value;
    }

    //
    public final @NotNull Class<? extends T> getUnit() {
        return unit;
    }

    //
    public final double convert(@NotNull Class<? extends T> unit,
                                @NotNull UnitConversionTable<T> conversionTable)
            throws NullUnitConversionException {
        if (unit == this.unit) {
            return value;
        }
        @Nullable SingleCoefficientOperation conversion = conversionTable.getConversion(this.unit, unit);
        if (conversion == null) {
            throw new NullUnitConversionException();
        } else {
            try {
                return conversion.calculate(value);
            } catch (ArgumentOutOfDomainException e) {
                throw new RuntimeException(e);
            }
        }
    }
}