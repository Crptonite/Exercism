public class Lasagna {

    // Method that returns the expected minutes in the oven
    public int expectedMinutesInOven() {
        return 40; // Assuming the lasagna should be in the oven for 40 minutes
    }

    // Method that calculates remaining minutes in the oven
    public int remainingMinutesInOven(int minutesAlreadyInOven) {
        return expectedMinutesInOven() - minutesAlreadyInOven;
    }

    // Method that calculates preparation time based on the number of layers
    public int preparationTimeInMinutes(int layers) {
        return layers * 2; // Assuming each layer takes 2 minutes to prepare
    }

    // Method that calculates total time spent
    public int totalTimeInMinutes(int layers, int minutesAlreadyInOven) {
        return preparationTimeInMinutes(layers) + minutesAlreadyInOven;
    }

    // Main method to test the functions
    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();

        // Call methods
        System.out.println("Expected minutes in oven: " + lasagna.expectedMinutesInOven());
        System.out.println("Remaining minutes in oven (30 minutes in): " + lasagna.remainingMinutesInOven(30));
        System.out.println("Preparation time for 2 layers: " + lasagna.preparationTimeInMinutes(2));
        System.out.println("Total time (3 layers, 20 min in oven): " + lasagna.totalTimeInMinutes(3, 20));
    }
}
