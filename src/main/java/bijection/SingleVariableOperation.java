package bijection;

import org.jetbrains.annotations.NotNull;

/**
 * TODO: finish this javadoc
 */
public abstract class SingleVariableOperation implements CalculableOperation {
    /**
     * Perform the operation.
     *
     * @param variable The variable.
     * @return Result.
     */
    public abstract double calculate(double variable) throws ArgumentOutOfDomainException;

    //
    @Override
    public final double calculate(double @NotNull [] args) throws ArgumentOutOfDomainException {
        if (args.length != 1) {
            throw new RuntimeException(new ArrayLengthException());
        } else {
            return calculate(args[0]);
        }
    }
}