package duration;

import org.jetbrains.annotations.NotNull;

import convertibleUnits.ConvertibleUnit;

import java.lang.reflect.InvocationTargetException;

//
public class Duration {
    @SuppressWarnings("FieldMayBeFinal")
    private double value;
    private final @NotNull Class<? extends ConvertibleUnit> unit;

    //
    public Duration(double value, @NotNull Class<? extends ConvertibleUnit> unit) {
        this.value = value;
        this.unit = unit;
    }

    //
    public double getValue() {
        return value;
    }

    //
    public @NotNull Class<? extends ConvertibleUnit> getUnit() {
        return unit;
    }

    //
    public final @NotNull ConvertibleUnit getUnitInstance() {
        return ConvertibleUnit.getNewInstance(getUnit());
    }

    //
    public @NotNull String getUnitName() {
        return getUnitInstance().getName();
    }

    //
    public @NotNull String getUnitAbbreviation() {
        return getUnitInstance().getAbbreviation();
    }
}