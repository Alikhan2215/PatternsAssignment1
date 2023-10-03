public class CurrencyConverter {
    private static CurrencyConverter instance;

    private CurrencyConverter() {
    }

    public static CurrencyConverter getInstance() {
        if (instance == null) {
            instance = new CurrencyConverter();
        }
        return instance;
    }

    private CurrencyConversionStrategy conversionStrategy;

    public void setConversionStrategy(CurrencyConversionStrategy strategy) {
        this.conversionStrategy = strategy;
    }

    public double convertCurrency(double amount) {
        if (conversionStrategy == null) {
            throw new IllegalStateException("Conversion strategy is not set.");
        }
        return conversionStrategy.convert(amount);
    }
}
