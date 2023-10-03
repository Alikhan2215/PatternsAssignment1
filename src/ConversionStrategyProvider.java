public class ConversionStrategyProvider {
    public static CurrencyConversionStrategy getUSDtoKZTConversion() {
        return new USDtoKZTConversion();
    }

    public static CurrencyConversionStrategy getKZTtoUSDConversion() {
        return new KZTtoUSDConversion();
    }

    public static CurrencyConversionStrategy getRUBtoKZTConversion() {
        return new RUBtoKZTConversion();
    }

    public static CurrencyConversionStrategy getKZTtoRUBConversion() {
        return new KZTtoRUBConversion();
    }
}
