// Kelas untuk melakukan pertukaran mata uang berdasarkan nilai tukar
import java.util.List;

public class CurrencyExchange implements Currency {
    private List<ExchangeRate> exchangeRates;   // Daftar nilai tukar mata uang

    // Konstruktor untuk membuat objek CurrencyExchange dengan daftar nilai tukar
    public CurrencyExchange (List<ExchangeRate> exchangeRates) {
        this.exchangeRates = exchangeRates;
    } 

    // Implementasi metode dari interface Currency untuk mendapatkan nilai tukar
    @Override
    public double getExchangeRate (String fromCurrency, String toCurrency) {
        for (ExchangeRate rate: exchangeRates) {
            double exchangeRate = rate.getExchangeRate(fromCurrency, toCurrency);
            if (exchangeRate != -1) {
                return exchangeRate;
            }
        }
        return -1;
    }

    // Implementasi metode dari interface Currency untuk mengkonversi jumlah mata uang
    @Override
    public double convertCurrency (double amount, String fromCurrency, String toCurrency) {
        double exchangeRate = getExchangeRate(fromCurrency, toCurrency);
        if (exchangeRate != -1) {
            return amount * exchangeRate;
        } else {
            System.out.println("Exchange rate not found for " + fromCurrency + " to " + toCurrency);
            return -1;
        }
    }

    // Implementasi metode dari interface Currency untuk mendapatkan kode mata uang tujuan
    @Override
    public String getCurrencyCode() {
        return "Unknown";
    }
}
