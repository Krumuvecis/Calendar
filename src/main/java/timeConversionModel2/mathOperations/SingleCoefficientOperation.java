package timeConversionModel2.mathOperations;

//TODO: add javadocs
public abstract class SingleCoefficientOperation implements SingleVariableOperation, InvertibleOperation {
    private final double coefficient;

    //
    protected SingleCoefficientOperation(double coefficient) {
        this.coefficient = coefficient;
    }

    //
    public final double getCoefficient() {
        return coefficient;
    }
}