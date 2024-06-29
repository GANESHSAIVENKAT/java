public class CurrencyUtils {
    public static double convertUSDToEUR(double usdAmount) {
        // Exchange rate may vary; this is a simplified example
        return usdAmount * 0.89;
    }
    
    public static double convertEURToUSD(double eurAmount) {
        // Exchange rate may vary; this is a simplified example
        return eurAmount * 1.12;
    }
}