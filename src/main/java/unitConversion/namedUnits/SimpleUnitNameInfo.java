package unitConversion.namedUnits;

import org.jetbrains.annotations.NotNull;

//TODO: add javadocs
public abstract class SimpleUnitNameInfo extends UnitNameInfo {
    private static final @NotNull String PLURAL_SUFFIX = "s";

    //unnecessary
    public SimpleUnitNameInfo() {
        super();
    }

    /**
     * return in small caps
     *
     * @return
     */
    @Override
    public @NotNull String getNamePlural() throws UndefinedNameException {
        return pluralize(getName());
    }

    private @NotNull String pluralize(@NotNull String singular) {
        return singular + PLURAL_SUFFIX;
    }
}