package unitConversion.namedUnits;

import org.jetbrains.annotations.NotNull;

//TODO: add javadocs
public interface NamedUnitInterface {
    //
    @NotNull String getAbbreviation() throws UndefinedNameException;

    //
    @NotNull String getName() throws UndefinedNameException;

    //
    @NotNull String getName(boolean leadingCaps, boolean plural) throws UndefinedNameException;
}