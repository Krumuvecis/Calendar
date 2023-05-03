package unitConversion.time;

import org.jetbrains.annotations.NotNull;

import unitConversion.convertibleUnits.ConvertibleUnit;

//TODO: add javadocs
public abstract class TimeUnit extends ConvertibleUnit {
    TimeUnit(@NotNull String name, @NotNull String abbreviation) {
        super(name, abbreviation);
    }

    public static class Second extends TimeUnit {
        public Second() {
            super("Second", "s");
        }
    }

    public static class Minute extends TimeUnit {
        public Minute() {
            super("Minute", "min");
        }
    }

    public static class Hour extends TimeUnit {
        public Hour() {
            super("Hour", "h");
        }
    }
}