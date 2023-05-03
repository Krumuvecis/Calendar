package unitConversion.referancableUnits;

import org.jetbrains.annotations.NotNull;

/**
 * A class for the unit to be used within UnitReferenceTable
 */
public abstract class ReferencableUnit<T extends ReferenceEnumInterface> {
    //TODO: add javadoc; maybe convert this to an interface (check inheritors)
    public abstract @NotNull T getClassEnum();
}