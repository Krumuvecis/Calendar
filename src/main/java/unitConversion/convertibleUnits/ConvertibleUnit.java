package unitConversion.convertibleUnits;

import org.jetbrains.annotations.NotNull;
import unitConversion.referancableUnits.ReferenceEnumInterface;

//TODO: add javadocs
public abstract class ConvertibleUnit<T extends ReferenceEnumInterface> extends NamedUnit<T> {
    public ConvertibleUnit(@NotNull String name, @NotNull String abbreviation) {
        super(name, abbreviation);
    }
}