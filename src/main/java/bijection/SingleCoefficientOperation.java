package bijection;

//TODO: add javadocs
public abstract class SingleCoefficientOperation extends SingleVariableOperation implements InvertibleOperation {
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