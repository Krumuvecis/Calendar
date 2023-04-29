package convertibleUnits.unitConversion;

/**
 * TODO: finish javadocs
 */
public abstract class DoubleConversion implements UnitConversionInterface {
    private final double coefficient;

    /**
     * TODO: finish this javadoc
     */
    protected DoubleConversion(double coefficient) {
        this.coefficient = coefficient;
    }

    /**
     * TODO: finish this javadoc
     */
    protected final double getCoefficient() {
        return coefficient;
    }

    /**
     * TODO: finish javadocs
     */
    public static final class DoubleMultiplication extends DoubleConversion {
        /**
         * TODO: finish this javadoc; copy from super
         */
        public DoubleMultiplication(double coefficient) {
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
    public static final class DoubleDivision extends DoubleConversion {
        /**
         * TODO: finish this javadoc; copy from super
         */
        public DoubleDivision(double coefficient) {
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