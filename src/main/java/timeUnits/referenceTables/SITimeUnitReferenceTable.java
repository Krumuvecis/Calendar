package timeUnits.referenceTables;

import java.util.List;
import java.util.ArrayList;

import org.jetbrains.annotations.NotNull;

import timeUnits.units.si.*;

//TODO: add javadocs
public final class SITimeUnitReferenceTable extends TimeUnitReferenceTable<SITimeUnitEnum, SITimeUnit> {
    //
    public SITimeUnitReferenceTable() {
        super();
    }

    //
    @Override
    public @NotNull List<@NotNull Class<? extends SITimeUnit>> getInitialReferences() {
        return new ArrayList<>() {{
            add(Second.class);
            add(Minute.class);
            add(Hour.class);
        }};
    }
}