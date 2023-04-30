package timeConversionModel2.convertibleUnits;

import org.jetbrains.annotations.NotNull;

import timeConversionModel2.referancableUnits.ReferencableUnit;

//TODO: add javadocs
abstract class NamedUnit extends ReferencableUnit {
    private final @NotNull String name, abbreviation;

    NamedUnit(@NotNull String name, @NotNull String abbreviation) {
        this.name = name;
        this.abbreviation = abbreviation;
    }

    public final @NotNull String getName() {
        return name;
    }

    public final @NotNull String getAbbreviation() {
        return abbreviation;
    }
}