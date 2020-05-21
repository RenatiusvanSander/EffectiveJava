package edu.remad.chapter6.item38;

/**
 * Drives the AdvanceDirection and BasicDirection.
 * @author Remy Meier
 */
public class DirectionDriver {

    /**
     * Prints the enum.
     * @param op An Enum state of type {@link Direction}
     */
    public static void printDirection(Direction op) {
        op.showDirection();
    }

    public static <T extends Enum<T> & Direction> void printDirections(Class<T> clazz) {
        for (Direction direction : clazz.getEnumConstants()) {
            direction.showDirection();
        }
    }

    public static void main(String[] args) {
        DirectionDriver.printDirection(BasicDirection.EAST);
        DirectionDriver.printDirection(AdvanceDirection.SOUTHWEST);
        DirectionDriver.printDirections(BasicDirection.class);
        DirectionDriver.printDirections(AdvanceDirection.class);
    }
}
