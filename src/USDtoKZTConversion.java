public class USDtoKZTConversion implements CurrencyConversionStrategy {
    @Override
    public double convert(double amount) {
        return amount * 477.09;
    }
}
