public class KZTtoRUBConversion implements CurrencyConversionStrategy {
    @Override
    public double convert(double amount) {
        return amount * 0.21;
    }
}
