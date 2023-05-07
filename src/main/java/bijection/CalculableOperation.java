package bijection;

import org.jetbrains.annotations.NotNull;

//TODO: finish this and add javadocs
public interface CalculableOperation {
    //multiple arguments supported
    double calculate(double @NotNull [] args) throws ArrayLengthException, ArgumentOutOfDomainException;
}