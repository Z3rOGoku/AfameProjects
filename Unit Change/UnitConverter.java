import java.util.Scanner;

public class UnitConverter {

    // ANSI escape codes for green text and reset
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            printMenu();
            int choice = scanner.nextInt();
            if (choice == 5) {
                System.out.println("Exiting the converter.");
                break;
            }

            System.out.print("Enter the value to convert: ");
            double value = scanner.nextDouble();
            double result;
            String unit = "";

            switch (choice) {
                case 1:
                    result = centimetersToMeters(value);
                    unit = "meters";
                    break;
                case 2:
                    result = metersToCentimeters(value);
                    unit = "centimeters";
                    break;
                case 3:
                    result = gramsToKilograms(value);
                    unit = "kilograms";
                    break;
                case 4:
                    result = kilogramsToGrams(value);
                    unit = "grams";
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
                    continue;
            }

            printResult(value, result, unit);
        }
        scanner.close();
    }

    private static void printMenu() {
        System.out.println("******************************");
        System.out.println("*        Unit Converter      *");
        System.out.println("******************************");
        System.out.println("* Choose the conversion type *");
        System.out.println("* 1. Centimeters to Meters   *");
        System.out.println("* 2. Meters to Centimeters   *");
        System.out.println("* 3. Grams to Kilograms      *");
        System.out.println("* 4. Kilograms to Grams      *");
        System.out.println("* 5. Exit                    *");
        System.out.println("******************************");
        System.out.print("Enter your choice: ");
    }

    private static void printResult(double input, double output, String unit) {
        String resultString = String.format("%.2f converts to %.2f %s", input, output, unit);
        int borderLength = resultString.length() + 4;  // +4 for padding and borders
        String border = new String(new char[borderLength]).replace("\0", "*");

        System.out.println(ANSI_GREEN + border);
        System.out.println("* " + resultString + " *");
        System.out.println(border + ANSI_RESET);
        System.out.println();
    }

    public static double centimetersToMeters(double cm) {
        return cm / 100.0;
    }

    public static double metersToCentimeters(double meters) {
        return meters * 100.0;
    }

    public static double gramsToKilograms(double grams) {
        return grams / 1000.0;
    }

    public static double kilogramsToGrams(double kilograms) {
        return kilograms * 1000.0;
    }
}
