package unitConversion.namedUnits;

import org.jetbrains.annotations.NotNull;

//gotta override this or SimpleUnitNameInfo
//TODO: add javadocs
public abstract class UnitNameInfo implements NamedUnitInterface {
    //unnecessary
    public UnitNameInfo() {}

    /**
     * return in small caps and singular form
     *
     * @return
     */
    @Override
    public abstract @NotNull String getName() throws UndefinedNameException;

    public @NotNull String getName(boolean leadingCaps, boolean plural) throws UndefinedNameException {
        @NotNull String smallCapsName = plural ? getNamePlural() : getName();
        return leadingCaps ? capitalizeFirstLetter(smallCapsName, getFirstLetterCaps()) : smallCapsName;
    }

    /**
     * return in small caps
     *
     * @return
     */
    public abstract @NotNull String getNamePlural() throws UndefinedNameException;

    //
    public abstract char getFirstLetterCaps();

    private @NotNull String capitalizeFirstLetter(@NotNull String smallCapsString, char firstLetterCaps) {
        char @NotNull [] charArray = smallCapsString.toCharArray();
        charArray[0] = firstLetterCaps;
        return String.copyValueOf(charArray);
    }
}