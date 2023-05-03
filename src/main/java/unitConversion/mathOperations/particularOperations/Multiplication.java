package unitConversion.mathOperations.particularOperations;

import org.jetbrains.annotations.NotNull;
import unitConversion.mathOperations.InvertibleOperation;
import unitConversion.mathOperations.SingleCoefficientOperation;

//TODO: add javadocs
public final class Multiplication extends SingleCoefficientOperation {
    //
    public Multiplication(double coefficient) {
        super(coefficient);
    }

    //
    @Override
    public double calculate(double variable) {
        return variable * getCoefficient();
    }

    //
    @Override
    public @NotNull InvertibleOperation getInverse() {
        return new Division(getCoefficient());
    }
}