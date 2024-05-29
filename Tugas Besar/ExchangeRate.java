// Kelas untuk merepresentasikan nilai tukar antara dua mata uang.
public class ExchangeRate implements Currency {
    private double rate;    // nilai tukar antara dua mata uang
    private String fromCurrency;    // Mata uang asal
    private String toCurrency;  // Mata uang tujuan

    // Konstruktor untuk membuat objek ExchangeRate dengan nilai tukar, mata uang asal, mata uang tujuan
    public ExchangeRate (double rate, String fromCurrency, String toCurrency) {
        this.rate = rate;
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
    }

    // Untuk mendapatkan nilai tukar
    public double getRate() {
        return rate;
    }

    // Untuk mendapatkan mata uang asal
    public String getFromCurrency() {
        return fromCurrency;
    }

    // Untuk mendapatkan mata uang tujuan 
    public String getToCurrency() {
        return toCurrency;
    }

    // Implementasi metode dari interface Currency untuk mendapatkan nilai tukar
    @Override
    public double getExchangeRate (String fromCurrency, String toCurrency) {
        if (this.fromCurrency.equals(fromCurrency) && this.toCurrency.equals(toCurrency)) {
            return rate;
        }
        return -1;
    }

    // Implementasi metode dari interface Currency untuk mengkonversi jumlah mata uang
    @Override
    public double convertCurrency(double amount, String fromCurrency, String toCurrency) {
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
        return toCurrency;
    }
}