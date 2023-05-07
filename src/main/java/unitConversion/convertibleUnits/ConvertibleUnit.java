package unitConversion.convertibleUnits;

import org.jetbrains.annotations.NotNull;

import unitConversion.referancableUnits.ReferenceEnumInterface;
import unitConversion.namedUnits.UnitNameInfo;
import unitConversion.namedUnits.NamedUnit;

//TODO: add javadocs
public abstract class ConvertibleUnit<T extends ReferenceEnumInterface> extends NamedUnit<T> {
    public ConvertibleUnit(@NotNull UnitNameInfo nameInfo) {
        super(nameInfo);
    }
}