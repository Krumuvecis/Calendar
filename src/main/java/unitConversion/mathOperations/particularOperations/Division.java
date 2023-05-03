package unitConversion.mathOperations.particularOperations;

import org.jetbrains.annotations.NotNull;

import unitConversion.mathOperations.SingleCoefficientOperation;
import unitConversion.mathOperations.InvertibleOperation;

//TODO: add javadocs
public final class Division extends SingleCoefficientOperation {
    //
    public Division(double coefficient) {
        super(coefficient);
    }

    /**
     * Perform division.
     *
     * @param variable Divisor.
     * @return Result.
     */
    @Override
    public double calculate(double variable) {
        return variable / getCoefficient();
    }

    //
    @Override
    public @NotNull InvertibleOperation getInverse() {
        return new Multiplication(getCoefficient());
    }
}