package timeConversionModel2.mathOperations;

import org.jetbrains.annotations.NotNull;

//TODO: add javadocs
public final class Division extends SingleCoefficientOperation {
    //
    public Division(double coefficient) {
        super(coefficient);
    }

    //
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