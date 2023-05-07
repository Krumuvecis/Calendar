package unitConversion.convertibleUnits;

import java.util.Map;
import java.util.HashMap;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import bijection.SingleCoefficientOperation;
import unitConversion.referancableUnits.ReferenceEnumInterface;

//TODO: add javadocs
public abstract class UnitConversionTable<T extends ConvertibleUnit<? extends ReferenceEnumInterface>> {
    //map<unit1, map<unit2, conversion>>
    private final @NotNull Map<
            @NotNull Class<? extends T>,
            @NotNull Map<
                    @NotNull Class<? extends T>,
                    @NotNull SingleCoefficientOperation>> conversionTable;

    //
    public UnitConversionTable() {
        conversionTable = new HashMap<>();
    }

    private boolean unitHasPrimaryKey(@NotNull Class<? extends T> unit1) {
        return conversionTable.containsKey(unit1);
    }

    private boolean directConversionDefined(@NotNull Class<? extends T> unit1,
                                            @NotNull Class<? extends T> unit2) {
        return unitHasPrimaryKey(unit1) && conversionTable.get(unit1).containsKey(unit2);
    }

    private @Nullable SingleCoefficientOperation getDirectConversion(@NotNull Class<? extends T> unit1,
                                                                     @NotNull Class<? extends T> unit2) {
        if (directConversionDefined(unit1, unit2)) {
            return conversionTable.get(unit1).get(unit2);
        } else {
            return null;
        }
    }

    //
    public @Nullable SingleCoefficientOperation getConversion(@NotNull Class<? extends T> unit1,
                                                              @NotNull Class<? extends T> unit2) {
        @Nullable SingleCoefficientOperation conversion = getDirectConversion(unit1, unit2);
        if (conversion == null) {
            conversion = getDirectConversion(unit2, unit1);
        }
        return conversion;
    }

    //
    public void addConversion(@NotNull Class<? extends T> unit1,
                              @NotNull Class<? extends T> unit2,
                              @NotNull SingleCoefficientOperation conversion) {
        if (!(directConversionDefined(unit1, unit2) || directConversionDefined(unit2, unit1))) {
            addDirectConversion(unit1, unit2, conversion);
            addDirectConversion(unit2, unit1, (SingleCoefficientOperation) conversion.getInverse());
        }
    }

    private void addDirectConversion(@NotNull Class<? extends T> unit1,
                                     @NotNull Class<? extends T> unit2,
                                     @NotNull SingleCoefficientOperation conversion) {
        if (!unitHasPrimaryKey(unit1)) {
            conversionTable.put(unit1, new HashMap<>());
        }
        conversionTable.get(unit1).put(unit2, conversion);
    }
}