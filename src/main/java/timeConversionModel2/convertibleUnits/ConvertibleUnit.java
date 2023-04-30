package timeConversionModel2.convertibleUnits;

import org.jetbrains.annotations.NotNull;

//TODO: add javadocs
public abstract class ConvertibleUnit extends NamedUnit {
    public ConvertibleUnit(@NotNull String name, @NotNull String abbreviation) {
        super(name, abbreviation);
    }
}