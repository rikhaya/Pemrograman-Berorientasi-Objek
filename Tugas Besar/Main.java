// Kelas utama untuk menjalankan program pertukaran mata uang
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Objek ExchangeRate untuk nilai tukar USD ke EUR
        ExchangeRate usdToEurRate = new ExchangeRate(0.91, "USD", "EUR");

        // Objek ExchangeRate untuk nilai tukar EUR ke USD
        ExchangeRate eurToUsdRate = new ExchangeRate(1.10, "EUR", "USD");

        // Daftar nilai tukar
        List<ExchangeRate> exchangeRates = new ArrayList<>();
        exchangeRates.add(usdToEurRate);
        exchangeRates.add(eurToUsdRate);

        // Pertukaran mata uang berdasarkan daftar nilai tukar
        CurrencyExchange currencyExchange = new CurrencyExchange(exchangeRates);

        // Currency Exchange USD to EUR
        CurrencyExchange usdToEurCurrencyExchange = new CurrencyExchange(exchangeRates);

        // Currency Exchange EUR to USD
        CurrencyExchange eurToUsdCurrencyExchange = new CurrencyExchange(exchangeRates);

        // Mata uang yang dikonversi
        String fromCurrency = "USD";
        String toCurrency = "EUR";

        // Jumlah mata uang yang dikonversi
        double originalAmount = 130;

        // Konversi USD to EUR
        double usdToEurExchangeRate = usdToEurCurrencyExchange.getExchangeRate(fromCurrency, toCurrency);

        double usdToEurConvertedAmount = usdToEurCurrencyExchange.convertCurrency(originalAmount, fromCurrency, toCurrency);


        // Konversi EUR to USD
        double eurToUsdExchangeRate = eurToUsdCurrencyExchange.getExchangeRate(toCurrency, fromCurrency);
        
        double eurToUsdConvertedAmount = eurToUsdCurrencyExchange.convertCurrency(originalAmount, toCurrency, fromCurrency);

        // Hasil
        System.out.println("PERTUKARAN MATA UANG DARI " + fromCurrency + " KE " + toCurrency);
        System.out.println();
        System.out.println("Exchange Rate (nilai tukar) USD ke EUR: " + usdToEurExchangeRate);
        System.out.println("Jumlah " + fromCurrency + " yang dikonversi: " + originalAmount);
        System.out.println("Jumlah " + toCurrency + " setelah dikonversi: " + usdToEurConvertedAmount);

        System.out.println();
        System.out.println();

        System.out.println("PERTUKARAN MATA UANG DARI " + toCurrency + " KE " + fromCurrency);
        System.out.println();
        System.out.println("Exchange Rate (nilai tukar) EUR ke USD: " + eurToUsdExchangeRate);
        System.out.println("Jumlah " + toCurrency + " yang dikonversi: " + originalAmount);
        System.out.println("Jumlah " + fromCurrency + " setelah dikonversi: " + eurToUsdConvertedAmount);
        System.out.println();
    }
}
