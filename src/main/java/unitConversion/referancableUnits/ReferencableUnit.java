package unitConversion.referancableUnits;

import org.jetbrains.annotations.NotNull;

/**
 * TODO: add and fix javadocs
 * A class for the unit to be used within UnitReferenceTable
 */
public interface ReferencableUnit<T extends ReferenceEnumInterface> {
    //
    @NotNull T getClassEnum();
}