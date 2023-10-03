public class KZTtoUSDConversion implements CurrencyConversionStrategy {
    @Override
    public double convert(double amount) {
        return amount * 0.0021;
    }
}
