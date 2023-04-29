package duration;

import convertibleUnits.ConvertibleUnit;
import convertibleUnits.unitConversion.IntegerConversion.*;
import convertibleUnits.unitConversion.DoubleConversion.*;

//
public abstract class TimeUnits {

    //
    public static final class Second extends ConvertibleUnit {
        //
        public Second() {
            super("second", "s");
            addUnitConversion(Minute.class, new IntegerDivision(60));
        }
    }

    //
    public static final class Minute extends ConvertibleUnit {
        //
        public Minute() {
            super("minute", "min");
            addUnitConversion(Second.class, new IntegerMultiplication(60));
            addUnitConversion(Hour.class, new IntegerDivision(60));
        }
    }

    //
    public static final class Hour extends ConvertibleUnit {
        //
        public Hour() {
            super("hour", "h");
            addUnitConversion(Minute.class, new IntegerMultiplication(60));
            addUnitConversion(Day.class, new IntegerDivision(24));
        }
    }

    //
    public static final class Day extends ConvertibleUnit {
        //
        public Day() {
            super("day", "d");
            //86'400 SI seconds
            addUnitConversion(Hour.class, new IntegerMultiplication(24));
            addUnitConversion(Week.class, new IntegerDivision(7));
            addUnitConversion(EarthTropicalYear.class, new DoubleDivision(365.2422));
        }
    }

    //
    public static final class Week extends ConvertibleUnit {
        //
        public Week() {
            super("week", "w");
            addUnitConversion(Day.class, new IntegerMultiplication(7));
        }
    }

    //
    public static final class AverageMonth extends ConvertibleUnit {
        //
        public AverageMonth() {
            super("month", "M");
            addUnitConversion(EarthTropicalYear.class, new IntegerDivision(12));
        }
    }

    //
    public static final class EarthTropicalYear extends ConvertibleUnit {
        //
        public EarthTropicalYear() {
            super("year", "y");
            addUnitConversion(Day.class, new DoubleMultiplication(365.2422));
            addUnitConversion(AverageMonth.class, new IntegerMultiplication(12));
        }
    }
}