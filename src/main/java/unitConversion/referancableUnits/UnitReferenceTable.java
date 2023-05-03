package unitConversion.referancableUnits;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.lang.reflect.InvocationTargetException;

import org.jetbrains.annotations.NotNull;

//For referencing unit instances
//TODO: add javadocs
public abstract class UnitReferenceTable<K extends ReferenceEnumInterface, T extends ReferencableUnit<K>> {
    private final @NotNull Map<@NotNull K, @NotNull Class<? extends T>> enumClassMap;
    private final @NotNull Map<@NotNull Class<? extends T>, @NotNull T> classInstanceMap;

    //
    public UnitReferenceTable() {
        enumClassMap = new HashMap<>();
        classInstanceMap = new HashMap<>();
        addReferences(getInitialReferences());
    }

    private boolean isEnumDefined(@NotNull K e) {
        return enumClassMap.containsKey(e);
    }

    //
    public @NotNull Class<? extends T> getClassByEnum(@NotNull K e) {
        if (isEnumDefined(e)) {
            return enumClassMap.get(e);
        } else {
            throw new RuntimeException(new UndefinedEnumReferenceException());
        }
    }

    private boolean isClassDefined(@NotNull Class<? extends T> c) {
        return classInstanceMap.containsKey(c);
    }

    //
    public @NotNull T getInstanceByClass(@NotNull Class<? extends T> c) {
        if (isClassDefined(c)) {
            return classInstanceMap.get(c);
        } else {
            throw new RuntimeException(new UndefinedClassReferenceException());
        }
    }

    //
    public @NotNull T getInstanceByEnum(@NotNull K e) {
        return getInstanceByClass(getClassByEnum(e));
    }

    public abstract @NotNull List<@NotNull Class<? extends T>> getInitialReferences();

    //arrays
    public final void addReferences(@NotNull List<@NotNull Class<? extends T>> classes) {
        for (@NotNull Class<? extends T> c : classes) {
            addReference(c);
        }
    }

    //
    public final void addReference(@NotNull Class<? extends T> c) {
        if (!isClassDefined(c)) {
            @NotNull T instance = getNewUnitInstance(c);
            classInstanceMap.put(c, instance);
            @NotNull K e = instance.getClassEnum();
            if (!isEnumDefined(e)) {
                enumClassMap.put(e, c);
            }
        }
    }

    private @NotNull T getNewUnitInstance(@NotNull Class<? extends T> c) {
        try {
            return c.getDeclaredConstructor().newInstance();
        } catch (InstantiationException |
                 IllegalAccessException |
                 InvocationTargetException |
                 NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}