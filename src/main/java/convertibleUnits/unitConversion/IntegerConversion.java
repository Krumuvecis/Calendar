package convertibleUnits.unitConversion;

/**
 * TODO: finish javadocs
 */
public abstract class IntegerConversion implements UnitConversionInterface {
    private final int coefficient;

    /**
     * TODO: finish this javadoc
     */
    protected IntegerConversion(int coefficient) {
        this.coefficient = coefficient;
    }

    /**
     * TODO: finish this javadoc
     */
    protected final int getCoefficient() {
        return coefficient;
    }

    /**
     * TODO: finish javadocs
     */
    public static final class IntegerMultiplication extends IntegerConversion {
        /**
         * TODO: finish this javadoc; copy from super
         */
        public IntegerMultiplication(int coefficient) {
            super(coefficient);
        }

        /**
         * TODO: finish this javadoc; copy from interface
         */
        @Override
        public double convert(double value) {
            return value * getCoefficient();
        }
    }

    /**
     * TODO: finish javadocs
     */
    public static final class IntegerDivision extends IntegerConversion {
        /**
         * TODO: finish this javadoc; copy from super
         */
        public IntegerDivision(int coefficient) {
            super(coefficient);
        }

        /**
         * TODO: finish this javadoc; copy from interface
         */
        @Override
        public double convert(double value) {
            return value / getCoefficient();
        }
    }
}