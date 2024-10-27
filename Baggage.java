
/*
	Elyse Niyonagira
   This class has the arg constructors with their default values and also it has the getters and setters
   and the toString () method to format all outputs to a string  */

   public class Baggage {

    private int length;
    private int width;
    private int height;
    private double weight;

    public static final int DEFAULT_LENGTH = 65;
    public static final int DEFAULT_WIDTH = 25;
    public static final int DEFAULT_HEIGHT = 50;
    public static final double DEFAULT_WEIGHT = 10F;

    // arg constructors with default values in a no-arg constructor
    public Baggage() {
        this(DEFAULT_LENGTH, DEFAULT_WIDTH, DEFAULT_HEIGHT, DEFAULT_WEIGHT);
    }

    public Baggage(int length, int width, int height, double weight) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;

    }

    // getters and setters of Length to help the use set and access their input
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    // getters and setters of Width to help the use set and access their input
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    // getters and setters of Height to help the use set and access their input
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    // getters and setters of Weight to help the use set and access their input
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // The toString method () has the output with the two conditions that state
    // whether the baggage are valid
    // and their surcharge on the overweight bags
    public String toString() {

        String output;
        output = (String.format(" length %d cm, width %d cm, height %d cm, weight %.2f kg.", length, width, height,
                weight));

        if (BaggageChecker.canBeUsedAsACarryOn(this)) {

            output += " This bag can be used as a carry on\n.";
        }

        if (BaggageChecker.allowedWeightIsMoreThanMax(this)) {
            // Calculate surcharge
            double surcharge = BaggageChecker.calculateWeightSurcharge(this);

            output += String.format("It is overweight; " +
                    "it exceeds the allowed weight of %.2f kg. A surcharge of $%.2f applies\n.",
                    BaggageChecker.MAX_REGULAR_WEIGHT, surcharge);

        }
        return output;

    }

}
