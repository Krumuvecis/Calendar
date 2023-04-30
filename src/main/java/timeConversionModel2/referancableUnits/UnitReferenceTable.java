package timeConversionModel2.referancableUnits;

import java.util.Map;
import java.util.HashMap;
import java.lang.reflect.InvocationTargetException;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class UnitReferenceTable<T extends ReferencableUnit> {
    private final @NotNull Map<@NotNull Class<? extends T>, @NotNull T> referenceTable;

    public UnitReferenceTable() {
        referenceTable = new HashMap<>();
    }

    private boolean isDefined(@NotNull Class<? extends T> unit) {
        return referenceTable.containsKey(unit);
    }

    public @Nullable T getReference(@NotNull Class<? extends T> unit) {
        if (isDefined(unit)) {
            return referenceTable.get(unit);
        } else {
            return null;
        }
    }

    public void addReference(@NotNull Class<? extends T> unit) {
        if (!isDefined(unit)) {
            referenceTable.put(unit, getNewUnitInstance(unit));
        }
    }

    private @NotNull T getNewUnitInstance(@NotNull Class<? extends T> unit) {
        try {
            return unit.getDeclaredConstructor().newInstance();
        } catch (InstantiationException |
                 IllegalAccessException |
                 InvocationTargetException |
                 NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}