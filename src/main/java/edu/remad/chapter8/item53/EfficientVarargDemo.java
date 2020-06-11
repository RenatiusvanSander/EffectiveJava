package edu.remad.chapter8.item53;

/**
 * This class demonstrates efficient use of varargs.
 * @author Remy Meier
 */
public class EfficientVarargDemo {

    /**
     * Identifies the minimum number.
     * @param firstArg First argument
     * @param remainingArgs Remaining arguments.
     * @return The smallest number.
     */
    public static int min(int firstArg, int... remainingArgs) {
        int min = firstArg;
        for(int arg : remainingArgs) {
            if(arg < min) {
                min = arg;
            }
        }

        return min;
    }
}
