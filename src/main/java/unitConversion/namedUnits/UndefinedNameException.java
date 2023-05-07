package unitConversion.namedUnits;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

//TODO: finish this and add javadocs
class UndefinedNameException extends Exception {
    //
    UndefinedNameException() {
        this(null);
    }

    //
    UndefinedNameException(@Nullable String className) {
        super(prepareMessage(className));
    }

    private static @NotNull String prepareMessage(@Nullable String className) {
        @NotNull String message = "Unit name not defined";
        if (className == null) {
            message += "!";
        } else {
            message += ": " + className;
        }
        return message;
    }
}