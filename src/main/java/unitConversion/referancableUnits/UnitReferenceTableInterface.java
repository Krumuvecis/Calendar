package unitConversion.referancableUnits;

import java.util.List;

import org.jetbrains.annotations.NotNull;

//TODO: add javadocs
public interface UnitReferenceTableInterface<K extends ReferenceEnumInterface, T extends ReferencableUnit<K>> {
    //
    @NotNull Class<? extends T> getClassByEnum(@NotNull K e) throws UndefinedEnumReferenceException;

    //
    @NotNull T getInstanceByClass(@NotNull Class<? extends T> c) throws UndefinedClassReferenceException;

    //
    @NotNull T getInstanceByEnum(@NotNull K e) throws UndefinedEnumReferenceException, UndefinedClassReferenceException;

    //list of references
    void addReferences(@NotNull List<@NotNull Class<? extends T>> classes);

    //single reference
    void addReference(@NotNull Class<? extends T> c);

    //initial references to add
    @NotNull List<@NotNull Class<? extends T>> getInitialReferences();
}