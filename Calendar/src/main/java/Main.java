import static consoleUtils.SimplePrinting.printLine;

public class Main {
    private static final int
            CONSTANT_1 = 13,
            CONSTANT_2 = 5;

    public static void main(String[] args) {
        int var1 = CONSTANT_1, var2 = CONSTANT_2;
        printLine(var1 + " % " + var2 + " = " + getResult(var1, var2));
    }

    private static int getResult(int var1, int var2) {
        return var1 % var2;
    }
}