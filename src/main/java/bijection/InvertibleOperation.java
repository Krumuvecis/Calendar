package bijection;

import org.jetbrains.annotations.NotNull;

//TODO: add javadocs
public interface InvertibleOperation {
    //
    @NotNull InvertibleOperation getInverse();
}