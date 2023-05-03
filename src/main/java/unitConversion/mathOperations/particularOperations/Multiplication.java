package unitConversion.mathOperations.particularOperations;

import org.jetbrains.annotations.NotNull;

import unitConversion.mathOperations.SingleCoefficientOperation;
import unitConversion.mathOperations.InvertibleOperation;

//TODO: add javadocs
public final class Multiplication extends SingleCoefficientOperation {
    //
    public Multiplication(double coefficient) {
        super(coefficient);
    }

    /**
     * Perform multiplication.
     *
     * @param variable multiplier.
     * @return Product.
     */
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