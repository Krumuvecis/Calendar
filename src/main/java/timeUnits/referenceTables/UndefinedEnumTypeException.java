package timeUnits.referenceTables;

public final class UndefinedEnumTypeException extends Exception {
    public UndefinedEnumTypeException() {
        super("No reference table for such enum type!");
    }
}