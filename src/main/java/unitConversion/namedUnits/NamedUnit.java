package unitConversion.namedUnits;

import org.jetbrains.annotations.NotNull;

import unitConversion.referancableUnits.ReferenceEnumInterface;
import unitConversion.referancableUnits.ReferencableUnit;

//TODO: add javadocs
public abstract class NamedUnit<T extends ReferenceEnumInterface>
        implements ReferencableUnit<T>, NamedUnitInterface {
    private final @NotNull UnitNameInfo nameInfo;

    //
    public NamedUnit(@NotNull UnitNameInfo nameInfo) {
        this.nameInfo = nameInfo;
    }

    //
    @Override
    public final @NotNull String getName() {
        try {
            return nameInfo.getName();
        } catch (UndefinedNameException e) {
            throw new RuntimeException(e);
        }
    }

    //
    @Override
    public final @NotNull String getName(boolean leadingCaps, boolean plural) {
        try {
            return nameInfo.getName(leadingCaps, plural);
        } catch (UndefinedNameException e) {
            throw new RuntimeException(e);
        }
    }

    //
    @Override
    public final @NotNull String getAbbreviation() {
        try {
            return nameInfo.getAbbreviation();
        } catch (UndefinedNameException e) {
            throw new RuntimeException(e);
        }
    }
}