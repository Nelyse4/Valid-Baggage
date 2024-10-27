
/*Elyse Niyonagira
   This program prompts the user to enter baggage dimensions and weight,
   checks if the baggage can be used as a carry-on, calculates weight surcharge,
   and allows the user to continue or quit. */
   public class BaggageLauncher {
    public static void main(String[] args) {
  
      int validItemCount = 0;
      double totalBaggageWeight = 0.0;
      String answer;
  
      System.out.println("Welcome to the Baggage Handler Software Program");
  
      System.out.println("");
      do {
  
        // Prompt the user to input values
        int length = InputData.validateInt("Enter the length of the baggage (in cm):");
        int width = InputData.validateInt("Enter width (in cm):");
        int height = InputData.validateInt("Enter height (in cm):");
        double weight = InputData.validateDouble("Enter weight (in kg):");
  
        // Instantiate a new Baggage object
        Baggage baggage = new Baggage(length, width, height, weight);
  
        // Check if the bag can be used as a carry-on or if it's overweight
        if (BaggageChecker.sumDimensionsExceedsMax(baggage)) {
          System.out.println("This bag is oversized; it is not acceptable");
  
        }
  
        else {
          System.out.println("This bag has" + baggage.toString());
  
          validItemCount++;
          totalBaggageWeight += baggage.getWeight();
        }
  
        System.out.println();
        answer = InputData.validateString("Do you wish to continue? Enter 'No' to quit, anything else to continue:");
        System.out.println();
      } while (!answer.equalsIgnoreCase("no")); // Set validBaggage to false if user wants to quit
  
      System.out.println("The total number of valid bags entered was: " + validItemCount);
      System.out.printf("The total weight entered was: %.2f kg\n", totalBaggageWeight);
      System.out.println("The program has terminated.");
  
      System.out.println("Program by Elyse Niyonagira");
    }
  }
  
