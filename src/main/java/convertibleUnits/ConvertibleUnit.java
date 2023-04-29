package convertibleUnits;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.HashMap;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import convertibleUnits.unitConversion.NullUnitConversionException;
import convertibleUnits.unitConversion.UnitConversionInterface;

//
public abstract class ConvertibleUnit extends NamedUnit {
    //
    public static ConvertibleUnit getNewInstance(@NotNull Class<? extends ConvertibleUnit> unit) {
        try {
            return unit.getDeclaredConstructor().newInstance();
        } catch (InstantiationException |
                 IllegalAccessException |
                 InvocationTargetException |
                 NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    private final @NotNull Map<@NotNull Class<? extends ConvertibleUnit>, @Nullable UnitConversionInterface>
            unitConversionTable = new HashMap<>();

    //
    public ConvertibleUnit(@NotNull String name, @NotNull String abbreviation) {
        super(name, abbreviation);
    }

    //
    public final void addUnitConversion(@NotNull Class<? extends ConvertibleUnit> unit, @Nullable UnitConversionInterface conversion) {
        if (unit != this.getClass() && !unitConversionTable.containsKey(unit)) {
            unitConversionTable.put(unit, conversion);
        }
    }

    private @Nullable UnitConversionInterface getUnitConversion(@NotNull Class<? extends ConvertibleUnit> unit) {
        return unitConversionTable.getOrDefault(unit, null);
    }

    //
    public final double convert(double value, @NotNull Class<? extends ConvertibleUnit> unit) throws NullUnitConversionException {
        @Nullable UnitConversionInterface conversion = getUnitConversion(unit);
        if (conversion == null) {
            //TODO: check for series of conversions
            throw new NullUnitConversionException();
        }
        return conversion.convert(value);
    }
}