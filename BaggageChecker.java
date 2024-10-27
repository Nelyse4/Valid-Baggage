
/*Elyse Niyonagira
This class is a utility class that has four static methods that holds the 
constant value of the baggage properties that are valid and this class 
uses Baggage as its parameter in its public static methods
*/

public class BaggageChecker {
    // public static constants that are loaded in memory first in execution
    public static final int MAX_CARRYON_DIMENSION = 36;
    public static final int MAX_SUM_DIMENSIONS = 192;
    public static final double MAX_REGULAR_WEIGHT = 22.00F;
    public static final double SURCHARGE_PER_KG = 3.0F;

    // this methods returns true if the baggage object has a weight greater than
    // the maximum permissible regular weight and returns false otherwise.
    public static boolean allowedWeightIsMoreThanMax(Baggage baggage) {
        return baggage.getWeight() > MAX_REGULAR_WEIGHT;
    }

    // this method use the baggage object’s weight to return a surcharge
    public static double calculateWeightSurcharge(Baggage baggage) {
        double overweight = baggage.getWeight() - MAX_REGULAR_WEIGHT;
        return overweight * SURCHARGE_PER_KG;
    }

    // returns true if the length,width, and height
    // are each less than 36 cm and returns false otherwise.
    public static boolean canBeUsedAsACarryOn(Baggage baggage) {
        return baggage.getLength() <= MAX_CARRYON_DIMENSION
                && baggage.getWidth() <= MAX_CARRYON_DIMENSION
                && baggage.getHeight() <= MAX_CARRYON_DIMENSION;
    }

    // This method returns true if the sum of the object’s dimensions is greater
    // than the sum of 192
    // and returns false otherwise
    public static boolean sumDimensionsExceedsMax(Baggage baggage) {
        return baggage.getLength() + baggage.getWidth() + baggage.getHeight() > MAX_SUM_DIMENSIONS;
    }
}

