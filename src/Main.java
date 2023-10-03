import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        CurrencyConverter converter = CurrencyConverter.getInstance();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose a currency conversion option:");
            System.out.println("1. USD to KZT");
            System.out.println("2. KZT to USD");
            System.out.println("3. RUB to KZT");
            System.out.println("4. KZT to RUB");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();

            if (choice == 5) {
                break;
            }

            System.out.print("Enter amount: ");
            double amount = scanner.nextDouble();

            switch (choice) {
                case 1:
                    converter.setConversionStrategy(ConversionStrategyProvider.getUSDtoKZTConversion());
                    break;
                case 2:
                    converter.setConversionStrategy(ConversionStrategyProvider.getKZTtoUSDConversion());
                    break;
                case 3:
                    converter.setConversionStrategy(ConversionStrategyProvider.getRUBtoKZTConversion());
                    break;
                case 4:
                    converter.setConversionStrategy(ConversionStrategyProvider.getKZTtoRUBConversion());
                    break;
                default:
                    System.out.println("Invalid choice.");
                    continue;
            }

            double convertedAmount = converter.convertCurrency(amount);
            System.out.println("Converted amount: " + convertedAmount);
        }
    }
}