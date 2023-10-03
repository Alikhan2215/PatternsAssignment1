public class RUBtoKZTConversion implements CurrencyConversionStrategy {
    @Override
    public double convert(double amount) {
        return amount * 4.76;
    }
}
