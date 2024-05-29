// Interface untuk definisikan pertukaran mata uang
public interface Currency {
    double getExchangeRate (String fromCurrency, String toCurrency);
    double convertCurrency (double amount, String fromCurrency, String toCurrency);
    String getCurrencyCode();
}
