package timeConversionModel2.mathOperations;

import org.jetbrains.annotations.NotNull;

//TODO: add javadocs
interface InvertibleOperation {
    @NotNull InvertibleOperation getInverse();
}