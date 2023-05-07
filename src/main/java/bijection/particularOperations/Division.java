package bijection.particularOperations;

import org.jetbrains.annotations.NotNull;

import bijection.InvertibleOperation;
import bijection.SingleCoefficientOperation;

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