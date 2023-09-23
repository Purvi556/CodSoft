import java.util.HashMap;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        // Create a HashMap to store currency conversion rates
        HashMap<String, Double> conversionRates = new HashMap<>();
        
        // Initialize conversion rates (as of the knowledge cutoff date in September 2021)
        conversionRates.put("USD", 1.0);    // US Dollar
        conversionRates.put("EUR", 0.85);   // Euro
        conversionRates.put("GBP", 0.73);   // British Pound
        conversionRates.put("JPY", 109.29); // Japanese Yen
        conversionRates.put("INR", 73.0);  // Indian Rupee
        // Add more currencies and their conversion rates as needed
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Currency Converter!");
        System.out.println("Supported currencies: USD, EUR, GBP, JPY, INR ...");

        // Get user input for the amount and source currency
        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter the source currency (e.g., USD): ");
        String sourceCurrency = scanner.nextLine().toUpperCase();

        // Get user input for the target currency
        System.out.print("Enter the target currency (e.g., EUR): ");
        String targetCurrency = scanner.nextLine().toUpperCase();

        // Check if currencies are valid
        if (!conversionRates.containsKey(sourceCurrency) || !conversionRates.containsKey(targetCurrency)) {
            System.out.println("Invalid currency input.");
        } else {
            // Perform currency conversion
            double sourceRate = conversionRates.get(sourceCurrency);
            double targetRate = conversionRates.get(targetCurrency);
            double convertedAmount = (amount / sourceRate) * targetRate;

            // Display the result
            System.out.printf("%.2f %s = %.2f %s%n", amount, sourceCurrency, convertedAmount, targetCurrency);
        }

        scanner.close();
    }
}
