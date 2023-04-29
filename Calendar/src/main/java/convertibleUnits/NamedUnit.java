package convertibleUnits;

import org.jetbrains.annotations.NotNull;

/**
 * TODO: finish javadocs
 */
class NamedUnit {
    private final @NotNull String name, abbreviation;

    /**
     * TODO: finish this javadoc
     */
    NamedUnit(@NotNull String name, @NotNull String abbreviation) {
        this.name = name;
        this.abbreviation = abbreviation;
    }

    /**
     * TODO: finish this javadoc
     */
    public final @NotNull String getName() {
        return name;
    }

    /**
     * TODO: finish this javadoc
     */
    public final @NotNull String getAbbreviation() {
        return abbreviation;
    }
}